/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.M5A.Examen.repository;

import com.M5A.Examen.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL_USER
 */
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
