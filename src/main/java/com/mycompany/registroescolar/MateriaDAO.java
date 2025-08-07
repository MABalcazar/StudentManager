/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.registroescolar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAO {
    private Connection conexion;

    public MateriaDAO(Connection conexion) {
        this.conexion = conexion;
    }

    // Obtener todas las materias
    public List<Materia> obtenerTodas() throws SQLException {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materias";
        //selecciona la tabla

        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Materia materia = new Materia(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getInt("semestre")
                    //agrega mas segun el modelo
            );
            materias.add(materia); // nombre de la base de datos
        }

        return materias;
    }
    //obtener todos los registros
    // Obtener materias por semestre
    public List<Materia> obtenerPorSemestre(int semestre) throws SQLException {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materias WHERE semestre = ?";

        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setInt(1, semestre);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Materia materia = new Materia(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getInt("semestre")
            );
            materias.add(materia);
        }

        return materias;
    }
}
//     // Buscar por ID o campo
//    public Entidad buscarPorId(int id) throws SQLException {
//        String sql = "SELECT * FROM nombre_tabla WHERE id = ?";
//        PreparedStatement stmt = conexion.prepareStatement(sql);
//        stmt.setInt(1, id);
//        ResultSet rs = stmt.executeQuery();
//
//        if (rs.next()) {
//            return new Entidad(
//                rs.getInt("columna1"),
//                rs.getString("columna2")
//                // ...
//            );
//        }
//        return null;
//    }
//
//    // Insertar un nuevo registro
//    public void insertar(Entidad entidad) throws SQLException {
//        String sql = "INSERT INTO nombre_tabla (columna1, columna2) VALUES (?, ?)";
//        PreparedStatement stmt = conexion.prepareStatement(sql);
//        stmt.setTipoDato(1, entidad.getCampo1()); // cambia setTipoDato por setInt, setString, etc.
//        stmt.setTipoDato(2, entidad.getCampo2());
//        stmt.executeUpdate();
//    }

//    // Actualizar un registro
//    public void actualizar(Entidad entidad) throws SQLException {
//        String sql = "UPDATE nombre_tabla SET columna1 = ?, columna2 = ? WHERE id = ?";
//        PreparedStatement stmt = conexion.prepareStatement(sql);
//        stmt.setTipoDato(1, entidad.getCampo1());
//        stmt.setTipoDato(2, entidad.getCampo2());
//        stmt.setInt(3, entidad.getId());
//        stmt.executeUpdate();
//    }
//
//    // Eliminar por ID
//    public void eliminar(int id) throws SQLException {
//        String sql = "DELETE FROM nombre_tabla WHERE id = ?";
//        PreparedStatement stmt = conexion.prepareStatement(sql);
//        stmt.setInt(1, id);
//        stmt.executeUpdate();
//    }
//}