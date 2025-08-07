package com.mycompany.registroescolar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/estudiante_app";
        String usuario = "root";  // tu usuario
        String clave = "root"; // tu contraseña

        try (Connection conn = DriverManager.getConnection(url, usuario, clave)) {
            System.out.println("Conexion exitosa a MySQL");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
