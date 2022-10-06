/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.controller;

import com.M5A.Examen.entity.Profesor;
import com.M5A.Examen.service.ProfesorService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL_USER
 */
@RestController
@RequestMapping("/api")
public class ProfesorController {
    
    @Autowired
    private ProfesorService profesorService;
    
    @GetMapping("/listarProfes")
    public ResponseEntity<List<Profesor>> listarPantalones() {
        
        return new ResponseEntity<>(profesorService.findAll(), HttpStatus.OK);
        
    }

    //metodo para crear los pantalones
    @PostMapping("/crearProfesores")
    public ResponseEntity<Profesor> crearPantalon(@RequestBody Profesor p) {
        
        return new ResponseEntity<>(profesorService.crearP(p), HttpStatus.OK);
        
    }
    
    @GetMapping("/buscarPorID/{id}")
    public ResponseEntity<Profesor> listar_id(@PathVariable Long id) {
        
        return new ResponseEntity<>(profesorService.findById(id), HttpStatus.OK);
        
    }
    
    @DeleteMapping("/eliminarProfe/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        
        profesorService.eliminar(id);
    }
    
    @PutMapping("/actualizarProfe/{id}")
    public ResponseEntity<Profesor> actualizarPantalones(@PathVariable Long id, @RequestBody Profesor p) {
        
        Profesor pt = buscarProfesor(id);
        
        if (pt == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        } else {
            
            try {
                
                pt.setNombre(p.getNombre());
                pt.setDireccion(p.getDireccion());
                pt.setTelefono(p.getTelefono());
                
                return new ResponseEntity<>(profesorService.UpdateP(pt), HttpStatus.CREATED);
                
            } catch (Exception e) {
                
                return new ResponseEntity<>(profesorService.UpdateP(pt), HttpStatus.INTERNAL_SERVER_ERROR);
                
            }
            
        }
        
    }
    
    public Profesor buscarProfesor(Long id) {
        
        return profesorService.findById(id);
    }
    
}
