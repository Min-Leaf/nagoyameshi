package com.example.nagoyameshi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.Reservation;
import com.example.nagoyameshi.entity.User;

// 予約用のリポジトリ
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
   public Page<Reservation> findByUserOrderByReservedDatetimeDesc(User user, Pageable pageable);
   public Reservation findFirstByOrderByIdDesc();
}