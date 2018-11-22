/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Pregunta;
import models.Respuesta;

public class DatosQuiz {

    public List<Pregunta> validarPreguntasPrimerNivel() {
        //TODO: Obtener las 10 primeras preguntas
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
        
        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM ejercicios WHERE nivel =  1 ");
            ResultSet rs = preparedstatement.executeQuery();

            while (rs.next()) {
                ArrayList<Respuesta> respuesta = new ArrayList<Respuesta>();
                Respuesta baseRespuesta = new Respuesta();
                Pregunta pregunta = new Pregunta();
                
                pregunta.setId(rs.getInt("numEjercicio"));
                pregunta.setLevel(rs.getInt("nivel"));
                pregunta.setText(rs.getString("descripcion"));
                baseRespuesta.setResultado(rs.getInt("resultado"));
                
                respuesta.add(baseRespuesta);
                pregunta.setRespuestas(respuesta);
                listaPreguntas.add(pregunta);
            }
        } catch (Exception e) {
            System.out.println("Algo paso y yo no se que fue" + e.getMessage());
        }
        return listaPreguntas;
    }

    public List<Pregunta> validarPreguntasSegundoNivel() {
        //TODO: Obtener las 10 primeras preguntas
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        List<Pregunta> listaPreguntasSN = new ArrayList<Pregunta>();

        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM ejercicios WHERE nivel =  2 ");
            ResultSet rs = preparedstatement.executeQuery();

            while (rs.next()) {
                ArrayList<Respuesta> respuestaSN = new ArrayList<Respuesta>();
                Respuesta baseRespuesta = new Respuesta();
                Pregunta pregunta = new Pregunta();
                
                pregunta.setId(rs.getInt("numEjercicio"));
                pregunta.setLevel(rs.getInt("nivel"));
                pregunta.setText(rs.getString("descripcion"));
                baseRespuesta.setResultado(rs.getInt("resultado"));
                respuestaSN.add(baseRespuesta);
                pregunta.setRespuestas(respuestaSN);
                listaPreguntasSN.add(pregunta);
            }
        } catch (Exception e) {
            System.out.println("Algo paso y no se que ocurrio" + e.getMessage());
        }
        return listaPreguntasSN;
    }

    public List<Pregunta> validarPreguntasTercerNivel() {
        //TODO: Obtener las 10 primeras preguntas
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        List<Pregunta> listaPreguntasTercerNivel = new ArrayList<Pregunta>();

        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM ejercicios WHERE nivel =  3 ");
            ResultSet rs = preparedstatement.executeQuery();

            while (rs.next()) {
                ArrayList<Respuesta> respuestaTercerNivel = new ArrayList<Respuesta>();
                Respuesta baseRespuesta = new Respuesta();
                Pregunta pregunta = new Pregunta();
                pregunta.setId(rs.getInt("numEjercicio"));
                pregunta.setLevel(rs.getInt("nivel"));
                pregunta.setText(rs.getString("descripcion"));
                baseRespuesta.setResultado(rs.getInt("resultado"));
                respuestaTercerNivel.add(baseRespuesta);
                pregunta.setRespuestas(respuestaTercerNivel);
                listaPreguntasTercerNivel.add(pregunta);
            }
        } catch (Exception e) {
            System.out.println("Algo paso y no se que ocurrio" + e.getMessage());
        }
        return listaPreguntasTercerNivel;
    }
}
