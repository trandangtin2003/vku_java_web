package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.dto.Form2Dto;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.KhachHangEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.KhachHangRepository;

@Service
public class KhachHangService {

	private final KhachHangRepository khachHangRepository;

	@Autowired
	public KhachHangService(KhachHangRepository khachHangRepository) {
		this.khachHangRepository = khachHangRepository;
	}

	@Transactional
	public void save(KhachHangEntity khachHang) {
		khachHangRepository.save(khachHang);
	}

//    public List<KhachHangEntity> findByHoTen(String hoTen) {
//        return khachHangRepository.findByHoTenContaining(hoTen);
//    }

	public List<KhachHangEntity> searchBysoDienThoai(String soDienThoai) {
        return khachHangRepository.getBysoDienThoai(soDienThoai);
    }
	
//	public List<Form2Dto> searchBySDT(String soDienThoai) {
//        List<Object[]> searchResults = khachHangRepository.searchBySDT(soDienThoai);
//        List<Form2Dto> dtos = new ArrayList<>();
//        for (Object[] record : searchResults) {
//            Form2Dto dto = new Form2Dto(
//            	(String) record[0], 
//                record[1] != null ? (Date) record[1] : "", 
//                record[2] != null ? (String) record[2] : "", 
//                record[3] != null ? (String) record[3] : "", 
//                record[4] != null ? (Date) record[4] : "",
//                record[5] != null ? (String) record[5] : "", 
//                record[6] != null ? (String) record[6] : ""
//            );
//            dtos.add(dto);
//        }
//        return dtos;
//    }
}
