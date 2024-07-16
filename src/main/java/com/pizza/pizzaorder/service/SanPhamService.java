package com.pizza.pizzaorder.service;

import com.pizza.pizzaorder.entity.SanPham;
import com.pizza.pizzaorder.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    public List<SanPham> GetAllSanPham(){
        return sanPhamRepository.findAll();
    }
}
