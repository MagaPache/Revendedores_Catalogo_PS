/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorAgenteOficial;
import Controlador.GestorCampania;
import Controlador.GestorCliente;
import Controlador.GestorPedido;
import Modelo.AgenteOficial;
import Modelo.Campania;
import Modelo.VmPedidoCliente;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Usuario
 */
public class ConsultaSaldoAdeudadoCampania extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaSaldoAdeudadoCampania
     */
    GestorAgenteOficial gao = new GestorAgenteOficial();
    GestorCampania gc = new GestorCampania();
    GestorPedido gp = new GestorPedido();
    GestorCliente gcl = new GestorCliente();

    public ConsultaSaldoAdeudadoCampania() throws SQLException {
        initComponents();
        loadCmbOfficialAgent(gao.getOfficialAgents());
        loadCmbCampaignsPerOfficialAgent(gc.getCampaignPerOfficialAgent(((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent()));
        int idAgent = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        int idCampaign = ((Campania) cmbCampaign.getSelectedItem()).getIdCampaign();
        loadCmbClient(gp.getClientOrderByCampaign(idCampaign, idAgent));
        int idCliente = ((VmPedidoCliente) cmbClient.getSelectedItem()).getIdClient();
        float montoAdeudado = gcl.getAmountOwedPerClientPerCampaign(idCliente, idAgent, idCampaign);
        float montoAbonado = gcl.getAmountPayedPerClientPerCampaign(idCliente, idAgent, idCampaign);
        float saldoCliente = montoAdeudado - montoAbonado;
        lblAmountOwed.setText(Float.toString(saldoCliente));
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
        cmbCampaign = new javax.swing.JComboBox<>();
        cmbOfficialAgent = new javax.swing.JComboBox<>();
        cmbClient = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAmountOwed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Agente Oficial");

        jLabel2.setText("Campaña");

        jLabel3.setText("Cliente");

        cmbCampaign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCampaign.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCampaignItemStateChanged(evt);
            }
        });

        cmbOfficialAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOfficialAgent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOfficialAgentItemStateChanged(evt);
            }
        });

        cmbClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClientItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setText("Saldo Adeudado");

        jLabel5.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblAmountOwed, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAmountOwed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addContainerGap())
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbOfficialAgent, 0, 133, Short.MAX_VALUE)
                            .addComponent(cmbClient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void cmbCampaignItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCampaignItemStateChanged
        // TODO add your handling code here:
        int idAgent = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                if (cmbCampaign.getItemCount() > 0) {
                    int idCampaign = ((Campania) cmbCampaign.getSelectedItem()).getIdCampaign();
                    System.out.println(idAgent);
                    System.out.println(idCampaign);
                    loadCmbClient(gp.getClientOrderByCampaign(idCampaign, idAgent));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmbCampaignItemStateChanged

    private void cmbClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClientItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cmbCampaign.getItemCount() > 0) {
                try {
                    //meter codigo
                    int idAgente = ((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent();
                    int idCampaign = ((Campania) cmbCampaign.getSelectedItem()).getIdCampaign();
                    int idCliente = ((VmPedidoCliente) cmbClient.getSelectedItem()).getIdClient();
                    float montoAdeudado = gcl.getAmountOwedPerClientPerCampaign(idCliente, idAgente, idCampaign);
                    float montoAbonado = gcl.getAmountPayedPerClientPerCampaign(idCliente, idAgente, idCampaign);
                    float saldoCliente = montoAdeudado - montoAbonado;
                    lblAmountOwed.setText(Float.toString(saldoCliente));
                } catch (SQLException ex) {
                    Logger.getLogger(AltaCobro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_cmbClientItemStateChanged

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
            java.util.logging.Logger.getLogger(ConsultaSaldoAdeudadoCampania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaSaldoAdeudadoCampania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaSaldoAdeudadoCampania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaSaldoAdeudadoCampania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConsultaSaldoAdeudadoCampania().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaSaldoAdeudadoCampania.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCampaign;
    private javax.swing.JComboBox<String> cmbClient;
    private javax.swing.JComboBox<String> cmbOfficialAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmountOwed;
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

    private void loadCmbClient(ArrayList<VmPedidoCliente> clientsOrders) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (VmPedidoCliente order : clientsOrders) {
            model.addElement(order);
        }
        cmbClient.setModel(model);
    }
}
