package com.example.nagoyameshi.form;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;

// カテゴリ登録用のフォームクラス
@Data
public class CategoryRegisterForm {
   @NotBlank
   private String name;
}