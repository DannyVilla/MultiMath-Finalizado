/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



/**
 *
 * @author sam
 */
public class ventanaNivelesEjercicio extends javax.swing.JFrame {
    

     
   //Constructor
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
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Por favor selecciona el nivel para comenzar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nivel 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nivel 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nivel 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Preguntas Sencillas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 31));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Intermedio Avanzado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Con cuidado, campeón");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        btnAccederNivel1.setBackground(new java.awt.Color(102, 255, 102));
        btnAccederNivel1.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnAccederNivel1.setForeground(new java.awt.Color(0, 0, 51));
        btnAccederNivel1.setText("Acceder");
        btnAccederNivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederNivel1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccederNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 130, 60));

        btnAccederNivel2.setBackground(new java.awt.Color(153, 153, 255));
        btnAccederNivel2.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnAccederNivel2.setForeground(new java.awt.Color(0, 0, 51));
        btnAccederNivel2.setText("Acceder");
        btnAccederNivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederNivel2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccederNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 130, 60));

        btnAccederNivel3.setBackground(new java.awt.Color(255, 153, 102));
        btnAccederNivel3.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnAccederNivel3.setForeground(new java.awt.Color(0, 0, 51));
        btnAccederNivel3.setText("Acceder");
        btnAccederNivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederNivel3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccederNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 130, 60));

        btnRegresarOpcionesAlumno.setBackground(new java.awt.Color(102, 255, 255));
        btnRegresarOpcionesAlumno.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        btnRegresarOpcionesAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresarOpcionesAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reg.png"))); // NOI18N
        btnRegresarOpcionesAlumno.setText("Regresar");
        btnRegresarOpcionesAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarOpcionesAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarOpcionesAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 160, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Global.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederNivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederNivel1ActionPerformed

        ventanaQuiz vQuiz = new ventanaQuiz(1);
        vQuiz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccederNivel1ActionPerformed

    private void btnAccederNivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederNivel2ActionPerformed
        ventanaQuiz vQuiz = new ventanaQuiz(2);
        vQuiz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccederNivel2ActionPerformed

    private void btnAccederNivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederNivel3ActionPerformed
        ventanaQuiz vQuiz = new ventanaQuiz(3);
        vQuiz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccederNivel3ActionPerformed

    private void btnRegresarOpcionesAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarOpcionesAlumnoActionPerformed
       ventanaOpcionesAlumno vOAlumno = new ventanaOpcionesAlumno();
       vOAlumno.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegresarOpcionesAlumnoActionPerformed

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
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
