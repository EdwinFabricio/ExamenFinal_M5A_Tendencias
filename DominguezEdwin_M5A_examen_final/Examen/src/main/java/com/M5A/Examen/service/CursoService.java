/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.service;

import com.M5A.Examen.entity.Curso;
import java.util.List;

/**
 *
 * @author DELL_USER
 */
public interface  CursoService {
    Curso crearP(Curso c);

    public Curso UpdateP(Curso update);

    public Curso findById(Long id);

    public List<Curso> findAll();

    public void eliminar(Long id);

}
