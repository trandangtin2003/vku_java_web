package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TiemChungEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.TiemChungRepository;

@Service
public class TiemChungService {

    private final TiemChungRepository tiemChungRepository;

    @Autowired
    public TiemChungService(TiemChungRepository tiemChungRepository) {
        this.tiemChungRepository = tiemChungRepository;
    }

    @Transactional
    public void save(TiemChungEntity tiemChung) {
    	tiemChungRepository.save(tiemChung);
    }
//    @Transactional
//	public List<TiemChungEntity> searchByID(String soCMND) {
//		
//		return tiemChungRepository.getByID(soCMND);
//	}

    // Thêm các phương thức service khác nếu cần
}
