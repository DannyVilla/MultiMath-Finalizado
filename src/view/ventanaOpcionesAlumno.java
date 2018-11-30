
package view;

import conexion.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ventanaOpcionesAlumno extends javax.swing.JFrame {

    public ventanaOpcionesAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu de los ejercicios");
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMultiplicacion = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMultiplicacion.setBackground(new java.awt.Color(255, 51, 51));
        btnMultiplicacion.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(0, 0, 51));
        btnMultiplicacion.setText("Multiplicación");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 69));

        btnResultado.setBackground(new java.awt.Color(255, 204, 51));
        btnResultado.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(0, 0, 51));
        btnResultado.setText("Resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 69));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Opciones del programa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

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
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 479, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Global.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
        ventanaNivelesEjercicio vNivelEjercicio = new ventanaNivelesEjercicio();
        vNivelEjercicio.setVisible(true);
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       ventanaLoginAlumnos vLAlumnos = new ventanaLoginAlumnos();
       vLAlumnos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        //Generando el reporte de cada Alumno
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        JasperReport reporte = null;

        URL path = this.getClass().getResource("/reportes/RespuestasResultado.jasper");
        try {
            reporte = (JasperReport) JRLoader.loadObject(path) ;
            
            //TODO: LLenar el reporte con algunos parametros y la conexion a bd
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, connection);
            
            //Generar vista del reporte 
            JasperViewer view = new JasperViewer(jprint, false);
            
            //Evitar Freezen molestos
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(vOpcionesProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
                                                             
    }//GEN-LAST:event_btnResultadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}