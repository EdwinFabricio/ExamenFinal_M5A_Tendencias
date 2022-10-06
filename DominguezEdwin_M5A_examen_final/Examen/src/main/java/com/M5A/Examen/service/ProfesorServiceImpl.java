/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.service;

import com.M5A.Examen.entity.Profesor;
import com.M5A.Examen.repository.ProfesorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL_USER
 */
@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;
    
    
    @Override
    public Profesor crearP(Profesor c) {
        return profesorRepository.save(c);
    }

    @Override
    public Profesor UpdateP(Profesor update) {


        return profesorRepository.save(update);


    }

    @Override
    public Profesor findById(Long id) {
        return profesorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        
        profesorRepository.deleteById(id);
    }
    
}
