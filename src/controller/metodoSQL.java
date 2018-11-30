package controller;

import conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import models.Alumno;
import models.Profesor;
import view.Variables;
import view.ventanaOpcionesAlumno;
import view.vOpcionesProfesor;

/**
 *
 * @author sam
 */

public class metodoSQL {

    /**
     * Metodo para el logueo del usuario
     *
     * @param profe
     * @return
     */
    public int validarLogueo(Profesor profe) {

        // FIXME: Arreglar este metodo porque no entra a BD
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        int resultado = 0;

        try {
            String usuario = profe.getUsuario();
            System.out.println(usuario);

            String pass = String.valueOf(profe.getPassword());
            System.out.println(pass);

            String sql = " SELECT * FROM profesor WHERE usuario = ? and password = ? ";
            PreparedStatement preparedstatement = connection.prepareStatement(sql);

            preparedstatement.setString(1, profe.getUsuario());
            preparedstatement.setString(2, profe.getPassword());

            ResultSet resultset = preparedstatement.executeQuery();

            if (resultset.next()) {
                Variables.idProfesor = resultset.getInt("id");
                
                vOpcionesProfesor vProfesor = new vOpcionesProfesor();
                vProfesor.setVisible(true);
                //ventanaOpcionesProfesor voProfesor = new ventanaOpcionesProfesor();
                //voProfesor.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Error, vuelve a intentarlo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error en el codigo, metodo validar " + e.getMessage());
        }

        return 0;
    }

    // TODO: Crear el login de los alumnos, ya que no se tenia nada de nada
    public int validarLogueoAlumno(Alumno alumno) {
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        int resultado = 0;

        try {
            String usuario = alumno.getIdAlumno();
            System.out.println(usuario);

            String sql = "SELECT * FROM alumno WHERE idAlumno = ? ";
            PreparedStatement preparedstatement = connection.prepareStatement(sql);

            preparedstatement.setString(1, alumno.getIdAlumno());
            ResultSet resultset = preparedstatement.executeQuery();

            if (resultset.next()) {
                resultado = 1;

                if (resultado == 1) {
                    ventanaOpcionesAlumno voAlumno = new ventanaOpcionesAlumno();
                    voAlumno.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, vuelve a intentarlo");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error en el codigo, metodo validar " + e.getMessage());
        }
        return 0;
    }
}
