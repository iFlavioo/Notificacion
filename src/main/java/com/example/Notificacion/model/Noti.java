package com.example.Notificacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table ( name = "notificacion") 

public class Noti {
    private Long idNotif;
    private Long destinatarioId; 
    private String tipo;         
    private String mensaje; 
    private String canal;        
    private boolean leido;
}
