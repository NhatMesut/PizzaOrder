package com.pizza.pizzaorder.repository;

import com.pizza.pizzaorder.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SanPhamRepository extends JpaRepository<SanPham, UUID> {
}
