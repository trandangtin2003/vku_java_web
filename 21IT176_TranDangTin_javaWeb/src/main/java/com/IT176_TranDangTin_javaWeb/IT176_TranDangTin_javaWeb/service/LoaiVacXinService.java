package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.LoaiVacXinEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.LoaiVacXinRepository;

@Service
public class LoaiVacXinService {

    private final LoaiVacXinRepository loaiVacXinRepository;

    @Autowired
    public LoaiVacXinService(LoaiVacXinRepository loaiVacXinRepository) {
        this.loaiVacXinRepository = loaiVacXinRepository;
    }

    public List<LoaiVacXinEntity> findAll() {
    	System.out.println(loaiVacXinRepository.findAll().toString());
        return loaiVacXinRepository.findAll();
    }

    // Thêm các phương thức service khác nếu cần
}
