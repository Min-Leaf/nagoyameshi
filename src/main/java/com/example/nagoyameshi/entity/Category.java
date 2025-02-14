package com.example.nagoyameshi.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.ToString;

// カテゴリ用のモデル
@Entity
@Table(name = "categories")
@Data
@ToString(exclude = "categoriesRestaurants")
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;

   @Column(name = "name")
   private String name;
   
   // 中間エンティティCategoryRestaurant.javaを追加した、カスケード削除を有効にする
   @OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
   private List<CategoryRestaurant> categoriesRestaurants;  
}