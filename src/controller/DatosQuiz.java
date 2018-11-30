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

    public List<Pregunta> getPreguntas(int Nivel) {
        //TODO: Obtener las 10 primeras preguntas
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();

        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM ejercicios WHERE nivel =  ? ");
            preparedstatement.setInt(1, Nivel);
            ResultSet rs = preparedstatement.executeQuery();

            while (rs.next()) {

                Pregunta pregunta = new Pregunta();

                pregunta.setId(rs.getInt("numEjercicio"));
                pregunta.setLevel(rs.getInt("nivel"));
                pregunta.setText(rs.getString("descripcion"));

                PreparedStatement preparedstatement2 = connection.prepareStatement(" SELECT * FROM respuestas WHERE numEjercicio =  ? ");
                preparedstatement2.setInt(1, pregunta.getId());
                ResultSet rs2 = preparedstatement2.executeQuery();

                ArrayList<Respuesta> respuestas = new ArrayList<>();
                while (rs2.next()) {
                    Respuesta respuesta = new Respuesta();
                    respuesta.setIsCorrect(rs2.getBoolean("isCorrecta")); ;
                    respuesta.setText(rs2.getString("valor"));
                    respuesta.setSelected(false);
                    respuestas.add(respuesta);
                }
                pregunta.respuestas = respuestas;
                listaPreguntas.add(pregunta);
                for(Pregunta preguntas : listaPreguntas){
                    System.out.println(pregunta.respuestas);
                }
            }
        } catch (Exception e) {
            System.out.println("Algo paso y yo no se que fue" + e.getMessage());
        }
        return listaPreguntas;
    }

}
