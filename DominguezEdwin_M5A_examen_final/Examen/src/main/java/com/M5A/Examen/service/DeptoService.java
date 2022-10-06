/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.M5A.Examen.service;

import com.M5A.Examen.entity.Depto;
import java.util.List;

/**
 *
 * @author DELL_USER
 */
public interface DeptoService {
     Depto crearP(Depto c);

    public Depto UpdateP(Depto update);

    public Depto findById(Long id);

    public List<Depto> findAll();

    public void eliminar(Long id);

}
