/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.service;

import com.M5A.Examen.entity.Depto;
import com.M5A.Examen.repository.DeptoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL_USER
 */
@Service
public class DeptoServiceImpl implements DeptoService {

    @Autowired
    private DeptoRepository deptoRepository;
    
    
    @Override
    public Depto crearP(Depto c) {
        return deptoRepository.save(c);
    }

    @Override
    public Depto UpdateP(Depto update) {
        return deptoRepository.save(update);
    }

    @Override
    public Depto findById(Long id) {
        return deptoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Depto> findAll() {
        return deptoRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
deptoRepository.deleteById(id);
    }
    
}
