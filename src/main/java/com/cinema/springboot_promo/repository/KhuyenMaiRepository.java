package com.cinema.springboot_promo.repository;

import com.cinema.springboot_promo.entity.KhuyenMai;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai, Long> {
    List<KhuyenMai> findByTieuDeContainingIgnoreCase(String tieuDe);
}
