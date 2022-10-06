/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.M5A.Examen.service;


import com.M5A.Examen.entity.Profesor;
import java.util.List;

/**
 *
 * @author DELL_USER
 */
public interface ProfesorService {
     Profesor crearP(Profesor c);

    public Profesor UpdateP(Profesor update);

    public Profesor findById(Long id);

    public List<Profesor> findAll();

    public void eliminar(Long id);
    
    
    
}
