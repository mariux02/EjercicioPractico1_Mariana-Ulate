/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ejerciciopractico1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Ejerciciopractico1.service.librosService;

@Controller
@Slf4j
@RequestMapping("/libros") 
public class librosController {
    
    @Autowired
    private librosService librosService;

    @GetMapping("/listado")
    public String inicio(Model model) { //recibe un modelo de tipo modelo
        var libros = librosService.getlibros();
    
        model.addAttribute("libros", libros);
        model.addAttribute("totalLibros", libros.size());
        return "/libros/listado";
    }
}
