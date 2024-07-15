package com.pizza.api.controller;

import com.pizza.api.entity.SanPham;
import com.pizza.api.service.SanPhamService;
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
