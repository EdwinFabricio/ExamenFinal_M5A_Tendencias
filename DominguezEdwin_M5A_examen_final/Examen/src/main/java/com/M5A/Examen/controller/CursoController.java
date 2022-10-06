/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.M5A.Examen.controller;


import com.M5A.Examen.entity.Curso;
import com.M5A.Examen.service.CursoService;
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
public class CursoController {
    
      @Autowired
    private CursoService cursoService;
    
    @GetMapping("/listarcursos")
    public ResponseEntity<List<Curso>> listarPantalones() {
        
        return new ResponseEntity<>(cursoService.findAll(), HttpStatus.OK);
        
    }

    //metodo para crear los pantalones
    @PostMapping("/creardecurso")
    public ResponseEntity<Curso> crearPantalon(@RequestBody Curso d) {
        
        return new ResponseEntity<>(cursoService.crearP(d), HttpStatus.OK);
        
    }
    
    @GetMapping("/buscarCurso/{id}")
    public ResponseEntity<Curso> listar_id(@PathVariable Long id) {
        
        return new ResponseEntity<>(cursoService.findById(id), HttpStatus.OK);
        
    }
    
    @DeleteMapping("/eliminarCurso/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        
       cursoService.eliminar(id);
    }
    
    @PutMapping("/actualizarCurso/{id}")
    public ResponseEntity<Curso> actualizarPantalones(@PathVariable Long id, @RequestBody Curso p) {
        
        Curso pt = buscarCurso(id);
        
        if (pt == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        } else {
            
            try {
                
               pt.setDescripcion(p.getDescripcion());
               pt.setNombre(p.getNombre());
               pt.setNivel(p.getNivel());
                
                return new ResponseEntity<>(cursoService.UpdateP(p), HttpStatus.CREATED);
                
            } catch (Exception e) {
                
                return new ResponseEntity<>(cursoService.UpdateP(p), HttpStatus.INTERNAL_SERVER_ERROR);
                
            }
            
        }
        
    }
    
    public Curso buscarCurso(Long id) {
        
        return cursoService.findById(id);
    }
    
    
}
