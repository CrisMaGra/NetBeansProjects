/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsur_20;

/**
 *
 * @author CRISTIAN
 */
public class Pregunta2 extends javax.swing.JFrame {

    /**
     * Creates new form Preguntas
     */
    public Pregunta2() {
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

        pregunta1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        opcion4 = new javax.swing.JRadioButton();
        siguiente2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("¿CUÁL ES EL PAÍS MÁS GRANDE DEL MUNDO?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 430, -1));

        pregunta1.add(opcion1);
        opcion1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        opcion1.setText("EEUU");
        getContentPane().add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        pregunta1.add(opcion2);
        opcion2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        opcion2.setText("ALEMANIA");
        getContentPane().add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        pregunta1.add(opcion3);
        opcion3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        opcion3.setText("BRASIL");
        getContentPane().add(opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        pregunta1.add(opcion4);
        opcion4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        opcion4.setText("RUSIA");
        getContentPane().add(opcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        siguiente2.setBackground(new java.awt.Color(255, 102, 0));
        siguiente2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        siguiente2.setText("SIGUIENTE");
        siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente2ActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo2.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente2ActionPerformed
        
        if ( opcion4.isSelected() ){
            System.out.print("CORRECTO");
        }
        Pregunta3 pr = new Pregunta3();
        pr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_siguiente2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JRadioButton opcion4;
    private javax.swing.ButtonGroup pregunta1;
    private javax.swing.JButton siguiente2;
    // End of variables declaration//GEN-END:variables
}
