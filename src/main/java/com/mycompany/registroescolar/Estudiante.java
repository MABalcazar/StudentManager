/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registroescolar;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MichBalcazar
 */
public class Estudiante {

 // Atributos privados: nombre, edad, email, 3 calificaciones
// Métodos: getters y setters, constructor, calcularPromedio()
    
    // un atributo es una variable que define a la clase 
    // creamos 3 atributos 
    private String nombre;
    private int edad;
    private String email;
    // Semestre → Materia → Calificación
    private Map<Integer, Map<String, Integer>> notasPorSemestre = new HashMap<>();
    
    
    public Estudiante(){
//NO SON NECESARIAS SOLO PARA INDICAR QUE LOS VALORES SE INICILAIZAN 
//    String nombre = "";
//    int edad = 0;
//    String email = "";
//    int calificacion1 = 0;
//    int calificacion2 = 0;
//    int calificacion3 = 0;
//    
    }

    //los constructores nos permite inicializar los valores de los atributos
    public Estudiante(String nombre, int edad, String email) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        
        //inicializamos cada estudiante en semestre uno usando HashMap
        Map<String, Integer> materiasVacias = new HashMap<>();
        notasPorSemestre.put(1, materiasVacias);
    }

    //getters obtienen un atributo

    public void setNotasPorSemestre(Map<Integer, Map<String, Integer>> notasPorSemestre) {
        this.notasPorSemestre = notasPorSemestre;
    }

    public Map<Integer, Map<String, Integer>> getNotasPorSemestre() {
        return notasPorSemestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "nombre: " + nombre + "\n" + 
                "edad: " + edad +  "\n" + 
                "email: " +email +  "\n" ;

    } 
    

}
