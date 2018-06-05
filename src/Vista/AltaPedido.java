/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorAgenteOficial;
import Controlador.GestorCampania;
import Controlador.GestorCliente;
import Controlador.GestorDetallePedido;
import Controlador.GestorPedido;
import Controlador.GestorProducto;
import Modelo.AgenteOficial;
import Modelo.Campania;
import Modelo.Cliente;
import Modelo.DetallePedido;
import Modelo.Pedido;
import Modelo.VmProducto;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class AltaPedido extends javax.swing.JFrame {

    /**
     * Creates new form AltaPedido
     */
    GestorProducto gpr = new GestorProducto();
    GestorCliente gc = new GestorCliente();
    GestorCampania gca = new GestorCampania();
    GestorAgenteOficial gao = new GestorAgenteOficial();
    GestorPedido gp = new GestorPedido();
    GestorDetallePedido gdp = new GestorDetallePedido();

    ArrayList<Object[]> listado = new ArrayList<>();
    ArrayList<VmProducto> products = new ArrayList<>();
    ArrayList<Cliente> clients = new ArrayList<>();
    Object[] datos;
    final JDialog dialog = new JDialog();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date fecha = new Date();
    int codigoPedido;
    String fechaActual;

    public AltaPedido() throws SQLException {
        initComponents();
        loadOfficialAgent(gao.getOfficialAgents());
        loadCmbCampaign(gca.getCampaignPerOfficialAgent(((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent()));
        clients = gc.getAllClients();
        products = gpr.getAllProducts();
        codigoPedido = gp.getMaxCodigo() + 1;
        loadTableProducts();
        loadTableClients();
        fechaActual = sdf.format(fecha);
        lblDate.setText(fechaActual);

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
        lblDate = new javax.swing.JLabel();
        spnPageNumber = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        cmbOfficialAgent = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbCampaign = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        txtProductName = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spnAmount = new javax.swing.JSpinner();
        btnNewProduct = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        btnNewClient = new javax.swing.JButton();
        btnAddToOrder = new javax.swing.JButton();
        btnSaveOrder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrderDetail = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaObservations = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Fecha");

        jLabel2.setText("Página");

        lblDate.setText("jLabel8");

        jLabel9.setText("Agente Oficial");

        cmbOfficialAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOfficialAgent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOfficialAgentItemStateChanged(evt);
            }
        });

        jLabel10.setText("Campaña");

        cmbCampaign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Productos"));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProducts);

        btnSearchProduct.setText("Buscar");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio Catálogo");

        jLabel5.setText("Cantidad");

        btnNewProduct.setText("Agregar");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewProduct))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Clientes"));

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblClients);

        btnNewClient.setText("Agregar");
        btnNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewClient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddToOrder.setText("Agregar a Pedido");
        btnAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToOrderActionPerformed(evt);
            }
        });

        btnSaveOrder.setText("Finalizar Pedido");
        btnSaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrderActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Detalle de Pedido"));

        lstOrderDetail.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstOrderDetail);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("Observaciones");

        txtaObservations.setColumns(20);
        txtaObservations.setRows(5);
        jScrollPane4.setViewportView(txtaObservations);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel2)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(spnPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblDate))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSaveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 661, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbOfficialAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAddToOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveOrder)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOfficialAgentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOfficialAgentItemStateChanged
        // TODO add your handling code here:
        try {
            loadCmbCampaign(gca.getCampaignPerOfficialAgent(((AgenteOficial) cmbOfficialAgent.getSelectedItem()).getIdOfficialAgent()));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmbOfficialAgentItemStateChanged

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        // TODO add your handling code here:
        try {
            if (!txtProductName.getText().equals("")) {
                String search = txtProductName.getText();
                loadTableProductsSearch(search);
            } else {
                JOptionPane.showMessageDialog(dialog, "No se ha encontrado un Producto con ese nombre");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        datos = new Object[9];

        datos[1] = spnPageNumber.getValue();
        datos[2] = tblProducts.getModel().getValueAt(tblProducts.getSelectedRow(), 0);
        //datos[2] = tblProducts.getValueAt(tblProducts.getSelectedRow(), 0);
        datos[3] = tblProducts.getModel().getValueAt(tblProducts.getSelectedRow(), 1);
        //datos[3] = tblProducts.getValueAt(tblProducts.getSelectedRow(), 1);        
        datos[4] = Float.parseFloat(txtPrice.getText());
        datos[5] = spnAmount.getValue();

    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewClientActionPerformed
        // TODO add your handling code here:
        if (datos != null) {
            //datos[6] = tblClients.getValueAt(tblProducts.getSelectedRow(), 0);
            //datos[7] = tblClients.getValueAt(tblProducts.getSelectedRow(), 1);
            datos[6] = tblClients.getModel().getValueAt(tblClients.getSelectedRow(), 0);
            datos[7] = tblClients.getModel().getValueAt(tblClients.getSelectedRow(), 1);
//            for (Object[] objects : listado) {
//                if(objects[6] != datos[6]){
//                    codigoPedido++; 
//                    break;
//                }                
//                
//            }
            //codigoPedido++;
        } else {
            JOptionPane.showMessageDialog(dialog, "Debe seleccionar un producto antes de elegir un cliente");
        }
    }//GEN-LAST:event_btnNewClientActionPerformed

    private void btnAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToOrderActionPerformed
        // TODO add your handling code here:
        boolean exists = false;
        int valor = 0;
        datos[0] = codigoPedido;
        datos[8] = txtaObservations.getText();
        if (Validate()) {
            for (Object[] objects : listado) {
                if (objects[6] == datos[6]) {
//                    datos[0] = objects[0];                     
//                    break;
                    exists = true;
                    valor = (int) objects[0];
                }

//                }else{
//                    datos[0] = codigoPedido;
//                    break;
//                }
            }
            if (exists) {
                datos[0] = valor;
            } else {
                datos[0] = codigoPedido;
                codigoPedido++;
            }
            listado.add(datos);
            loadlstOrderDetail(listado);
        }
    }//GEN-LAST:event_btnAddToOrderActionPerformed

    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed
        // TODO add your handling code here:
        DetallePedido dp = new DetallePedido();
        Pedido p = new Pedido();
        Pedido p2 = null;
        try {
            for (Object[] objects : listado) {
                p.setIdOrder(Integer.parseInt(objects[0].toString()));
                p.setIdClient(Integer.parseInt(objects[6].toString()));
                p.setOrderDate(lblDate.getText());
                p.setIdCampaign(((Campania) cmbCampaign.getSelectedItem()).getIdCampaign());
                dp.setPage(Integer.parseInt(objects[1].toString()));
                dp.setIdProduct(Integer.parseInt(objects[2].toString()));
                dp.setPrice(Float.parseFloat(objects[4].toString()));
                dp.setAmount(Integer.parseInt(objects[5].toString()));
                dp.setObservations(objects[8].toString());
                p2 = gp.getOrder(p.getIdOrder());
                if (p2.getIdOrder() == 0) {
                    gp.addOrder(p);
                }
                dp.setIdOrder(Integer.parseInt(objects[0].toString()));
                gdp.addOrderDetail(dp);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnSaveOrderActionPerformed

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
            java.util.logging.Logger.getLogger(AltaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AltaPedido().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AltaPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToOrder;
    private javax.swing.JButton btnNewClient;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JComboBox<String> cmbCampaign;
    private javax.swing.JComboBox<String> cmbOfficialAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDate;
    private javax.swing.JList<String> lstOrderDetail;
    private javax.swing.JSpinner spnAmount;
    private javax.swing.JSpinner spnPageNumber;
    private javax.swing.JTable tblClients;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextArea txtaObservations;
    // End of variables declaration//GEN-END:variables

    private void loadlstOrderDetail(ArrayList<Object[]> listado) {
        DefaultListModel model = new DefaultListModel();
        for (Object[] object : listado) {
            String view = object[0].toString() + "- " + object[2].toString() + "- " + object[3].toString() + object[4].toString() + "- " + object[5].toString() + ", " + object[6].toString() + "- " + object[7].toString() + " Obs: " + object[8].toString();
            model.addElement(view);
        }
        lstOrderDetail.setModel(model);
    }

    private void loadCmbCampaign(ArrayList<Campania> campaigns) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Campania campaign : campaigns) {
            model.addElement(campaign);
        }
        cmbCampaign.setModel(model);
    }

    private void loadOfficialAgent(ArrayList<AgenteOficial> OfficialAgents) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (AgenteOficial officialAgent : OfficialAgents) {
            model.addElement(officialAgent);
        }
        cmbOfficialAgent.setModel(model);
    }

    private void loadTableProductsSearch(String nameProduct) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Id", "Producto", "Código", "Tipo Producto", "Categoría", "Precio Unitario", "Agente Oficial"};
        model.setColumnIdentifiers(columns);
        products = gpr.getProductByName(nameProduct);
        for (VmProducto product : products) {
            Object[] rows = {product.getIdProduct(), product.getProductName(), product.getProductCode(), product.getProductType(), product.getProductCategory(), product.getUnitPrice(), product.getAgentName()};
            model.addRow(rows);
        }
        tblProducts.setModel(model);
    }

    private void loadTableProducts() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Id", "Producto", "Código", "Tipo Producto", "Categoría", "Precio Unitario", "Agente Oficial"};
        model.setColumnIdentifiers(columns);
        for (VmProducto product : products) {
            Object[] rows = {product.getIdProduct(), product.getProductName(), product.getProductCode(), product.getProductType(), product.getProductCategory(), product.getUnitPrice(), product.getAgentName()};
            model.addRow(rows);
        }
        tblProducts.setModel(model);
    }

    private void loadTableClients() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Id", "Nombre", " Email", "Dirección", "Teléfono"};
        model.setColumnIdentifiers(columns);
        for (Cliente client : clients) {
            Object[] rows = {client.getIdClient(), client.getClientName(), client.getEmail(), client.getAddress(), client.getTelephone()};
            model.addRow(rows);
        }
        tblClients.setModel(model);
    }

    private boolean Validate() {
        if ((int) spnPageNumber.getValue() == -1) {
            JOptionPane.showMessageDialog(dialog, "Debe seleccionar una página valida");
            return false;
        }
        if (datos[1] == null || datos[2] == null || datos[3] == null || datos[4] == null || datos[5] == null) {
            JOptionPane.showMessageDialog(dialog, "Debe completar correctamente los datos del producto");
            return false;
        }
        if (datos[6] == null || datos[7] == null) {
            JOptionPane.showMessageDialog(dialog, "Debe seleccionar un cliente valido");
            return false;
        }
        if (datos[8] == null) {
            JOptionPane.showMessageDialog(dialog, "Debe agregar una observación");
            return false;
        }

        return true;
    }

}
