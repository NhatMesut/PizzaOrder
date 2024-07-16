package com.pizza.pizzaorder.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.util.UUID;

@Entity
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SanPham", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Ten", nullable = false)
    private String ten;

    @Nationalized
    @Lob
    @Column(name = "MoTa")
    private String moTa;

    @ColumnDefault("0")
    @Column(name = "Gia", nullable = false)
    private Integer gia;

    @Lob
    @Column(name = "Anh")
    private String anh;

    @ColumnDefault("0")
    @Column(name = "TrangThai", nullable = false)
    private Integer trangThai;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

}