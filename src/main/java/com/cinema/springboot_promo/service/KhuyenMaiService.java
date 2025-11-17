package com.cinema.springboot_promo.service;

import com.cinema.springboot_promo.entity.KhuyenMai;
import com.cinema.springboot_promo.repository.KhuyenMaiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiService {

    private final KhuyenMaiRepository repo;

    public KhuyenMaiService(KhuyenMaiRepository repo) {
        this.repo = repo;
    }

    public List<KhuyenMai> findAll() {
        return repo.findAll();
    }

    public KhuyenMai save(KhuyenMai km) {
        return repo.save(km);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public KhuyenMai findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<KhuyenMai> searchByTitle(String keyword) {
        return repo.findByTieuDeContainingIgnoreCase(keyword);
    }
}
