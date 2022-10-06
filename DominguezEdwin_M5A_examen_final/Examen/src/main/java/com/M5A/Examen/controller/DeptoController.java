/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.controller;

import com.M5A.Examen.entity.Depto;
import com.M5A.Examen.entity.Profesor;
import com.M5A.Examen.service.DeptoService;
import com.M5A.Examen.service.ProfesorService;
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
public class DeptoController {
    
    @Autowired
    private DeptoService deptoService;
    
    @GetMapping("/listardept")
    public ResponseEntity<List<Depto>> listarPantalones() {
        
        return new ResponseEntity<>(deptoService.findAll(), HttpStatus.OK);
        
    }

    //metodo para crear los pantalones
    @PostMapping("/creardepart")
    public ResponseEntity<Depto> crearPantalon(@RequestBody Depto d) {
        
        return new ResponseEntity<>(deptoService.crearP(d), HttpStatus.OK);
        
    }
    
    @GetMapping("/buscarDept/{id}")
    public ResponseEntity<Depto> listar_id(@PathVariable Long id) {
        
        return new ResponseEntity<>(deptoService.findById(id), HttpStatus.OK);
        
    }
    
    @DeleteMapping("/eliminarDept/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        
        deptoService.eliminar(id);
    }
    
    @PutMapping("/actualizarDept/{id}")
    public ResponseEntity<Depto> actualizarPantalones(@PathVariable Long id, @RequestBody Depto p) {
        
        Depto pt = buscarDepto(id);
        
        if (pt == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        } else {
            
            try {
                
                pt.setDescripcion(p.getDescripcion());
                pt.setDirector(p.getDirector());
                pt.setNombre(p.getNombre());
                
                return new ResponseEntity<>(deptoService.UpdateP(p), HttpStatus.CREATED);
                
            } catch (Exception e) {
                
                return new ResponseEntity<>(deptoService.UpdateP(p), HttpStatus.INTERNAL_SERVER_ERROR);
                
            }
            
        }
        
    }
    
    public Depto buscarDepto(Long id) {
        
        return deptoService.findById(id);
    }
    
}
