package com.pizza.pizzaorder.controller;

import com.pizza.pizzaorder.entity.SanPham;
import com.pizza.pizzaorder.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sanpham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/all")
    public List<SanPham> getAllSanPham() {
        return sanPhamService.GetAllSanPham();
    }
}
