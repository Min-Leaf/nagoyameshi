package com.example.nagoyameshi.form;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;

// カテゴリ編集用のフォームクラス
@Data
public class CategoryEditForm {
   @NotBlank
   private String name;
}