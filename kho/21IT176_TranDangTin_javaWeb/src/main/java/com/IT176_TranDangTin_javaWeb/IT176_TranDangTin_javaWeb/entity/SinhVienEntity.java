package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SinhVien")
public class SinhVienEntity {
    @Id
    @Column(name = "SoCMND", nullable = false)
    private String soCMND;

    @Column(name = "HoTen", nullable = false)
    private String hoTen;

    @Column(name = "Email")
    private String email;

    @Column(name = "SoDT")
    private String soDT;

    @Column(name = "DiaChi")
    private String diaChi;

    @OneToMany(mappedBy = "sinhVien")
    private Set<TotNghiepEntity> totNghiepEntities;

    @OneToMany(mappedBy = "sinhVien")
    private Set<CongViecEntity> congViecEntities;

    // Getters và setters
    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Set<TotNghiepEntity> getTotNghiepEntities() {
        return totNghiepEntities;
    }

    public void setTotNghiepEntities(Set<TotNghiepEntity> totNghiepEntities) {
        this.totNghiepEntities = totNghiepEntities;
    }

    public Set<CongViecEntity> getCongViecEntities() {
        return congViecEntities;
    }

    public void setCongViecEntities(Set<CongViecEntity> congViecEntities) {
        this.congViecEntities = congViecEntities;
    }
}
