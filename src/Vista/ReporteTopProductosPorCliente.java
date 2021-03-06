/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorAgenteOficial;
import Controlador.GestorCliente;
import Controlador.GestorProducto;
import Modelo.AgenteOficial;
import Modelo.Cliente;
import Modelo.VmTopProductClient;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ReporteTopProductosPorCliente extends javax.swing.JFrame {

    /**
     * Creates new form ReporteTopProductosPorCliente
     */
    GestorAgenteOficial gao = new GestorAgenteOficial();
    GestorCliente gc = new GestorCliente();
    GestorProducto gp = new GestorProducto();
    ArrayList<VmTopProductClient> products = new ArrayList<>();

    public ReporteTopProductosPorCliente() throws SQLException {
        initComponents();
        loadOfficialAgent(gao.getOfficialAgents());
        loadCmbClient(gc.getAllClients());
        int idCliente = ((Cliente) cmbClient.getSelectedItem()).getIdClient();
        int idAgente = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        products = gp.getTop5ProductsPerClient(idCliente, idAgente);
        loadTableTopProducts();
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
        cmbOfficialAgent = new javax.swing.JComboBox<>();
        cmbClient = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTopProducts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Agente Oficial");

        jLabel2.setText("Cliente");

        cmbOfficialAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOfficialAgent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOfficialAgentItemStateChanged(evt);
            }
        });
        cmbOfficialAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOfficialAgentActionPerformed(evt);
            }
        });

        cmbClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClientItemStateChanged(evt);
            }
        });
        cmbClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Ranking 5 productos"));

        tblTopProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTopProducts);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(cmbClient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOfficialAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOfficialAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOfficialAgentActionPerformed

    private void cmbClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClientActionPerformed

    private void cmbClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClientItemStateChanged
        // TODO add your handling code here:
        int idAgente = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                if (cmbOfficialAgent.getItemCount() > 0) {
                    int idCliente = ((Cliente) cmbClient.getSelectedItem()).getIdClient();
                    products = gp.getTop5ProductsPerClient(idCliente, idAgente);
                    loadTableTopProducts();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmbClientItemStateChanged

    private void cmbOfficialAgentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOfficialAgentItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                if (cmbOfficialAgent.getItemCount() > 0) {
                    int idAgente = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
                    int idCliente = ((Cliente) cmbClient.getSelectedItem()).getIdClient();
                    products = gp.getTop5ProductsPerClient(idCliente, idAgente);
                }
                loadTableTopProducts();
            } catch (SQLException ex) {
                Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmbOfficialAgentItemStateChanged

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
            java.util.logging.Logger.getLogger(ReporteTopProductosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteTopProductosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteTopProductosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteTopProductosPorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ReporteTopProductosPorCliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ReporteTopProductosPorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbClient;
    private javax.swing.JComboBox<String> cmbOfficialAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTopProducts;
    // End of variables declaration//GEN-END:variables

    private void loadOfficialAgent(ArrayList<AgenteOficial> OfficialAgents) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (AgenteOficial officialAgent : OfficialAgents) {
            model.addElement(officialAgent);
        }
        cmbOfficialAgent.setModel(model);
    }

    private void loadCmbClient(ArrayList<Cliente> clients) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Cliente client : clients) {
            model.addElement(client);
        }
        cmbClient.setModel(model);
    }

    private void loadTableTopProducts() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Código Producto", "Producto", "Cantidad Comprada"};
        model.setColumnIdentifiers(columns);
        for (VmTopProductClient product : products) {
            Object[] rows = {product.getIdProduct(), product.getProductName(), product.getAmountBuyed()};
            model.addRow(rows);
        }
        tblTopProducts.setModel(model);
    }

}
