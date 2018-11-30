package view;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vCRUDEAlumnos extends javax.swing.JFrame {

    public vCRUDEAlumnos() {
        initComponents();
        mostrarDatos("");

        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Alumno");
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnEliminarAlumno = new javax.swing.JButton();
        btnModificarAlumno = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnAgregarAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        txtApellidoAlumno = new javax.swing.JTextField();
        txtNivel = new javax.swing.JTextField();
        txtIdAlumno = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarAlumno.setBackground(new java.awt.Color(255, 87, 51));
        btnEliminarAlumno.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnEliminarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogEliminarUser.png"))); // NOI18N
        btnEliminarAlumno.setText("Eliminar");
        btnEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 200, 68));

        btnModificarAlumno.setBackground(new java.awt.Color(144, 12, 63));
        btnModificarAlumno.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnModificarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogEditar.png"))); // NOI18N
        btnModificarAlumno.setText("Modificar");
        btnModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 200, 68));

        btnMostrar.setBackground(new java.awt.Color(199, 0, 57));
        btnMostrar.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogMostar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 200, 68));

        btnAgregarAlumno.setBackground(new java.awt.Color(88, 24, 69));
        btnAgregarAlumno.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnAgregarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogAgregar.png"))); // NOI18N
        btnAgregarAlumno.setText("Agregar");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 200, 68));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 229, 934, 273));

        jLabel1.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 561, 141, 32));

        jLabel2.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Identificador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 561, 141, 32));

        jLabel3.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 561, 141, 32));

        jLabel4.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nivel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 141, 32));
        getContentPane().add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 529, 141, 28));
        getContentPane().add(txtApellidoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 529, 141, 28));
        getContentPane().add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 141, 28));
        getContentPane().add(txtIdAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 529, 141, 28));

        btnBuscar.setBackground(new java.awt.Color(102, 204, 0));
        btnBuscar.setFont(new java.awt.Font("Roboto Lt", 1, 24)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogBuscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 170, 60));
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 651, 141, 28));

        jLabel5.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 680, -1, -1));

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
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 644, 155, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUDE.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        try {

            PreparedStatement preparedstatement = connection.prepareStatement(" INSERT INTO alumno (idAlumno, nombreAlumno, apellidoAlumno, nivel, idProfesor) VALUES (?,?,?,?,?) ");
            preparedstatement.setString(1, txtIdAlumno.getText());
            preparedstatement.setString(2, txtNombreAlumno.getText());
            preparedstatement.setString(3, txtApellidoAlumno.getText());
            preparedstatement.setInt(4, 1);

            preparedstatement.setInt(5, Variables.idProfesor);

            preparedstatement.executeUpdate();

            mostrarDatos("");
        } catch (SQLException ex) {
            ex.printStackTrace();

        }      
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumnoActionPerformed
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        try {
            PreparedStatement preparedstatement = connection.prepareStatement(" UPDATE alumno SET nombreAlumno = ?, apellidoAlumno =?, nivel = ? WHERE idAlumno = ? ");
            preparedstatement.setString(4, txtIdAlumno.getText());
            preparedstatement.setString(1, txtNombreAlumno.getText());
            preparedstatement.setString(2, txtApellidoAlumno.getText());
            preparedstatement.setInt(3, Integer.parseInt(txtNivel.getText()));
            preparedstatement.executeUpdate();
            mostrarDatos("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnModificarAlumnoActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarDatos(txtBusqueda.getText());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumnoActionPerformed
       Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();

        int fila = tblAlumnos.getSelectedRow();
        String cod = "";
        cod = tblAlumnos.getValueAt(fila, 0).toString();

        try {
            PreparedStatement preparedstatement = connection.prepareStatement("DELETE FROM alumno WHERE idAlumno = ?");
            preparedstatement.setString(1, cod);
            preparedstatement.executeUpdate();
            mostrarDatos("");
        } catch (Exception e) {

        }
        
    }//GEN-LAST:event_btnEliminarAlumnoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        vOpcionesProfesor vOProfesor = new vOpcionesProfesor();
        vOProfesor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = tblAlumnos.getSelectedRow();
        if (fila >= 0) {
            txtIdAlumno.setText(tblAlumnos.getValueAt(fila, 0).toString());
            txtNombreAlumno.setText(tblAlumnos.getValueAt(fila, 1).toString());
            txtApellidoAlumno.setText(tblAlumnos.getValueAt(fila, 2).toString());
            txtNivel.setText(tblAlumnos.getValueAt(fila, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionaste alguna fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
            mostrarDatos(txtBusqueda.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void mostrarDatos(String valor) {
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Identificador");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nivel");
        tblAlumnos.setModel(modelo);
        String sql = " ";
        if (valor.equals("")) {
            sql = " SELECT * FROM alumno ";
        } else {
            sql = " SELECT * FROM alumno WHERE nombreAlumno = '" + valor + "'";
        }

        String[] datos = new String[4];

        try {
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                datos[0] = resultset.getString(1);
                datos[1] = resultset.getString(2);
                datos[2] = resultset.getString(3);
                datos[3] = resultset.getString(4);
                modelo.addRow(datos);
            }
            tblAlumnos.setModel(modelo);
        } catch (Exception e) {

        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarAlumno;
    private javax.swing.JButton btnModificarAlumno;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtApellidoAlumno;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombreAlumno;
    // End of variables declaration//GEN-END:variables
}
