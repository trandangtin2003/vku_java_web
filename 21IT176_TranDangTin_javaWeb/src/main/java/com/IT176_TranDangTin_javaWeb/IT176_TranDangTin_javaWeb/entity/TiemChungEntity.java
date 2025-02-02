package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TIEMCHUNG")
public class TiemChungEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaTC")
    private Long maTC; 
	
    @Column(name = "MaKH", nullable = false)
    private String maKH;

    @Column(name = "MaLieuVX", nullable = false)
    private String maLieuVX;

    @Column(name = "NgayTiem")
    private java.sql.Date ngayTiem;
    
    @Column(name = "NgayNhacHen")
    private java.sql.Date ngayNhacHen;

    @Column(name = "SucKhoeSauTiem")
    private String sucKhoeSauTiem;

    @Column(name = "DanhGia")
    private String danhGia;

    @ManyToOne
    @JoinColumn(name = "MaKH", referencedColumnName = "MaKH", insertable = false, updatable = false)
    private KhachHangEntity khachhang;

    @ManyToOne
    @JoinColumn(name = "MaLieuVX", referencedColumnName = "MaLieuVX", insertable = false, updatable = false)
    private LieuVacXinEntity lieuvacxin;

	public Long getMaTC() {
		return maTC;
	}

	public void setMaTC(Long maTC) {
		this.maTC = maTC;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getMaLieuVX() {
		return maLieuVX;
	}

	public void setMaLieuVX(String maLieuVX) {
		this.maLieuVX = maLieuVX;
	}

	public java.sql.Date getNgayTiem() {
		return ngayTiem;
	}

	public void setNgayTiem(java.sql.Date ngayTiem) {
		this.ngayTiem = ngayTiem;
	}

	public java.sql.Date getNgayNhacHen() {
		return ngayNhacHen;
	}

	public void setNgayNhacHen(java.sql.Date ngayNhacHen) {
		this.ngayNhacHen = ngayNhacHen;
	}

	public String getSucKhoeSauTiem() {
		return sucKhoeSauTiem;
	}

	public void setSucKhoeSauTiem(String sucKhoeSauTiem) {
		this.sucKhoeSauTiem = sucKhoeSauTiem;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	public KhachHangEntity getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(KhachHangEntity khachhang) {
		this.khachhang = khachhang;
	}

	public LieuVacXinEntity getLieuvacxin() {
		return lieuvacxin;
	}

	public void setLieuvacxin(LieuVacXinEntity lieuvacxin) {
		this.lieuvacxin = lieuvacxin;
	}
    
    
}
