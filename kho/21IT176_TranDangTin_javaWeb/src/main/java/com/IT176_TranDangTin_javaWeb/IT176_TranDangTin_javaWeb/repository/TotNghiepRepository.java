package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TotNghiepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotNghiepRepository extends JpaRepository<TotNghiepEntity, String> {
    // Các phương thức cần thiết cho repository có thể được thêm vào đây
}
