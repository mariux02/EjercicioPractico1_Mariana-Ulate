/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ejerciciopractico1.service.impl;

import com.Ejerciciopractico1.dao.librosDao;
import com.Ejerciciopractico1.domain.libros;
import com.Ejerciciopractico1.service.librosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class librosServiceImpl implements librosService {
    
    @Autowired
    private librosDao librosDao;
    
    @Transactional(readOnly=true)
    @Override
    public List<libros> getlibros() {
        var lista=librosDao.findAll();
        
        return lista;
    }
}