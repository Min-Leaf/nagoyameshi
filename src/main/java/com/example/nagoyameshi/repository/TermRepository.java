package com.example.nagoyameshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.Term;

// 利用規約用のリポジトリ
// idが最も大きい利用規約を取得する（idを基準に降順で並べ替え、最初の1件を取得する）
public interface TermRepository extends JpaRepository<Term, Integer> {
   public Term findFirstByOrderByIdDesc();
}