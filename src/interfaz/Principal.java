/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cafetera;
import javax.swing.JOptionPane;

/**
 *
 * @author baltamar
 */
public class Principal extends javax.swing.JFrame {

    Cafetera c;

    public Principal() {
        initComponents();
        cmdLLenar.setEnabled(false);
        cmdLLenar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdVaciarCafetera.setEnabled(false);
        cmdServirTazas.setEnabled(false);
        cmdAgregarCafe.setEnabled(false);
        cmdBorrar.setEnabled(false);
        txtResultados.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCapacidadMax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadActual = new javax.swing.JTextField();
        cmdCrear = new javax.swing.JButton();
        cmdCrearAutomatico = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmdLLenar = new javax.swing.JButton();
        cmdServirTazas = new javax.swing.JButton();
        cmdVaciarCafetera = new javax.swing.JButton();
        cmdAgregarCafe = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cafetera");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Capacidad Maxima:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtCapacidadMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadMaxKeyTyped(evt);
            }
        });
        jPanel2.add(txtCapacidadMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 90, -1));

        jLabel3.setText("Cantidad Actual De Café:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtCantidadActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadActualKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, -1));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cmdCrearAutomatico.setText("Crear Automatico");
        cmdCrearAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearAutomaticoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrearAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 140));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLLenar.setText("LLenar");
        cmdLLenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLLenarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLLenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        cmdServirTazas.setText("Servir Tazas");
        cmdServirTazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdServirTazasActionPerformed(evt);
            }
        });
        jPanel3.add(cmdServirTazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        cmdVaciarCafetera.setText("Vaciar Cafetera");
        cmdVaciarCafetera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVaciarCafeteraActionPerformed(evt);
            }
        });
        jPanel3.add(cmdVaciarCafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, -1));

        cmdAgregarCafe.setText("Agregar Café");
        cmdAgregarCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarCafeActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAgregarCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 150, 240));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultados.setEditable(false);
        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        jScrollPane1.setViewportView(txtResultados);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCapacidadMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadMaxKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }    }//GEN-LAST:event_txtCapacidadMaxKeyTyped

    private void txtCantidadActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadActualKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }    }//GEN-LAST:event_txtCantidadActualKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int capMax, canActual, aux;

        if (txtCapacidadMax.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la capacidad Maxima por favor");
            txtCapacidadMax.requestFocusInWindow();
        } else if (txtCantidadActual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la cantidad actual por favor");
            txtCantidadActual.requestFocusInWindow();
        } else {
            capMax = Integer.parseInt(txtCapacidadMax.getText());
            canActual = Integer.parseInt(txtCantidadActual.getText());

            c = new Cafetera(capMax, canActual);
            JOptionPane.showMessageDialog(this, "Creaciión exitosa");
            cmdLLenar.setEnabled(true);
            cmdLLenar.setEnabled(true);
            cmdMostrar.setEnabled(true);
            cmdVaciarCafetera.setEnabled(true);
            cmdServirTazas.setEnabled(true);
            cmdAgregarCafe.setEnabled(true);
            cmdBorrar.setEnabled(true);
            txtResultados.setEnabled(true);

        }

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdCrearAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearAutomaticoActionPerformed

        c = new Cafetera();
        JOptionPane.showMessageDialog(this, "Creaciión exitosa");
        cmdLLenar.setEnabled(true);
        cmdLLenar.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdVaciarCafetera.setEnabled(true);
        cmdServirTazas.setEnabled(true);
        cmdAgregarCafe.setEnabled(true);
        cmdBorrar.setEnabled(true);
        txtResultados.setEnabled(true);

    }//GEN-LAST:event_cmdCrearAutomaticoActionPerformed

    private void cmdLLenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLLenarActionPerformed
        c.llenarCafetera();
    }//GEN-LAST:event_cmdLLenarActionPerformed

    private void cmdServirTazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdServirTazasActionPerformed
        int tazas = 0, sw, res;

        do {
            sw = 1;
            try {
                tazas = (int) Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de taza que desea servir"));
            } catch (NullPointerException e) {
                res = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "salir", JOptionPane.YES_NO_OPTION);

                if (res == 0) {
                    sw = 1;

                } else {
                    sw = 0;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
                sw = 0;
            }

        } while (sw == 0);

        c.servirTaza(tazas);
    }//GEN-LAST:event_cmdServirTazasActionPerformed

    private void cmdVaciarCafeteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVaciarCafeteraActionPerformed

        c.vaciarCafetera();
    }//GEN-LAST:event_cmdVaciarCafeteraActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        txtResultados.setText("");
        txtResultados.setText(c.mostrar());
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed

        txtCapacidadMax.setText("");
        txtCantidadActual.setText("");
        txtResultados.setText("");
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdAgregarCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarCafeActionPerformed
        int agregarCafe = 0;
        int sw, res;

        do {
            sw = 1;
            try {
                agregarCafe = (int) Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la cantidad que desea agregar"));
            } catch (NullPointerException e) {
                res = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "salir", JOptionPane.YES_NO_OPTION);

                if (res == 0) {
                    sw = 1;

                } else {
                    sw = 0;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
                sw = 0;
            }

        } while (sw == 0);

        c.agregarCafe(agregarCafe);

    }//GEN-LAST:event_cmdAgregarCafeActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregarCafe;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdCrearAutomatico;
    private javax.swing.JButton cmdLLenar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdServirTazas;
    private javax.swing.JButton cmdVaciarCafetera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidadActual;
    private javax.swing.JTextField txtCapacidadMax;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
