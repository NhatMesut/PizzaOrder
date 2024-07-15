package com.pizza.api.service;

import com.pizza.api.entity.SanPham;
import com.pizza.api.repository.SanPhamRepository;
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
