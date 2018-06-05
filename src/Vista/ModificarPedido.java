/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorAgenteOficial;
import Controlador.GestorCampania;
import Controlador.GestorPedido;
import Modelo.AgenteOficial;
import Modelo.Campania;
import Modelo.DetallePedido;
import Modelo.VmPedidoCliente;
import Modelo.VmPedidoDetalle;
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
public class ModificarPedido extends javax.swing.JFrame {

    /**
     * Creates new form ModificarPedido
     */
    GestorAgenteOficial gao = new GestorAgenteOficial();
    GestorCampania gca = new GestorCampania();
    GestorPedido gp = new GestorPedido();
    ArrayList<VmPedidoDetalle> details = new ArrayList<>();

    public ModificarPedido() throws SQLException {
        initComponents();
        loadCmbOfficialAgent(gao.getOfficialAgents());
        loadCmbCampaign(gca.getCampaignPerOfficialAgent(((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent()));
        int idAgent = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        int idCampaign = ((Campania) cmbCampaign.getSelectedItem()).getIdCampaign();
        loadCmbClientOrder(gp.getClientOrderByCampaign(idCampaign, idAgent));
        int idPedido = ((VmPedidoCliente) cmbOrder.getSelectedItem()).getIdOrder();
        details = gp.getOrdersWithDetails(idPedido);
        loadTableClientOrderDetail();
        String fechaPedido = ((VmPedidoCliente) cmbOrder.getSelectedItem()).getOrderDate();
        lblOrderDate.setText(fechaPedido);

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
        cmbOfficialAgent = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbCampaign = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbOrder = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnDropItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Agente Oficial");

        cmbOfficialAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOfficialAgent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOfficialAgentItemStateChanged(evt);
            }
        });

        jLabel2.setText("Campaña");

        cmbCampaign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCampaign.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCampaignItemStateChanged(evt);
            }
        });

        jLabel3.setText("Pedido");

        cmbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrder.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrderItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Productos Solicitados"));

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOrderDetail);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Fecha de Pedido");

        lblOrderDate.setText("jLabel5");

        btnAddItem.setText("Agregar");

        btnDropItem.setText("Quitar");
        btnDropItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbOfficialAgent, 0, 178, Short.MAX_VALUE)
                                            .addComponent(cmbOrder, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblOrderDate)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(btnAddItem)
                                .addGap(76, 76, 76)
                                .addComponent(btnDropItem)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblOrderDate))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnDropItem))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOfficialAgentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOfficialAgentItemStateChanged
        // TODO add your handling code here:
        try {
            loadCmbCampaign(gca.getCampaignPerOfficialAgent(((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent()));
            //String fechaPedido = ((VmPedidoCliente) cmbOrder.getSelectedItem()).getOrderDate();
            //lblOrderDate.setText(fechaPedido);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmbOfficialAgentItemStateChanged

    private void cmbCampaignItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCampaignItemStateChanged
        // TODO add your handling code here:
        int idAgent = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                if (cmbCampaign.getItemCount() > 0) {
                    int idCampaign = ((Campania) cmbCampaign.getSelectedItem()).getIdCampaign();
                    System.out.println(idAgent);
                    System.out.println(idCampaign);
                    loadCmbClientOrder(gp.getClientOrderByCampaign(idCampaign, idAgent));
                    //String fechaPedido = ((VmPedidoCliente) cmbOrder.getSelectedItem()).getOrderDate();
                    //lblOrderDate.setText(fechaPedido);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmbCampaignItemStateChanged

    private void cmbOrderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrderItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cmbCampaign.getItemCount() > 0) {
                try {
                    String fechaPedido = ((VmPedidoCliente) cmbOrder.getSelectedItem()).getOrderDate();
                    lblOrderDate.setText(fechaPedido);
                    int idPedido = ((VmPedidoCliente) cmbOrder.getSelectedItem()).getIdOrder();
                    details = gp.getOrdersWithDetails(idPedido);
                    loadTableClientOrderDetail();
                } catch (SQLException ex) {
                    Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_cmbOrderItemStateChanged

    private void btnDropItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropItemActionPerformed
        // TODO add your handling code here:
//        DetallePedido dp = new DetallePedido();
//        dp.setIdOrderDetail(PROPERTIES);
    }//GEN-LAST:event_btnDropItemActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarPedido().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDropItem;
    private javax.swing.JComboBox<String> cmbCampaign;
    private javax.swing.JComboBox<String> cmbOfficialAgent;
    private javax.swing.JComboBox<String> cmbOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JTable tblOrderDetail;
    // End of variables declaration//GEN-END:variables

    private void loadCmbOfficialAgent(ArrayList<AgenteOficial> getOfficialAgents) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (AgenteOficial officialAgent : getOfficialAgents) {
            model.addElement(officialAgent);
        }
        cmbOfficialAgent.setModel(model);
    }

    private void loadCmbCampaign(ArrayList<Campania> campaigns) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Campania campaign : campaigns) {
            model.addElement(campaign);
        }
        cmbCampaign.setModel(model);
    }

    private void loadCmbClientOrder(ArrayList<VmPedidoCliente> clientsOrders) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (VmPedidoCliente order : clientsOrders) {
            model.addElement(order);
        }
        cmbOrder.setModel(model);
    }

    private void loadTableClientOrderDetail() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Producto", "Cantidad", "Precio", "Página", "Observaciones"};
        model.setColumnIdentifiers(columns);
        for (VmPedidoDetalle detail : details) {
            Object[] rows = {detail.getProductName(), detail.getAmount(), detail.getPrice(), detail.getPage(), detail.getObservations()};
            model.addRow(rows);
        }
        tblOrderDetail.setModel(model);
    }

}
