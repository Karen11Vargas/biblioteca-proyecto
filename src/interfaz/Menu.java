/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import estructura.Arbol;
import estructura.ArbolPrestamo;
import estructura.ArbolUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen.Vargas
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelMenu2 = new javax.swing.JLabel();
        jLabelMenu4 = new javax.swing.JLabel();
        jLabelMenu5 = new javax.swing.JLabel();
        jLabelMenu6 = new javax.swing.JLabel();
        eliminarLibro = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        verLibros = new javax.swing.JButton();
        buscarLibro = new javax.swing.JButton();
        eliminarUsuario = new javax.swing.JButton();
        agregarUsuario = new javax.swing.JButton();
        verUsuarios = new javax.swing.JButton();
        buscarUsuario = new javax.swing.JButton();
        agregarPrestamo = new javax.swing.JButton();
        prestamoUsuario = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        agregarLibro1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(null);

        jLabelMenu.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMenu.setText("Bienvenidos");
        getContentPane().add(jLabelMenu);
        jLabelMenu.setBounds(230, 40, 240, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(60, 150, 490, 10);

        jLabelMenu2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabelMenu2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMenu2.setText("Biblioteca Virtual");
        getContentPane().add(jLabelMenu2);
        jLabelMenu2.setBounds(160, -10, 330, 70);

        jLabelMenu4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelMenu4.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMenu4.setText("Libros");
        getContentPane().add(jLabelMenu4);
        jLabelMenu4.setBounds(80, 100, 110, 50);

        jLabelMenu5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelMenu5.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMenu5.setText("Prestamos");
        getContentPane().add(jLabelMenu5);
        jLabelMenu5.setBounds(410, 100, 140, 50);

        jLabelMenu6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelMenu6.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMenu6.setText("Usuarios");
        getContentPane().add(jLabelMenu6);
        jLabelMenu6.setBounds(240, 100, 110, 50);

        eliminarLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarLibro.setText("Eliminar Libro");
        eliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarLibro);
        eliminarLibro.setBounds(50, 350, 130, 40);

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(550, 10, 60, 30);

        verLibros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        verLibros.setText("Ver Libros");
        verLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(verLibros);
        verLibros.setBounds(50, 230, 130, 40);

        buscarLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarLibro.setText("Buscar Libro");
        buscarLibro.setToolTipText("");
        buscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(buscarLibro);
        buscarLibro.setBounds(50, 290, 130, 40);

        eliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarUsuario.setText("Eliminar Usuario");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarUsuario);
        eliminarUsuario.setBounds(230, 350, 140, 40);

        agregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarUsuario.setText("Agregar Usuario");
        agregarUsuario.setToolTipText("");
        agregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(agregarUsuario);
        agregarUsuario.setBounds(230, 170, 140, 40);

        verUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        verUsuarios.setText("Ver Usuarios");
        verUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(verUsuarios);
        verUsuarios.setBounds(230, 230, 140, 40);

        buscarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarUsuario.setText("Buscar Usuario");
        buscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(buscarUsuario);
        buscarUsuario.setBounds(230, 290, 140, 40);

        agregarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarPrestamo.setText("Agregar Prestamo");
        agregarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPrestamo);
        agregarPrestamo.setBounds(410, 170, 140, 40);

        prestamoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prestamoUsuario.setText("Prestamo Usuario");
        prestamoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(prestamoUsuario);
        prestamoUsuario.setBounds(410, 230, 140, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(200, 50, 200, 10);

        agregarLibro1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarLibro1.setText("Agregar Libro");
        agregarLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLibro1ActionPerformed(evt);
            }
        });
        getContentPane().add(agregarLibro1);
        agregarLibro1.setBounds(50, 170, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/img/ac1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 290, 450, 180);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/img/ac.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, -10, 270, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     Arbol arbolLibreo = new Arbol();
          ArbolUsuario arbolUsuario = new ArbolUsuario();
     ArbolPrestamo arbolPrestamo = new ArbolPrestamo();

    private void eliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLibroActionPerformed
//        String nombreELiminar = JOptionPane.showInputDialog("Por favor, introduce nombre del libro:");
//        gestion.eliminarLibro(nombreELiminar);

    }//GEN-LAST:event_eliminarLibroActionPerformed

    private void verLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLibrosActionPerformed
      
        arbolLibreo.inOrder(arbolLibreo.Raiz);

    }//GEN-LAST:event_verLibrosActionPerformed

    private void buscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLibroActionPerformed
        String nombreLibro = JOptionPane.showInputDialog("Ingrese nombre libro a buscar:");
         if (!nombreLibro.isEmpty()) {
  
                arbolLibreo.buscarLibroPorNombre(arbolLibreo.Raiz,nombreLibro);

            } else {
              JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del libro."); 

            }
    }//GEN-LAST:event_buscarLibroActionPerformed

    private void agregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsuarioActionPerformed
        try {
            String numero = JOptionPane.showInputDialog("Por favor, introduce el documento del usuario:");
            String nombre = JOptionPane.showInputDialog("Por favor, introduce el nombre del usuario:");

            if (!nombre.isEmpty() && !numero.isEmpty()) {
                int documento = Integer.parseInt(numero);
                arbolUsuario.InsertarDatos(documento,nombre);

            } else {
              JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos."); 

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_agregarUsuarioActionPerformed

    private void verUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verUsuariosActionPerformed
         arbolUsuario.inOrder(arbolUsuario.Raiz);
    }//GEN-LAST:event_verUsuariosActionPerformed

    private void buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioActionPerformed
        String nombreUser = JOptionPane.showInputDialog("Ingrese documento a buscar:");
         if (!nombreUser.isEmpty()) {
            int documento = Integer.parseInt(nombreUser);
            arbolUsuario.buscarUsuarios(arbolUsuario.Raiz,documento);

        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el documento del usuario."); 

        }
    }//GEN-LAST:event_buscarUsuarioActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
//        String nombreELiminar = JOptionPane.showInputDialog("Por favor, introduce documento del usuario:");
//        int documento = Integer.parseInt(nombreELiminar);
//        gestion.eliminarUsuario(documento);
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void agregarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPrestamoActionPerformed
         try {
            String doc = JOptionPane.showInputDialog("Por favor, introduce el documento del usuario:");
            String  libro = JOptionPane.showInputDialog("Por favor, introduce el nombre del libro:");

            if (!doc.isEmpty() && !libro.isEmpty()) {
                int documento = Integer.parseInt(doc);
                arbolPrestamo.InsertarDatos(documento,libro);

            } else {
              JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos."); 

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_agregarPrestamoActionPerformed

    private void prestamoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoUsuarioActionPerformed
                 arbolPrestamo.inOrder(arbolPrestamo.Raiz);

    }//GEN-LAST:event_prestamoUsuarioActionPerformed

    private void agregarLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLibro1ActionPerformed
//       try {
//            String nombre = JOptionPane.showInputDialog("Por favor, introduce el nombre del libro:");
//            String autor = JOptionPane.showInputDialog("Por favor, introduce el nombre del autor:");
//            String fecha = JOptionPane.showInputDialog("Por favor, introduce el año de publicación:");
//
//            if (!nombre.isEmpty() && !autor.isEmpty() && !fecha.isEmpty()) {
//                int publicacion = Integer.parseInt(fecha);
//                gestion.agregarLibro(nombre, autor, publicacion);
//
//            } else {
//              JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos."); 
//
//            }
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_agregarLibro1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarLibro1;
    private javax.swing.JButton agregarPrestamo;
    private javax.swing.JButton agregarUsuario;
    private javax.swing.JButton buscarLibro;
    private javax.swing.JButton buscarUsuario;
    private javax.swing.JButton eliminarLibro;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMenu2;
    private javax.swing.JLabel jLabelMenu4;
    private javax.swing.JLabel jLabelMenu5;
    private javax.swing.JLabel jLabelMenu6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton prestamoUsuario;
    private javax.swing.JButton verLibros;
    private javax.swing.JButton verUsuarios;
    // End of variables declaration//GEN-END:variables
}
