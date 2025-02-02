package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.dto.Form2Dto;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.SinhVienEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.SinhVienRepository;

@Service
public class SinhVienService {

    private final SinhVienRepository sinhVienRepository;

    @Autowired
    public SinhVienService(SinhVienRepository sinhVienRepository) {
        this.sinhVienRepository = sinhVienRepository;
    }

    @Transactional
    public void save(SinhVienEntity sinhVien) {
        sinhVienRepository.save(sinhVien);
    }

    public List<SinhVienEntity> findByHoTen(String hoTen) {
        return sinhVienRepository.findByHoTenContaining(hoTen);
    }
    
    public List<Form2Dto> searchByHoTen(String hoTen) {
        List<Object[]> searchResults = sinhVienRepository.searchByHoTen(hoTen);
        List<Form2Dto> dtos = new ArrayList<>();
        for (Object[] record : searchResults) {
            Form2Dto dto = new Form2Dto(
                (String) record[0], // soCMND
                (String) record[1], // hoTen
                // xử lý null cho các trường có thể là null
                record[2] != null ? (String) record[2] : "", // maNganhTotNghiep
                record[3] != null ? (String) record[3] : "", // maTruongTotNghiep
                record[4] != null ? (String) record[4] : "", // maNganhCongTy
                record[5] != null ? (String) record[5] : "", // tenCongTy
                (Integer) record[6] // thoiGianLamViec
            );
            dtos.add(dto);
        }
        return dtos;
    }
}
