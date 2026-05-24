package com.example.Notificacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Noti {
    private Long idNotif;
    private Long destinatarioId; 
    private String tipo;         
    private String mensaje; 
    private String canal;        
    private boolean leido;
}
