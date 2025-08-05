/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registroescolar;

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
    private int calificacion1;
    private int calificacion2;
    private int calificacion3;
    private String materia1;
     private String materia2;
      private String materia3;
    
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
    public Estudiante(String nombre, int edad, String email, int calificacion1, int calificacion2, int calificacion3, String materia1, String materia2, String materia3) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
        
    }

    //getters obtienen un atributo

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

    public int getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(int calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public int getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(int calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public int getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(int calificacion3) {
        this.calificacion3 = calificacion3;
    }
    
    public double CalcularPromedio(){
        
        double suma = calificacion1 + calificacion2 + calificacion3;
        double promedio = suma/3;
        return promedio;
        
    
    }
    
    @Override
    public String toString(){
        return "nombre: " + nombre + "\n" + 
                "edad: " + edad +  "\n" + 
                "email: " +email +  "\n" + 
                "calificacion1 en " + materia1 + ":"+ calificacion1 +  "\n" +  
                "calificacion2 en " + materia2 + ":"+ calificacion2 +  "\n" + 
                "calificacion3 en " + materia3 + ":"+ calificacion3;
    } 
    

}
