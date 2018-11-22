/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conexion.Conexion;
import controller.DatosQuiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import models.Pregunta;

/**
 *
 * @author sam
 */
public class ventanaNivelesEjercicio extends javax.swing.JFrame {
        DatosQuiz datos = new DatosQuiz();
        List<Pregunta> preguntas=datos.validarPreguntasPrimerNivel();
    /**
     * Creates new form ventanaNivelesEjercicio
     */
    public ventanaNivelesEjercicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.setTitle("Nivel de los ejercicios");
        int idBotonComparaPreguntas = 1;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAccederNivel1 = new javax.swing.JButton();
        btnAccederNivel2 = new javax.swing.JButton();
        btnAccederNivel3 = new javax.swing.JButton();
        btnRegresarOpcionesAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor selecciona el nivel para comenzar");

        jLabel2.setText("Nivel 1");

        jLabel3.setText("Nivel 2");

        jLabel4.setText("Nivel 3");

        jLabel5.setText("Faciles y sencillas");

        jLabel6.setText("Intermedio Avanzado");

        jLabel7.setText("Con cuidado, campeón");

        btnAccederNivel1.setText("Acceder");
        btnAccederNivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederNivel1ActionPerformed(evt);
            }
        });

        btnAccederNivel2.setText("Acceder");
        btnAccederNivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederNivel2ActionPerformed(evt);
            }
        });

        btnAccederNivel3.setText("Acceder");
        btnAccederNivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederNivel3ActionPerformed(evt);
            }
        });

        btnRegresarOpcionesAlumno.setText("<<Regresar");
        btnRegresarOpcionesAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarOpcionesAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccederNivel1)
                        .addGap(169, 169, 169)
                        .addComponent(btnAccederNivel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(btnAccederNivel3)
                        .addGap(88, 88, 88))))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRegresarOpcionesAlumno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccederNivel1)
                    .addComponent(btnAccederNivel2)
                    .addComponent(btnAccederNivel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnRegresarOpcionesAlumno)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederNivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederNivel1ActionPerformed
        
        ventanaQuiz vQuiz = new ventanaQuiz(preguntas);
        vQuiz.setVisible(true);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_btnAccederNivel1ActionPerformed

    private void btnAccederNivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederNivel2ActionPerformed
        ventanaQuiz vQuiz = new ventanaQuiz(preguntas);
        vQuiz.setVisible(true);
        this.dispose();
        
        DatosQuiz datos = new DatosQuiz();
        datos.validarPreguntasSegundoNivel();
    }//GEN-LAST:event_btnAccederNivel2ActionPerformed

    private void btnAccederNivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederNivel3ActionPerformed
        ventanaQuiz vQuiz = new ventanaQuiz(preguntas);
        vQuiz.setVisible(true);
        this.dispose();
        
        DatosQuiz datos = new DatosQuiz();
        datos.validarPreguntasTercerNivel();
        
    }//GEN-LAST:event_btnAccederNivel3ActionPerformed

    private void btnRegresarOpcionesAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarOpcionesAlumnoActionPerformed
       ventanaOpcionesAlumno vOAlumno = new ventanaOpcionesAlumno();
       vOAlumno.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegresarOpcionesAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaNivelesEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaNivelesEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaNivelesEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaNivelesEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaNivelesEjercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccederNivel1;
    private javax.swing.JButton btnAccederNivel2;
    private javax.swing.JButton btnAccederNivel3;
    private javax.swing.JButton btnRegresarOpcionesAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    
}
