
package com.Ejerciciopractico1.dao;

import com.Ejerciciopractico1.domain.libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface librosDao extends JpaRepository <libros,Long> {
    
}
