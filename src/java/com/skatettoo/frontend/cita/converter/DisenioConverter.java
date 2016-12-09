/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatettoo.frontend.cita.converter;

import com.skatettoo.backend.persistence.entities.Disenio;
import com.skatettoo.frontend.util.AbstractConvertidores;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Persa
 */
@FacesConverter(forClass = Disenio.class)
public class DisenioConverter extends AbstractConvertidores{
    
    public DisenioConverter(){
        this.nombreMB = "disenioManagedBean"; 
    }
}
