
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRISTIAN
 */
public class Shellsur extends javax.swing.JFrame {

    /**
     * Creates new form Shellsur
     */
    public Shellsur() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    private static String[] nombre_Cliente = new String[100], apellido_Cliente = new String[100], dni_Cliente = new String[100], mail_Cliente = new String[100], numero_Cliente = new String[100];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datoNombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        datoApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        datoDni = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        datoMail = new javax.swing.JTextField();
        botonListo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(datoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 320, -1));

        Apellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Apellido.setText("Apellido:");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 80, -1));

        Nombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nombre1.setText("Nombre:");
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 80, -1));
        getContentPane().add(datoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 320, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DNI:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 522, 60, 20));
        getContentPane().add(datoDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 320, -1));

        Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Email.setText("E-mail:");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));
        getContentPane().add(datoMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 320, -1));

        botonListo.setBackground(new java.awt.Color(255, 102, 0));
        botonListo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonListo.setForeground(new java.awt.Color(255, 255, 255));
        botonListo.setText("LISTO PARA JUGAR!!");
        botonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListoActionPerformed(evt);
            }
        });
        getContentPane().add(botonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 620, 160, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo2.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListoActionPerformed
        
        String nombre_Cliente = datoNombre.getText();
        String apellido_Cliente = datoApellido.getText();
        String dni_Cliente = datoDni.getText();
        String mail_Cliente = datoMail.getText();
        jugador(nombre_Cliente);
    }//GEN-LAST:event_botonListoActionPerformed
    public static void jugador(String dato){
        JOptionPane.showMessageDialog(null, "BUENA SUERTE " + dato.toUpperCase() + "!!!");
    }
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
            java.util.logging.Logger.getLogger(Shellsur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shellsur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shellsur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shellsur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shellsur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JButton botonListo;
    private javax.swing.JTextField datoApellido;
    private javax.swing.JTextField datoDni;
    private javax.swing.JTextField datoMail;
    private javax.swing.JTextField datoNombre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
