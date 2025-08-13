
package com.mycompany.registroescolar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class estudianteDAO {
      private Connection conexion;

    //constructor
    public estudianteDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    public  void InsertarEstudiante(Estudiante estudiante) throws SQLException{
        String sql = "INSERT INTO estudiante (nombre, edad, semestre) VALUES(?, ?, ?)";
        
        //insertar codigo de manera segura, se utiliza siempre
        PreparedStatement stmt = conexion.prepareStatement(sql);
         stmt.setString(1, estudiante.getNombre());
         stmt.setInt(2, estudiante.getEdad());
         stmt.setInt(3, 1);
         stmt.executeUpdate();

    
    }
      
 
}
