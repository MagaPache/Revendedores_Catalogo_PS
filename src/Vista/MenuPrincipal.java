/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmFileClients = new javax.swing.JMenu();
        miNewClient = new javax.swing.JMenuItem();
        miClientConsult = new javax.swing.JMenuItem();
        jmFileProducts = new javax.swing.JMenu();
        miNewProduct = new javax.swing.JMenuItem();
        jmFileOrders = new javax.swing.JMenu();
        miNewOrder = new javax.swing.JMenuItem();
        miRemoveOrder = new javax.swing.JMenuItem();
        miPrintOrder = new javax.swing.JMenuItem();
        jmFilePayments = new javax.swing.JMenu();
        miNewPayment = new javax.swing.JMenuItem();
        jmFilePrizes = new javax.swing.JMenu();
        miNewPrize = new javax.swing.JMenuItem();
        miModifyPrize = new javax.swing.JMenuItem();
        miPrizeStatus = new javax.swing.JMenuItem();
        jmReports = new javax.swing.JMenu();
        jmRepClients = new javax.swing.JMenuItem();
        jmRepProducts = new javax.swing.JMenuItem();
        miRepOrders = new javax.swing.JMenuItem();
        jmHelp = new javax.swing.JMenu();
        jmAbout = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmFile.setText("Archivo");

        jmFileClients.setText("Clientes");

        miNewClient.setText("Nuevo");
        miNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewClientActionPerformed(evt);
            }
        });
        jmFileClients.add(miNewClient);

        miClientConsult.setText("Consultar");
        miClientConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientConsultActionPerformed(evt);
            }
        });
        jmFileClients.add(miClientConsult);

        jmFile.add(jmFileClients);

        jmFileProducts.setText("Productos");

        miNewProduct.setText("Nuevo");
        miNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewProductActionPerformed(evt);
            }
        });
        jmFileProducts.add(miNewProduct);

        jmFile.add(jmFileProducts);

        jmFileOrders.setText("Pedidos");

        miNewOrder.setText("Nuevo");
        miNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewOrderActionPerformed(evt);
            }
        });
        jmFileOrders.add(miNewOrder);

        miRemoveOrder.setText("Eliminar");
        jmFileOrders.add(miRemoveOrder);

        miPrintOrder.setText("Imprimir detalle");
        miPrintOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPrintOrderActionPerformed(evt);
            }
        });
        jmFileOrders.add(miPrintOrder);

        jmFile.add(jmFileOrders);

        jmFilePayments.setText("Cobros");

        miNewPayment.setText("Nuevo");
        miNewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewPaymentActionPerformed(evt);
            }
        });
        jmFilePayments.add(miNewPayment);

        jmFile.add(jmFilePayments);

        jmFilePrizes.setText("Premios");

        miNewPrize.setText("Nuevo");
        miNewPrize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewPrizeActionPerformed(evt);
            }
        });
        jmFilePrizes.add(miNewPrize);

        miModifyPrize.setText("Modificar");
        miModifyPrize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModifyPrizeActionPerformed(evt);
            }
        });
        jmFilePrizes.add(miModifyPrize);

        miPrizeStatus.setText("Consultar Estado");
        miPrizeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPrizeStatusActionPerformed(evt);
            }
        });
        jmFilePrizes.add(miPrizeStatus);

        jmFile.add(jmFilePrizes);

        jMenuBar1.add(jmFile);

        jmReports.setText("Reportes");

        jmRepClients.setText("Clientes");
        jmReports.add(jmRepClients);

        jmRepProducts.setText("Productos");
        jmReports.add(jmRepProducts);

        miRepOrders.setText("Pedidos");
        jmReports.add(miRepOrders);

        jMenuBar1.add(jmReports);

        jmHelp.setText("Ayuda");
        jMenuBar1.add(jmHelp);

        jmAbout.setText("Acerca de");
        jMenuBar1.add(jmAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miClientConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientConsultActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaCliente cc = new ConsultaCliente();
            cc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miClientConsultActionPerformed

    private void miNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewClientActionPerformed
        try {
            // TODO add your handling code here:
            AltaCliente ac = new AltaCliente();
            ac.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miNewClientActionPerformed

    private void miModifyPrizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModifyPrizeActionPerformed
        try {
            // TODO add your handling code here:
            ModificarPremio mp = new ModificarPremio();
            mp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miModifyPrizeActionPerformed

    private void miNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewProductActionPerformed
        try {
            // TODO add your handling code here:
            AltaProducto ap = new AltaProducto();
            ap.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miNewProductActionPerformed

    private void miNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewOrderActionPerformed
        try {
            // TODO add your handling code here:
            AltaPedido ap = new AltaPedido();
            ap.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miNewOrderActionPerformed

    private void miPrintOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPrintOrderActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaPedidoPorCliente cppc = new ConsultaPedidoPorCliente();
            cppc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miPrintOrderActionPerformed

    private void miNewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewPaymentActionPerformed
        try {
            // TODO add your handling code here:
            AltaCobro ac = new AltaCobro();
            ac.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miNewPaymentActionPerformed

    private void miNewPrizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewPrizeActionPerformed
        try {
            // TODO add your handling code here:
            AltaPremio ap = new AltaPremio();
            ap.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miNewPrizeActionPerformed

    private void miPrizeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPrizeStatusActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaEstadoPremio cp = new ConsultaEstadoPremio();
            cp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miPrizeStatusActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAbout;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmFileClients;
    private javax.swing.JMenu jmFileOrders;
    private javax.swing.JMenu jmFilePayments;
    private javax.swing.JMenu jmFilePrizes;
    private javax.swing.JMenu jmFileProducts;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenuItem jmRepClients;
    private javax.swing.JMenuItem jmRepProducts;
    private javax.swing.JMenu jmReports;
    private javax.swing.JMenuItem miClientConsult;
    private javax.swing.JMenuItem miModifyPrize;
    private javax.swing.JMenuItem miNewClient;
    private javax.swing.JMenuItem miNewOrder;
    private javax.swing.JMenuItem miNewPayment;
    private javax.swing.JMenuItem miNewPrize;
    private javax.swing.JMenuItem miNewProduct;
    private javax.swing.JMenuItem miPrintOrder;
    private javax.swing.JMenuItem miPrizeStatus;
    private javax.swing.JMenuItem miRemoveOrder;
    private javax.swing.JMenuItem miRepOrders;
    // End of variables declaration//GEN-END:variables
}
