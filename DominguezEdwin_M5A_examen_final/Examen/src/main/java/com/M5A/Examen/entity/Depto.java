/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author DELL_USER
 */
@Getter
@Setter
@Entity
public class Depto {
    
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depto_id;
   private String nombre;
   private String director;
   private String descripcion;
   
    
   
   
}
