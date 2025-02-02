package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.dto.Form2Dto;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.SinhVienEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.SinhVienService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.TotNghiepService;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {

	private final SinhVienService sinhVienService;
	private final TotNghiepService totNghiepService;

	@Autowired
	public SinhVienController(SinhVienService sinhVienService, TotNghiepService totNghiepService) {

		this.sinhVienService = sinhVienService;
		this.totNghiepService = totNghiepService;
	}

	@GetMapping("/form1")
	public String Form1(Model model) {
		model.addAttribute("dieu_huong", "form1");
		return "index";
	}

	@PostMapping("/search1")
	public String search1(@RequestParam("hoTen") String hoTen, Model model) {
		List<SinhVienEntity> sinhVienList = sinhVienService.findByHoTen(hoTen);
		model.addAttribute("sinhviens", sinhVienList);
		model.addAttribute("dieu_huong", "form1");
		return "index";
	}
	
	
	
	@GetMapping("/form2")
	public String Form2(Model model) {
		model.addAttribute("dieu_huong", "form2");
		return "index";
	}
	
	@PostMapping("/search2")
    public String search2(@RequestParam("hoTen") String hoTen, Model model) {
        List<Form2Dto> searchResults = sinhVienService.searchByHoTen(hoTen);
        model.addAttribute("ketqua", searchResults);
        System.out.println("form2 :"+ searchResults.toString());
        model.addAttribute("dieu_huong", "form2");
		return "index";
    }
}
