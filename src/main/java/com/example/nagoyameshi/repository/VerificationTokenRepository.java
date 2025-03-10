package com.example.nagoyameshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.VerificationToken;

//メール認証用のモデル
public interface VerificationTokenRepository extends JpaRepository< VerificationToken, Integer> {
   public VerificationToken findByToken(String token);
   // パスワード再設定の追加
   VerificationToken findByUserId(Integer userId);
}