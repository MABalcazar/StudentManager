
package com.mycompany.registroescolar;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
// quiero registrar un estudiante con todos su datos 
// despues registar la calificacion de un estudiante en particular
//despues vincular las calificaciones a una materia
 
    
    public static void main(String args[]) {
        //lo que se hace con el new es instanciar la clase estudiante en un objeto 
        //objeto de tipo estudiante
       // Estudiante objeto = new Estudiante();
        menu(); //todo se hace desde aqui y abajo se creo uno nuevo objeto estudiante

       
    }
     static ArrayList<Estudiante> estudiantes = new ArrayList<>();
public static void menu() {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    try {
         do {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Registrar calificaciones");
        System.out.println("3. Buscar estudiante");
        System.out.println("4. Eliminar estudiante");
        System.out.println("5. Mostrar lista de estudiantes");
        System.out.println("0. Salir");
        System.out.print("Elige una opcion: ");

        opcion = Integer.parseInt(scanner.nextLine()); 
        try {
            
        } catch (Exception e) {
        }

        switch (opcion) {
            case 1:
                RegistrarEstudiante();
                break;
            case 2:
                RegistrarCalificaciones();
                break;
            case 3:
                BuscarEstudiante();
                break;
            case 4:
                EliminarEstudiante();
                break;
            case 5:
                MostrarEstudiantes();
                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opcion invalida. Intenta otra vez.");
        }

    } while (opcion != 0); 
    } catch (Exception e) {
        System.out.println("Elige una opcion");
    }
}

    
    public static void RegistrarEstudiante(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del estudiante");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa la edad del estudiante");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa el email del estudiante");
        String email = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre,edad,email);
        estudiantes.add(estudiante);

    }
    
    public static void RegistrarCalificaciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa ");
    
    }
    
    public static void RegistrarMaterias(){
        System.out.println("REGISTRAR MATERIAS");
        System.out.println("Ingresa nombre de la primer materia");
        System.out.println("Ingresa de la segunda materia");
        System.out.println("Ingresa nombre de la terecera materia");
    }
    
    public static void EliminarEstudiante(){
    }
       public static void BuscarEstudiante(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Ingresa el estudiante que quieres buscar");
           String buscarNombre = scanner.nextLine();
           
           boolean encontrado = false;
           
            for (int i = 0; i < estudiantes.size(); i++) {
                if(estudiantes.get(i).getNombre().equalsIgnoreCase(buscarNombre)){
                    System.out.println("Estudiante encontrado");
                    System.out.println(estudiantes.get(i)); //usa el toString
                    encontrado = true;
                    break;
                
                }
                if(!encontrado){
                    System.out.println("Estudiante no encontrado");
                
                }
           
               
           }
    }
    public static void MostrarEstudiantes(){
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i));
            
        }
    }
    
  public class Validaciones {

    public static boolean esNumero(String str) {
        return str != null && str.matches("[0-9]+");
    }

    public static boolean NombreValido(String str) {
        return str != null && str.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    public static boolean EmailValido(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    public static boolean noEstaVacio(String str) {
        return str != null && !str.trim().isEmpty();
    }
  }
}
