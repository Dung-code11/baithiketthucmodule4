package com.cinema.springboot_promo.controller;

import com.cinema.springboot_promo.entity.KhuyenMai;
import com.cinema.springboot_promo.service.KhuyenMaiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/khuyenmai")
public class KhuyenMaiController {

    private final KhuyenMaiService service;

    public KhuyenMaiController(KhuyenMaiService service) {
        this.service = service;
    }

    @GetMapping
    public String index(Model model, @RequestParam(value = "search", required = false) String search) {
        if (search != null && !search.isEmpty()) {
            model.addAttribute("list", service.searchByTitle(search));
        } else {
            model.addAttribute("list", service.findAll());
        }
        return "index";
    }

    @GetMapping("/them")
    public String createForm(Model model) {
        model.addAttribute("km", new KhuyenMai());
        return "form";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        KhuyenMai km = service.findById(id);
        if (km == null) {
            return "redirect:/khuyenmai";
        }
        model.addAttribute("km", km);
        return "form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute KhuyenMai km) {

        if (km.getId() != null) {
            // Nếu có ID → update
            KhuyenMai existing = service.findById(km.getId());
            if (existing != null) {
                existing.setTieuDe(km.getTieuDe());
                existing.setNgayBatDau(km.getNgayBatDau());
                existing.setNgayKetThuc(km.getNgayKetThuc());
                existing.setMucGiamGia(km.getMucGiamGia());
                existing.setChiTiet(km.getChiTiet());
                service.save(existing);
            }
        } else {
            // Không ID → add mới
            service.save(km);
        }

        return "redirect:/khuyenmai";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/khuyenmai";
    }
}
