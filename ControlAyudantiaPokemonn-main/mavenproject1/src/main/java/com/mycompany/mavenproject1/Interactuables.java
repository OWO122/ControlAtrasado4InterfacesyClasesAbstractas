/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Sala-2-11-PC16
 */
public abstract class Interactuables {
    
    protected int idObjeto;
    protected String nombreObjeto;

    public Interactuables(int idObjeto, String nombreObjeto) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
    }
    
    public Interactuables(){
        
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }


    
    
    
}