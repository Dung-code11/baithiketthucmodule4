package com.cinema.springboot_promo.dto;

import java.time.LocalDateTime;

public class KhuyenMaiDTO {
    private String tieuDe;
    private String chiTiet;
    private Double mucGiamGia;
    private LocalDateTime thoiGianBatDau;
    private LocalDateTime thoiGianKetThuc;

    // getters & setters
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getChiTiet() { return chiTiet; }
    public void setChiTiet(String chiTiet) { this.chiTiet = chiTiet; }

    public Double getMucGiamGia() { return mucGiamGia; }
    public void setMucGiamGia(Double mucGiamGia) { this.mucGiamGia = mucGiamGia; }

    public LocalDateTime getThoiGianBatDau() { return thoiGianBatDau; }
    public void setThoiGianBatDau(LocalDateTime thoiGianBatDau) { this.thoiGianBatDau = thoiGianBatDau; }

    public LocalDateTime getThoiGianKetThuc() { return thoiGianKetThuc; }
    public void setThoiGianKetThuc(LocalDateTime thoiGianKetThuc) { this.thoiGianKetThuc = thoiGianKetThuc; }
}
