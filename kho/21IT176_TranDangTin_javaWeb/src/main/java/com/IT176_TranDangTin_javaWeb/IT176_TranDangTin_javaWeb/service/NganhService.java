package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.NganhEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.NganhRepository;

@Service
public class NganhService {

    private final NganhRepository nganhRepository;

    @Autowired
    public NganhService(NganhRepository nganhRepository) {
        this.nganhRepository = nganhRepository;
    }

    public List<NganhEntity> findAllNganhs() {
        return nganhRepository.findAll();
    }

    // Thêm các phương thức service khác nếu cần
}
