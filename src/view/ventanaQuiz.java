package view;

import controller.DatosQuiz;
import java.util.List;
import javax.swing.JOptionPane;
import models.Pregunta;
import models.Respuesta;

public class ventanaQuiz extends javax.swing.JFrame {

    //Variables necesarias
    public List<Pregunta> preguntas;
    public List<Respuesta> respuestas;
    Pregunta pregunta;
    Respuesta respuesta;
    int contRespuestas;
    
    int posicion;
    DatosQuiz datosQuiz;
    
    public ventanaQuiz(int nivel) {
        datosQuiz = new DatosQuiz();
        this.posicion = 0;
        pregunta = null;
        respuesta = null;
        contRespuestas = 0;
        this.preguntas = datosQuiz.getPreguntas(nivel);
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Preguntas Quiz");
        btnAvanzar.setVisible(true);
        btnRegresar.setVisible(true);

        cargarPregunta();
    }

    private void cargarPregunta() {
        btnGrupoRespuesta.clearSelection();
        pregunta = preguntas.get(posicion);
        lblPreguntaMostrada.setText(pregunta.getText());

        rbtnOpcionRespuesta1.setText(pregunta.respuestas.get(0).getText());
        rbtnOpcionRespuesta1.setSelected(pregunta.respuestas.get(0).isSelected());

        rbtnOpcionRespuesta2.setText(pregunta.respuestas.get(1).getText());
        rbtnOpcionRespuesta2.setSelected(pregunta.respuestas.get(1).isSelected());

        rbtnOpcionRespuesta3.setText(pregunta.respuestas.get(2).getText());
        rbtnOpcionRespuesta3.setSelected(pregunta.respuestas.get(2).isSelected());

        rbtnOpcionRespuesta4.setText(pregunta.respuestas.get(3).getText());
        rbtnOpcionRespuesta4.setSelected(pregunta.respuestas.get(3).isSelected());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoRespuesta = new javax.swing.ButtonGroup();
        lblIndicacionesEjercicio = new javax.swing.JLabel();
        rbtnOpcionRespuesta1 = new javax.swing.JRadioButton();
        rbtnOpcionRespuesta2 = new javax.swing.JRadioButton();
        rbtnOpcionRespuesta3 = new javax.swing.JRadioButton();
        rbtnOpcionRespuesta4 = new javax.swing.JRadioButton();
        lblPreguntaMostrada = new javax.swing.JLabel();
        lblNombreFrame = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnTerminarExamen = new javax.swing.JButton();
        btnSalirQuiz = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();
        lblIndicacionesEjercicio1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIndicacionesEjercicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIndicacionesEjercicio.setText("¡Mucha Suerte! :D");
        getContentPane().add(lblIndicacionesEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 170, 28));

        btnGrupoRespuesta.add(rbtnOpcionRespuesta1);
        rbtnOpcionRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOpcionRespuesta1ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnOpcionRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        btnGrupoRespuesta.add(rbtnOpcionRespuesta2);
        rbtnOpcionRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOpcionRespuesta2ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnOpcionRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        btnGrupoRespuesta.add(rbtnOpcionRespuesta3);
        rbtnOpcionRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOpcionRespuesta3ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnOpcionRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        btnGrupoRespuesta.add(rbtnOpcionRespuesta4);
        rbtnOpcionRespuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOpcionRespuesta4ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnOpcionRespuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        lblPreguntaMostrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPreguntaMostrada.setText("¿Cuanto es 2+ 2?");
        getContentPane().add(lblPreguntaMostrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 720, 37));

        lblNombreFrame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombreFrame.setText("Cuestionario");
        getContentPane().add(lblNombreFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 18, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(102, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reg.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 160, 49));

        btnAvanzar.setBackground(new java.awt.Color(102, 255, 255));
        btnAvanzar.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        btnAvanzar.setForeground(new java.awt.Color(0, 0, 0));
        btnAvanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sig.png"))); // NOI18N
        btnAvanzar.setText("Avanzar");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 560, 150, 49));

        btnTerminarExamen.setBackground(new java.awt.Color(102, 255, 255));
        btnTerminarExamen.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        btnTerminarExamen.setForeground(new java.awt.Color(0, 0, 0));
        btnTerminarExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TerminarE.png"))); // NOI18N
        btnTerminarExamen.setText("Terminar Examen");
        btnTerminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarExamenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminarExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 270, 42));

        btnSalirQuiz.setBackground(new java.awt.Color(102, 255, 255));
        btnSalirQuiz.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        btnSalirQuiz.setForeground(new java.awt.Color(0, 0, 0));
        btnSalirQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalirQuiz.setText("Salir");
        btnSalirQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirQuizActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 130, -1));
        getContentPane().add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 236, 25));

        lblIndicacionesEjercicio1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIndicacionesEjercicio1.setText("Selecciona las respuestas correctas, solo una la correcta");
        getContentPane().add(lblIndicacionesEjercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 520, 28));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesQuiz/1 - 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 870, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirQuizActionPerformed
        //Volver al menu anterior
        ventanaNivelesEjercicio vNivelEjercicio = new ventanaNivelesEjercicio();
        vNivelEjercicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirQuizActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        if(rbtnOpcionRespuesta1.isSelected()){
            if(pregunta.respuestas.get(0).isIsCorrect()){
                contRespuestas++;
            }
        }
        if(rbtnOpcionRespuesta2.isSelected()){
            if(pregunta.respuestas.get(1).isIsCorrect()){
                contRespuestas++;
            }
        }
        if(rbtnOpcionRespuesta3.isSelected()){
            if(pregunta.respuestas.get(2).isIsCorrect()){
                contRespuestas++;
            }
        }
        if(rbtnOpcionRespuesta4.isSelected()){
            if(pregunta.respuestas.get(3).isIsCorrect()){
                contRespuestas++;
            }
        }
        
//int respSelecccionada = respuesta.
        
        
        if (posicion < preguntas.size() - 1) {
            posicion++;
            cargarPregunta();
            btnRegresar.setEnabled(true);
            
        } else {
            btnAvanzar.setEnabled(false);
            btnRegresar.setEnabled(true);
        }
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        if (posicion > 0) {
            posicion--;
        }
        if (posicion >= 0) {
            btnAvanzar.setEnabled(true);
            cargarPregunta();
        }
        if (posicion == 0) {
            btnRegresar.setEnabled(false);
            btnAvanzar.setEnabled(true);
        }
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    private void rbtnOpcionRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOpcionRespuesta1ActionPerformed
        pregunta.respuestas.get(0).setSelected(true);
        pregunta.respuestas.get(1).setSelected(false);
        pregunta.respuestas.get(2).setSelected(false);
        pregunta.respuestas.get(3).setSelected(false);
        //rbtnOpcionRespuesta1.getText();
    }//GEN-LAST:event_rbtnOpcionRespuesta1ActionPerformed

    private void rbtnOpcionRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOpcionRespuesta2ActionPerformed
        pregunta.respuestas.get(0).setSelected(false);
        pregunta.respuestas.get(1).setSelected(true);
        pregunta.respuestas.get(2).setSelected(false);
        pregunta.respuestas.get(3).setSelected(false); 
        //rbtnOpcionRespuesta2.getText();
    }//GEN-LAST:event_rbtnOpcionRespuesta2ActionPerformed

    private void rbtnOpcionRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOpcionRespuesta3ActionPerformed
        pregunta.respuestas.get(0).setSelected(false);
        pregunta.respuestas.get(1).setSelected(false);
        pregunta.respuestas.get(2).setSelected(true);
        pregunta.respuestas.get(3).setSelected(false);     
        //rbtnOpcionRespuesta3.getText();
    }//GEN-LAST:event_rbtnOpcionRespuesta3ActionPerformed

    private void rbtnOpcionRespuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOpcionRespuesta4ActionPerformed
        pregunta.respuestas.get(0).setSelected(false);
        pregunta.respuestas.get(1).setSelected(false);
        pregunta.respuestas.get(2).setSelected(false);
        pregunta.respuestas.get(3).setSelected(true);
        rbtnOpcionRespuesta4.getText();
    }//GEN-LAST:event_rbtnOpcionRespuesta4ActionPerformed

    private void btnTerminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarExamenActionPerformed
        
        JOptionPane.showMessageDialog(null, "EL numero de respuestas correctas fue: "+ contRespuestas);
        /*
        
        boolean encontroCorrecta = false;
        int contadorRespuestas = 0;
        
        for(Pregunta pregunta : preguntas){
            encontroCorrecta = false;
       }for(Respuesta respuesta : pregunta.respuestas){
           if(respuesta.Selected == true && respuesta.isCorrect){
               encontroCorrecta = true;
               contadorRespuestas++;
               break; 
           }
       }
       // System.out.println("resultado es: " + contador);
*/
    }//GEN-LAST:event_btnTerminarExamenActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar;
    private javax.swing.ButtonGroup btnGrupoRespuesta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalirQuiz;
    private javax.swing.JButton btnTerminarExamen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIndicacionesEjercicio;
    private javax.swing.JLabel lblIndicacionesEjercicio1;
    private javax.swing.JLabel lblNombreFrame;
    private javax.swing.JLabel lblPreguntaMostrada;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JRadioButton rbtnOpcionRespuesta1;
    private javax.swing.JRadioButton rbtnOpcionRespuesta2;
    private javax.swing.JRadioButton rbtnOpcionRespuesta3;
    private javax.swing.JRadioButton rbtnOpcionRespuesta4;
    // End of variables declaration//GEN-END:variables
}