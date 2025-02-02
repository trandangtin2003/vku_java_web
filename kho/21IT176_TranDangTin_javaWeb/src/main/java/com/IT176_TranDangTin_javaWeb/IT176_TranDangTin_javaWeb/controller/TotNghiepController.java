package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.SinhVienEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TotNghiepEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.SinhVienService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.TotNghiepService;

@Controller
@RequestMapping("/totnghiep")
public class TotNghiepController {

	
	private final TotNghiepService totNghiepService;
	private final SinhVienService sinhVienService;

	@Autowired
	public TotNghiepController(TotNghiepService totNghiepService, SinhVienService sinhVienService) {
		this.totNghiepService = totNghiepService;
		this.sinhVienService = sinhVienService;
	}

	@PostMapping
	public ModelAndView handleTotNghiep(RedirectAttributes redirectAttributes,
			@ModelAttribute TotNghiepEntity totnghiep, @RequestParam("soCMND") String soCMND,
			@RequestParam("hoTen") String hoTen, @RequestParam("diaChi") String diaChi,
			@RequestParam("email") String email, @RequestParam("soDT") String soDT) {
		SinhVienEntity sinhVien = new SinhVienEntity();
		sinhVien.setSoCMND(soCMND); // Gán giá trị soCMND
		sinhVien.setHoTen(hoTen);
		sinhVien.setDiaChi(diaChi);
		sinhVien.setEmail(email);
		sinhVien.setSoDT(soDT);

		sinhVienService.save(sinhVien);
		totnghiep.setSinhVien(sinhVien);
		totNghiepService.save(totnghiep);
		redirectAttributes.addFlashAttribute("message", "Thông tin tốt nghiệp đã được lưu thành công!");

		return new ModelAndView("redirect:/");
	}

}
