/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class ModificarCliente extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCliente
     */
    public ModificarCliente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtClient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        btnSearchClientName = new javax.swing.JButton();
        txtClientMail = new javax.swing.JTextField();
        btnSearchClientMail = new javax.swing.JButton();
        rbtClientByMail = new javax.swing.JRadioButton();
        btnModifyClient = new javax.swing.JButton();
        rbtClientByName = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jtClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtClient);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 561, 222);

        jLabel1.setText("Buscar Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 250, 80, 14);
        getContentPane().add(txtClientName);
        txtClientName.setBounds(10, 310, 80, 20);

        btnSearchClientName.setText("Buscar");
        getContentPane().add(btnSearchClientName);
        btnSearchClientName.setBounds(110, 310, 65, 23);
        getContentPane().add(txtClientMail);
        txtClientMail.setBounds(210, 310, 80, 20);

        btnSearchClientMail.setText("Buscar");
        getContentPane().add(btnSearchClientMail);
        btnSearchClientMail.setBounds(310, 310, 65, 23);

        rbtClientByMail.setText("E-mail");
        getContentPane().add(rbtClientByMail);
        rbtClientByMail.setBounds(210, 280, 53, 23);

        btnModifyClient.setText("Modificar");
        getContentPane().add(btnModifyClient);
        btnModifyClient.setBounds(480, 250, 90, 23);

        rbtClientByName.setText("Nombre");
        getContentPane().add(rbtClientByName);
        rbtClientByName.setBounds(10, 280, 63, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifyClient;
    private javax.swing.JButton btnSearchClientMail;
    private javax.swing.JButton btnSearchClientName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtClient;
    private javax.swing.JRadioButton rbtClientByMail;
    private javax.swing.JRadioButton rbtClientByName;
    private javax.swing.JTextField txtClientMail;
    private javax.swing.JTextField txtClientName;
    // End of variables declaration//GEN-END:variables
}
