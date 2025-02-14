package com.example.nagoyameshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.Company;

// 会社概要用のリポジトリ
// idが最も大きい会社概要を取得する（idを基準に降順で並べ替え、最初の1件を取得する）
public interface CompanyRepository extends JpaRepository<Company, Integer> {
   public Company findFirstByOrderByIdDesc();
}