package Pestañas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Pestaña9 extends javax.swing.JFrame {

    /**
     * Creates new form Pestaña9
     */
    public Pestaña9() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chexboxRespuesta1 = new javax.swing.JCheckBox();
        chexboxRespuesta2 = new javax.swing.JCheckBox();
        chexboxRespuesta3 = new javax.swing.JCheckBox();
        siguientep9 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pregunta #9");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/try.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 340, 180));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Para qué sirve el try en Java?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 290, 40));

        buttonGroup1.add(chexboxRespuesta1);
        chexboxRespuesta1.setForeground(new java.awt.Color(255, 255, 255));
        chexboxRespuesta1.setText("Prever excepciones en el transcurso de la ejecución de un programa.");
        getContentPane().add(chexboxRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        buttonGroup1.add(chexboxRespuesta2);
        chexboxRespuesta2.setForeground(new java.awt.Color(255, 255, 255));
        chexboxRespuesta2.setText("Esto se puede usar para acceder a los miembros de la clase y como referencia a la instancia actual.");
        chexboxRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chexboxRespuesta2ActionPerformed(evt);
            }
        });
        getContentPane().add(chexboxRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        buttonGroup1.add(chexboxRespuesta3);
        chexboxRespuesta3.setForeground(new java.awt.Color(255, 255, 255));
        chexboxRespuesta3.setText("Tiene un constructor predeterminado y se llama cada vez que se crea una instancia de la subclase concreta.");
        getContentPane().add(chexboxRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        siguientep9.setBackground(new java.awt.Color(0, 0, 0));
        siguientep9.setForeground(new java.awt.Color(255, 255, 255));
        siguientep9.setText("Siguiente");
        siguientep9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguientep9ActionPerformed(evt);
            }
        });
        getContentPane().add(siguientep9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, 30));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 80, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chexboxRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chexboxRespuesta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chexboxRespuesta2ActionPerformed

    private void siguientep9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguientep9ActionPerformed
        // TODO add your handling code here:
        PestañaPuntaje p = new PestañaPuntaje();
     p.setVisible(true);
     this.dispose();
     pregunta9 ();
    }//GEN-LAST:event_siguientep9ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
     private void pregunta9(){
     String pregunta ;
     String respuesta;
     
     int puntaje=0;
  
     Scanner entrada = new Scanner(System.in);
  
        if (chexboxRespuesta1.isSelected()){
            puntaje+=1;
            JOptionPane.showMessageDialog(null, "Respuesta Correcta, Suerte en la siguiente. ");
        }else{
            JOptionPane.showMessageDialog(null, "Respuesta Inorrecta" , "Suerte en la siguiente. ", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Pestaña9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pestaña9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pestaña9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pestaña9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pestaña9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chexboxRespuesta1;
    private javax.swing.JCheckBox chexboxRespuesta2;
    private javax.swing.JCheckBox chexboxRespuesta3;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton siguientep9;
    // End of variables declaration//GEN-END:variables
}
