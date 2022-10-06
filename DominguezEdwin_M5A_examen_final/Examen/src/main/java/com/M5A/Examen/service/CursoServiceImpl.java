/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.service;

import com.M5A.Examen.entity.Curso;
import com.M5A.Examen.repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL_USER
 */
@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoRepository cursoRepository;
    
    
    @Override
    public Curso crearP(Curso c) {

        return cursoRepository.save(c);

    }

    @Override
    public Curso UpdateP(Curso update) {


        return cursoRepository.save(update);


    }

    @Override
    public Curso findById(Long id) {

        return cursoRepository.findById(id).orElse(null);

    }

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {

cursoRepository.deleteById(id);
    }
    
}
