package com.example.Notificacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Notificacion.model.Noti;

public interface NotiRepository extends JpaRepository<Noti,Long> {
    
}
