package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CongViec")
public class CongViecEntity {
    @Id
    @Column(name = "SoCMND", nullable = false)
    private String soCMND;

    @Column(name = "NgayVaoCongTy", nullable = false)
    private java.sql.Date ngayVaoCongTy;

    @Column(name = "MaNganh", nullable = false)
    private String maNganh;

    @Column(name = "TenCongViec", nullable = false)
    private String tenCongViec;

    @Column(name = "TenCongTy")
    private String tenCongTy;

    @Column(name = "DiaChiCongTy")
    private String diaChiCongTy;

    @Column(name = "ThoiGianLamViec")
    private Integer thoiGianLamViec;

    @ManyToOne
    @JoinColumn(name = "SoCMND", referencedColumnName = "SoCMND", insertable = false, updatable = false)
    private SinhVienEntity sinhVien;

    @ManyToOne
    @JoinColumn(name = "MaNganh", referencedColumnName = "MaNganh", insertable = false, updatable = false)
    private NganhEntity nganh;

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public java.sql.Date getNgayVaoCongTy() {
		return ngayVaoCongTy;
	}

	public void setNgayVaoCongTy(java.sql.Date ngayVaoCongTy) {
		this.ngayVaoCongTy = ngayVaoCongTy;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getDiaChiCongTy() {
		return diaChiCongTy;
	}

	public void setDiaChiCongTy(String diaChiCongTy) {
		this.diaChiCongTy = diaChiCongTy;
	}

	public Integer getThoiGianLamViec() {
		return thoiGianLamViec;
	}

	public void setThoiGianLamViec(Integer thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}

	public SinhVienEntity getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVienEntity sinhVien) {
		this.sinhVien = sinhVien;
	}

	public NganhEntity getNganh() {
		return nganh;
	}

	public void setNganh(NganhEntity nganh) {
		this.nganh = nganh;
	}

    
}
