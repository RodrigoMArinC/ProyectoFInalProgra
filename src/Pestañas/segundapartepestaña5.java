/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pestañas;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class segundapartepestaña5 extends javax.swing.JFrame {

    /**
     * Creates new form segundapartepestaña5
     */
    public segundapartepestaña5() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chexboxRespuesta1 = new javax.swing.JCheckBox();
        chexboxRespuesta2 = new javax.swing.JCheckBox();
        chexboxRespuesta3 = new javax.swing.JCheckBox();
        btnsiguiente = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pregunta 5 Parte 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 180, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codificacion.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 230, 170));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Qué es la codificacion?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        buttonGroup1.add(chexboxRespuesta1);
        chexboxRespuesta1.setForeground(new java.awt.Color(255, 255, 255));
        chexboxRespuesta1.setText("Proceso por el cual la informacion de una fuente es convertida en simbolos para ser comunicada.");
        getContentPane().add(chexboxRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        buttonGroup1.add(chexboxRespuesta2);
        chexboxRespuesta2.setForeground(new java.awt.Color(255, 255, 255));
        chexboxRespuesta2.setText("Consiste en uno o más archivos que contienen las instrucciones de programación con las cuales un desarrollador de software ha creado determinado programa o aplicación.");
        getContentPane().add(chexboxRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        buttonGroup1.add(chexboxRespuesta3);
        chexboxRespuesta3.setForeground(new java.awt.Color(255, 255, 255));
        chexboxRespuesta3.setText("Consiste en las actualizaciones que deban aplicarse al programa cuando las circunstancias así lo requieran.");
        getContentPane().add(chexboxRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 20));

        btnsiguiente.setBackground(new java.awt.Color(0, 0, 0));
        btnsiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnsiguiente.setText("Siguiente");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        btnsalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 70, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        // TODO add your handling code here:
        segundapartepestaña6 p = new segundapartepestaña6();
     p.setVisible(true);
     this.dispose();
     segundapartepestaña5();
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    private void segundapartepestaña5(){
         
     String pregunta ;
     String respuesta;
     
     int puntaje=0;
    
  
     Scanner entrada = new Scanner(System.in);
  
        if (chexboxRespuesta1.isSelected()){
             puntaje=+1;
            JOptionPane.showMessageDialog(null, "Respuesta Inorrecta" , "Suerte en la siguiente. ", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Respuesta Inorrecta, Suerte en la siguiente. ");
            } 
    }
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
            java.util.logging.Logger.getLogger(segundapartepestaña5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(segundapartepestaña5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(segundapartepestaña5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(segundapartepestaña5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new segundapartepestaña5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chexboxRespuesta1;
    private javax.swing.JCheckBox chexboxRespuesta2;
    private javax.swing.JCheckBox chexboxRespuesta3;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
