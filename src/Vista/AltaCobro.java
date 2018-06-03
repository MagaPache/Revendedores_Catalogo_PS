/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorAgenteOficial;
import Controlador.GestorCampania;
import Controlador.GestorCobro;
import Controlador.GestorPedido;
import Modelo.AgenteOficial;
import Modelo.Campania;
import Modelo.Cobro;
import Modelo.VmCobro;
import Modelo.VmPedidoCliente;
import Modelo.VmPedidoDetalle;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class AltaCobro extends javax.swing.JFrame {

    /**
     * Creates new form AltaPago
     */
    GestorAgenteOficial gao = new GestorAgenteOficial();
    GestorCampania gc = new GestorCampania();
    GestorPedido gp = new GestorPedido();
    GestorCobro gco = new GestorCobro();
    ArrayList<VmPedidoDetalle> orderDetailed = new ArrayList<>();
    ArrayList<VmCobro> payments = new ArrayList<>();
    Date paymentDate;
    String fechaPago;

    public AltaCobro() throws SQLException {
        initComponents();
        loadCmbOfficialAgent(gao.getOfficialAgents());
        loadCmbCampaignsPerOfficialAgent(gc.getCampaignPerOfficialAgent(((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent()));
        int idAgent = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        int idCampaign = ((Campania) cmbCampaign.getSelectedItem()).getIdCampaign();
        loadCmbClientOrder(gp.getClientOrderByCampaign(idCampaign, idAgent));
        int idPedido = ((VmPedidoCliente) cmbClientOrder.getSelectedItem()).getIdOrder();
        lblOrderNumber.setText(Integer.toString(idPedido));
        orderDetailed = gp.getOrdersWithDetails(idPedido);
        loadTableClientOrderDetail();
        payments = gco.getAllPayments();
        loadTablePayments();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbOfficialAgent = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbCampaign = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbClientOrder = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblOrderNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientOrderDetail = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtAmountCharged = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jdcPaymentDate = new com.toedter.calendar.JDateChooser();
        btnSavePayment = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPayments = new javax.swing.JTable();
        btnSearchPayment = new javax.swing.JButton();
        txtSearchPayment = new javax.swing.JTextField();
        btnUpdateTable = new javax.swing.JButton();
        btnModifyPayment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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

        jLabel3.setText("Cliente");

        cmbClientOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClientOrder.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClientOrderItemStateChanged(evt);
            }
        });

        jLabel4.setText("Número de Pedido");

        lblOrderNumber.setText("jLabel7");

        tblClientOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblClientOrderDetail);

        jLabel5.setText("Monto Cobrado");

        jLabel6.setText("Fecha Pago");

        btnSavePayment.setText("Guardar");
        btnSavePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePaymentActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOrderNumber))
                        .addComponent(cmbClientOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSavePayment)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtAmountCharged, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jdcPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnCancel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbClientOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblOrderNumber))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAmountCharged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jdcPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavePayment)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblPayments.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPayments);

        btnSearchPayment.setText("Buscar");
        btnSearchPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPaymentActionPerformed(evt);
            }
        });

        btnUpdateTable.setText("Actualizar");
        btnUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTableActionPerformed(evt);
            }
        });

        btnModifyPayment.setText("Modificar");
        btnModifyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModifyPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearchPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchPayment)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchPayment)
                    .addComponent(txtSearchPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateTable)
                    .addComponent(btnModifyPayment))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCampaignItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCampaignItemStateChanged
//        try {
//            // TODO add your handling code here:
//            loadCmbOfficialAgent(gao.getOfficialAgents());
//        } catch (SQLException ex) {
//            Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
//        }
        int idAgent = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                if (cmbCampaign.getItemCount() > 0) {
                    int idCampaign = ((Campania) cmbCampaign.getSelectedItem()).getIdCampaign();
                    System.out.println(idAgent);
                    System.out.println(idCampaign);
                    loadCmbClientOrder(gp.getClientOrderByCampaign(idCampaign, idAgent));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_cmbCampaignItemStateChanged

    private void cmbOfficialAgentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOfficialAgentItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                if (cmbOfficialAgent.getItemCount() > 0) {
                    int idAgente = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
                    loadCmbCampaignsPerOfficialAgent(gc.getCampaignPerOfficialAgent(idAgente));
                    System.out.println(idAgente);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmbOfficialAgentItemStateChanged

    private void cmbClientOrderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClientOrderItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cmbCampaign.getItemCount() > 0) {
                try {
                    int idPedido = ((VmPedidoCliente) cmbClientOrder.getSelectedItem()).getIdOrder();
                    lblOrderNumber.setText(Integer.toString(idPedido));
                    orderDetailed = gp.getOrdersWithDetails(idPedido);
                    loadTableClientOrderDetail();
                } catch (SQLException ex) {
                    Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_cmbClientOrderItemStateChanged

    private void btnSavePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePaymentActionPerformed
        try {
            // TODO add your handling code here:
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            paymentDate = jdcPaymentDate.getDate();
            fechaPago= sdf.format(paymentDate);
            
            Cobro c = new Cobro();
            c.setIdOrder(Integer.parseInt(lblOrderNumber.getText()));
            c.setAmountCharged(Float.parseFloat(txtAmountCharged.getText()));
            c.setPaymentDate(fechaPago);
            gco.addPayment(c);
        } catch (SQLException ex) {
            Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSavePaymentActionPerformed

    private void btnUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTableActionPerformed
        try {
            // TODO add your handling code here:
            payments = gco.getAllPayments();
            loadTablePayments();
        } catch (SQLException ex) {
            Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateTableActionPerformed

    private void btnSearchPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPaymentActionPerformed
        try {
            // TODO add your handling code here:
            payments = gco.getPaymentsByClient(txtSearchPayment.getText());
            loadTablePayments();
        } catch (SQLException ex) {
            Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchPaymentActionPerformed

    private void btnModifyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyPaymentActionPerformed
        try {
            // TODO add your handling code here:
            ModificarCobro mc = new ModificarCobro();
            int cobro = (int) tblPayments.getModel().getValueAt(tblPayments.getSelectedRow(), 0);
            int pedido = (int) tblPayments.getModel().getValueAt(tblPayments.getSelectedRow(), 1);
            String cliente = (String) tblPayments.getModel().getValueAt(tblPayments.getSelectedRow(), 2);
            float montoAbonado = (float) tblPayments.getModel().getValueAt(tblPayments.getSelectedRow(), 3);
            String fechaPago = (String) tblPayments.getModel().getValueAt(tblPayments.getSelectedRow(), 4);
            String campania = (String) tblPayments.getModel().getValueAt(tblPayments.getSelectedRow(), 5);
            String agente = (String) tblPayments.getModel().getValueAt(tblPayments.getSelectedRow(), 6);
            SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy-MM-dd");
            Date payDate = formatoTexto.parse(fechaPago);
            mc.lblOfficialAgent.setText(agente);
            mc.lblCampaign.setText(campania);
            mc.lblClientName.setText(cliente);
            mc.lblOrderNumber.setText(Integer.toString(pedido));
            mc.lblPaymentNumber.setText(Integer.toString(cobro));
            mc.txtAmountCharged.setText(Float.toString(montoAbonado));
            mc.jdcPaymentDate.setDate(payDate);
            mc.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModifyPaymentActionPerformed

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
            java.util.logging.Logger.getLogger(AltaCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AltaCobro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnModifyPayment;
    private javax.swing.JButton btnSavePayment;
    private javax.swing.JButton btnSearchPayment;
    private javax.swing.JButton btnUpdateTable;
    private javax.swing.JComboBox<String> cmbCampaign;
    private javax.swing.JComboBox<String> cmbClientOrder;
    private javax.swing.JComboBox<String> cmbOfficialAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcPaymentDate;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JTable tblClientOrderDetail;
    private javax.swing.JTable tblPayments;
    private javax.swing.JTextField txtAmountCharged;
    private javax.swing.JTextField txtSearchPayment;
    // End of variables declaration//GEN-END:variables

    private void loadCmbOfficialAgent(ArrayList<AgenteOficial> getOfficialAgents) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (AgenteOficial officialAgent : getOfficialAgents) {
            model.addElement(officialAgent);
        }
        cmbOfficialAgent.setModel(model);
    }

    private void loadCmbCampaignsPerOfficialAgent(ArrayList<Campania> campaigns) {
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
        cmbClientOrder.setModel(model);
    }

    private void loadTableClientOrderDetail() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Producto", "Cantidad", "Precio", "Página", "Observaciones"};
        model.setColumnIdentifiers(columns);
        for (VmPedidoDetalle detail : orderDetailed) {
            Object[] rows = {detail.getProductName(), detail.getAmount(), detail.getPrice(), detail.getPage(), detail.getObservations()};
            model.addRow(rows);
        }
        tblClientOrderDetail.setModel(model);
    }
    
    private void loadTablePayments() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Número Cobro","Número Pedido", "Cliente", "Monto Abonado", "Fecha Pago", "Campaña", "Agente Oficial"};
        model.setColumnIdentifiers(columns);
        for (VmCobro pay : payments) {
            Object[] rows = {pay.getIdPayment(), pay.getIdOrder(), pay.getClientName(), pay.getAmount(), pay.getPaymentDate(), pay.getCampaignName(), pay.getAgentName()};
            model.addRow(rows);
        }
        tblPayments.setModel(model);
    }

}
