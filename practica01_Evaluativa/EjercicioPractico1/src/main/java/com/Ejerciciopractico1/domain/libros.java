/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ejerciciopractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="libros")
public class libros implements Serializable{
    
       private static final long serialVersionUID = 1L; //incrementación, de uno en uno
    
    @Id /* primary key de la base de datos */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="autor")
    private String autor;
    @Column(name="precio")
    private String precio;
    @Column(name="categoria")
    private String categoria;

    public libros() { /* constructor de la base que está vacio */
    }

     public libros(Long id, String titulo, String autor, String precio, String categoria) { //me devuelve las descripciones
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
    }
}
    

