/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Entrenador {
    private int idEntrenador;
    private String nombreEntrenador;
    private ArrayList<Pokemon> pokemonesBatalla;
    private Inventario inventarioEntrenador;

    public Entrenador(int idEntrenador, String nombreEntrenador, ArrayList<Pokemon> pokemonesBatalla, Inventario inventarioEntrenador) {
        this.idEntrenador = idEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.pokemonesBatalla = pokemonesBatalla;
        this.inventarioEntrenador = inventarioEntrenador;
    }
    
    

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public ArrayList<Pokemon> getPokemonesBatalla() {
        return pokemonesBatalla;
    }

    public Inventario getInventarioEntrenador() {
        return inventarioEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public void setPokemonesBatalla(ArrayList<Pokemon> pokemonesBatalla) {
        this.pokemonesBatalla = pokemonesBatalla;
    }

    public void setInventarioEntrenador(Inventario inventarioEntrenador) {
        this.inventarioEntrenador = inventarioEntrenador;
    }


    
    
    
}
