    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Pestañas.Pestaña1;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Usuario
 */
public class juego extends javax.swing.JFrame {

    /**
     * Creates new form juego
     */
    public juego() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        btnregistro = new javax.swing.JButton();
        btnjugar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jFpass = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Juego de Preguntas y Respuestas.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 420, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jtxtUsuario.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 200, 40));

        btnregistro.setBackground(new java.awt.Color(0, 0, 0));
        btnregistro.setForeground(new java.awt.Color(255, 255, 255));
        btnregistro.setText("Registrarse");
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, 40));

        btnjugar.setBackground(new java.awt.Color(0, 0, 0));
        btnjugar.setForeground(new java.awt.Color(255, 255, 255));
        btnjugar.setText("Jugar");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnjugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 100, 40));

        btnsalir.setBackground(new java.awt.Color(0, 0, 0));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, 160));

        jFpass.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jFpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 665, 519));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed
        // TODO add your handling code here:
        Crear_usuario u = new Crear_usuario();
       u.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnregistroActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
          System.exit(0);

    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        // TODO add your handling code here:
        
        
        String usuario = jtxtUsuario.getText();
        
        String contraseña =String.valueOf(jFpass.getPassword());
        
        boolean encontrar= true;
         
        for (datos p : IniciarComponentes.usuarios) {
            if (p.getUsuario().equals(usuario)&& p.getContraseña().equals(contraseña)) {
                encontrar = true;
                JOptionPane.showMessageDialog(null, "Usuario encontrado","Bienvenido",INFORMATION_MESSAGE);
                
                
                

            } else{
                encontrar = false;
                

            }
        }
        if (encontrar) {
            Pestaña1 p1 = new Pestaña1();
            p1.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No se econtro el Usuario Correcto");
            }    
        
    }//GEN-LAST:event_btnjugarActionPerformed

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
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjugar;
    private javax.swing.JButton btnregistro;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JPasswordField jFpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}