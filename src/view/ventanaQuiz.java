package view;


import java.util.List;
import models.Pregunta;
import models.Respuesta;

public class ventanaQuiz extends javax.swing.JFrame {
    //Variables necesarias
    public List<Pregunta> preguntas;
    Pregunta pregunta = null;
    int posicion = 0;
    
    
    public ventanaQuiz(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Preguntas");
        btnAvanzar.setVisible(true);
        cargarPreguntas();
        //cargarPreguntasSN();
    }
     
    private void cargarPreguntas(){
        pregunta = preguntas.get(posicion);
        lblPreguntaMostrada.setText(pregunta.getText());
        for(Respuesta respuesta: pregunta.respuestas){
            lblRespuesta.setText(String.valueOf(respuesta.getResultado()));
        }
        btnRegresar.setVisible(false);
    }
    
    /*private void cargarPreguntasSN(){
        pregunta = preguntas.get(posicion);
        lblPreguntaMostrada.setText(pregunta.getText());
        for(Respuesta respuestaSN : pregunta.respuestas){
            lblRespuesta.setText(String.valueOf(respuestaSN.getResultado()));
        }
        btnRegresar.setVisible(false);
    }*/
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIndicacionesEjercicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIndicacionesEjercicio.setText("Selecciona las respuestas correctas, solo una la correcta");

        btnGrupoRespuesta.add(rbtnOpcionRespuesta1);

        btnGrupoRespuesta.add(rbtnOpcionRespuesta2);

        btnGrupoRespuesta.add(rbtnOpcionRespuesta3);

        btnGrupoRespuesta.add(rbtnOpcionRespuesta4);

        lblPreguntaMostrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPreguntaMostrada.setText("¿Cuanto es 2+ 2?");

        lblNombreFrame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombreFrame.setText("Cuestionario");

        btnRegresar.setText("<<Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAvanzar.setText("Avanzar>>");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnTerminarExamen.setText("Terminar Examen");

        btnSalirQuiz.setText("<<Volver");
        btnSalirQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirQuizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalirQuiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTerminarExamen)
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvanzar)
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnOpcionRespuesta4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnOpcionRespuesta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbtnOpcionRespuesta3)
                            .addComponent(rbtnOpcionRespuesta2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblPreguntaMostrada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblIndicacionesEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNombreFrame)))
                .addContainerGap(752, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNombreFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIndicacionesEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(lblPreguntaMostrada)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnOpcionRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(rbtnOpcionRespuesta2)
                .addGap(18, 18, 18)
                .addComponent(rbtnOpcionRespuesta3)
                .addGap(18, 18, 18)
                .addComponent(rbtnOpcionRespuesta4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar)
                            .addComponent(btnAvanzar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTerminarExamen)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirQuiz)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirQuizActionPerformed
        //Volver al menu anterior
        ventanaNivelesEjercicio vNivelEjercicio = new ventanaNivelesEjercicio();
        vNivelEjercicio.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnSalirQuizActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        // TODO add your handling code here:
        if (posicion < preguntas.size() -1) {
            posicion++;
            cargarPreguntas();
        }else{
            btnAvanzar.setVisible(false);
        } 
    }//GEN-LAST:event_btnAvanzarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar;
    private javax.swing.ButtonGroup btnGrupoRespuesta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalirQuiz;
    private javax.swing.JButton btnTerminarExamen;
    private javax.swing.JLabel lblIndicacionesEjercicio;
    private javax.swing.JLabel lblNombreFrame;
    private javax.swing.JLabel lblPreguntaMostrada;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JRadioButton rbtnOpcionRespuesta1;
    private javax.swing.JRadioButton rbtnOpcionRespuesta2;
    private javax.swing.JRadioButton rbtnOpcionRespuesta3;
    private javax.swing.JRadioButton rbtnOpcionRespuesta4;
    // End of variables declaration//GEN-END:variables
}
