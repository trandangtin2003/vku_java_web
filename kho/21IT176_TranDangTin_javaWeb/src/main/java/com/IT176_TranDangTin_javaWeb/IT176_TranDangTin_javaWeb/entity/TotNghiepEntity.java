package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TotNghiep")
public class TotNghiepEntity {
    @Id
    @Column(name = "SoCMND", nullable = false)
    private String soCMND;

    @Column(name = "MaTruong", nullable = false)
    private String maTruong;

    @Column(name = "MaNganh", nullable = false)
    private String maNganh;

    @Column(name = "HeTN")
    private String heTN;

    @Column(name = "NgayTN")
    private java.sql.Date ngayTN;

    @Column(name = "LoaiTN")
    private String loaiTN;

    @ManyToOne
    @JoinColumn(name = "SoCMND", referencedColumnName = "SoCMND", insertable = false, updatable = false)
    private SinhVienEntity sinhVien;

    @ManyToOne
    @JoinColumn(name = "MaTruong", referencedColumnName = "MaTruong", insertable = false, updatable = false)
    private TruongEntity truong;

    @ManyToOne
    @JoinColumn(name = "MaNganh", referencedColumnName = "MaNganh", insertable = false, updatable = false)
    private NganhEntity nganh;

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getHeTN() {
		return heTN;
	}

	public void setHeTN(String heTN) {
		this.heTN = heTN;
	}

	public java.sql.Date getNgayTN() {
		return ngayTN;
	}

	public void setNgayTN(java.sql.Date ngayTN) {
		this.ngayTN = ngayTN;
	}

	public String getLoaiTN() {
		return loaiTN;
	}

	public void setLoaiTN(String loaiTN) {
		this.loaiTN = loaiTN;
	}

	public SinhVienEntity getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVienEntity sinhVien) {
		this.sinhVien = sinhVien;
	}

	public TruongEntity getTruong() {
		return truong;
	}

	public void setTruong(TruongEntity truong) {
		this.truong = truong;
	}

	public NganhEntity getNganh() {
		return nganh;
	}

	public void setNganh(NganhEntity nganh) {
		this.nganh = nganh;
	}

    
}
