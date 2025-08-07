/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.registroescolar;

/**
 *
 * @author MichBalcazar
 */
public class Materia {
    private int id;
    private String nombre;
    private int semestre;

    
    //constructor vacio
 public Materia(){
 }

    public Materia(int id, String nombre, int semestre) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }
 
 
}
