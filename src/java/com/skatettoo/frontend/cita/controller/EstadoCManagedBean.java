/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skatettoo.frontend.cita.controller;

import com.skatettoo.backend.persistence.entities.EstadoCita;
import com.skatettoo.backend.persistence.facade.EstadoCitaFacadeLocal;
import com.skatettoo.frontend.util.Managedbean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author Persa
 */
@Named(value = "estadoCManagedBean")
@SessionScoped
public class EstadoCManagedBean implements Serializable, Managedbean <EstadoCita>{

    private EstadoCita estci;
    @EJB
    private EstadoCitaFacadeLocal etcfl;
    
    public EstadoCManagedBean() {
    }

    public EstadoCita getEstci() {
        return estci;
    }

    public void setEstci(EstadoCita estci) {
        this.estci = estci;
    }
    
    @PostConstruct
    public void init(){
        estci = new EstadoCita();
    }
    
    public List<EstadoCita> listarEstadoCita(){
        return etcfl.findAll();
    }

    @Override
    public EstadoCita getObject(Integer i) {
        return etcfl.find(i);
    }
}
