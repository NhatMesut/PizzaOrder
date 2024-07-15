package com.pizza.api.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.UUID;

@Entity
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DanhMuc", nullable = false)
    private UUID id;

    @Nationalized
    @Column(name = "Ten", nullable = false)
    private String ten;

    @Lob
    @Column(name = "Anh")
    private String anh;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

}