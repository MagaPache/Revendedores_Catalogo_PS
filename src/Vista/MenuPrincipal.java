/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorCampania;
import Modelo.Campania;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    GestorCampania gc = new GestorCampania();

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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaImportantNews = new javax.swing.JTextArea();
        lblBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmCampaigns = new javax.swing.JMenu();
        miNewCampaign = new javax.swing.JMenuItem();
        miCloseCampaign = new javax.swing.JMenuItem();
        jmFileClients = new javax.swing.JMenu();
        miNewClient = new javax.swing.JMenuItem();
        jmFileProducts = new javax.swing.JMenu();
        miNewProduct = new javax.swing.JMenuItem();
        jmFileOrders = new javax.swing.JMenu();
        miNewOrder = new javax.swing.JMenuItem();
        miCloseOrder = new javax.swing.JMenuItem();
        jmFilePayments = new javax.swing.JMenu();
        miNewPayment = new javax.swing.JMenuItem();
        jmFilePrizes = new javax.swing.JMenu();
        miNewPrize = new javax.swing.JMenuItem();
        miModifyPrize = new javax.swing.JMenuItem();
        jmConsults = new javax.swing.JMenu();
        mClientConsult = new javax.swing.JMenu();
        miClientConsult = new javax.swing.JMenuItem();
        miTotalDebts = new javax.swing.JMenuItem();
        miCampaignsDebts = new javax.swing.JMenuItem();
        mOrderConsult = new javax.swing.JMenu();
        miOrderConsult = new javax.swing.JMenuItem();
        mPriceConsult = new javax.swing.JMenu();
        miPriceActualStatus = new javax.swing.JMenuItem();
        jmReports = new javax.swing.JMenu();
        mClientsReports = new javax.swing.JMenu();
        miAnualBuyers = new javax.swing.JMenuItem();
        miBuyersCampaign = new javax.swing.JMenuItem();
        miDebtorsCampaign = new javax.swing.JMenuItem();
        mProductsReports = new javax.swing.JMenu();
        miTopPerClient = new javax.swing.JMenuItem();
        miTopPerType = new javax.swing.JMenuItem();
        mProfitsReports = new javax.swing.JMenu();
        miNetProfit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miPrintOrderDetail = new javax.swing.JMenuItem();
        mPrintClientInfo = new javax.swing.JMenuItem();
        jmHelp = new javax.swing.JMenu();
        jmAbout = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 641));
        setMinimumSize(new java.awt.Dimension(1280, 641));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Avisos Importantes"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(1115, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(1115, 170));

        txtaImportantNews.setEditable(false);
        txtaImportantNews.setColumns(20);
        txtaImportantNews.setRows(5);
        txtaImportantNews.setMinimumSize(new java.awt.Dimension(1350, 22));
        txtaImportantNews.setPreferredSize(new java.awt.Dimension(1350, 94));
        jScrollPane1.setViewportView(txtaImportantNews);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 400, 1240, 180);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/colorful-abstract-wallpapers-picture-Is-4K-Wallpaper.jpg"))); // NOI18N
        lblBackground.setMinimumSize(new java.awt.Dimension(1280, 620));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-10, -20, 1280, 620);

        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 4));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(208, 30));

        jmFile.setText("Archivo");

        jmCampaigns.setText("Campañas");

        miNewCampaign.setText("Nueva");
        miNewCampaign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewCampaignActionPerformed(evt);
            }
        });
        jmCampaigns.add(miNewCampaign);

        miCloseCampaign.setText("Cerrar");
        jmCampaigns.add(miCloseCampaign);

        jmFile.add(jmCampaigns);

        jmFileClients.setText("Clientes");

        miNewClient.setText("Nuevo");
        miNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewClientActionPerformed(evt);
            }
        });
        jmFileClients.add(miNewClient);

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

        miCloseOrder.setText("Cerrar Pedido");
        miCloseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCloseOrderActionPerformed(evt);
            }
        });
        jmFileOrders.add(miCloseOrder);

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

        jmFile.add(jmFilePrizes);

        jMenuBar1.add(jmFile);

        jmConsults.setText("Consultas");

        mClientConsult.setText("Clientes");

        miClientConsult.setText("Consulta de Cliente");
        miClientConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientConsultActionPerformed(evt);
            }
        });
        mClientConsult.add(miClientConsult);

        miTotalDebts.setText("Saldo Total Adeudado");
        miTotalDebts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTotalDebtsActionPerformed(evt);
            }
        });
        mClientConsult.add(miTotalDebts);

        miCampaignsDebts.setText("Saldo Adeudado por Campaña");
        miCampaignsDebts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCampaignsDebtsActionPerformed(evt);
            }
        });
        mClientConsult.add(miCampaignsDebts);

        jmConsults.add(mClientConsult);

        mOrderConsult.setText("Pedidos");

        miOrderConsult.setText("Consulta de Pedido");
        miOrderConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOrderConsultActionPerformed(evt);
            }
        });
        mOrderConsult.add(miOrderConsult);

        jmConsults.add(mOrderConsult);

        mPriceConsult.setText("Premios");

        miPriceActualStatus.setText("Estado Actual");
        miPriceActualStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPriceActualStatusActionPerformed(evt);
            }
        });
        mPriceConsult.add(miPriceActualStatus);

        jmConsults.add(mPriceConsult);

        jMenuBar1.add(jmConsults);

        jmReports.setText("Reportes");

        mClientsReports.setText("Clientes");

        miAnualBuyers.setText("Ranking Compradores Anuales");
        miAnualBuyers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnualBuyersActionPerformed(evt);
            }
        });
        mClientsReports.add(miAnualBuyers);

        miBuyersCampaign.setText("Mejores Compradores por Campaña");
        miBuyersCampaign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuyersCampaignActionPerformed(evt);
            }
        });
        mClientsReports.add(miBuyersCampaign);

        miDebtorsCampaign.setText("Deudores por Campaña");
        miDebtorsCampaign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDebtorsCampaignActionPerformed(evt);
            }
        });
        mClientsReports.add(miDebtorsCampaign);

        jmReports.add(mClientsReports);

        mProductsReports.setText("Productos");

        miTopPerClient.setText("Más vendidos por Cliente");
        miTopPerClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTopPerClientActionPerformed(evt);
            }
        });
        mProductsReports.add(miTopPerClient);

        miTopPerType.setText("Ventas por tipo de Producto");
        miTopPerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTopPerTypeActionPerformed(evt);
            }
        });
        mProductsReports.add(miTopPerType);

        jmReports.add(mProductsReports);

        mProfitsReports.setText("Ganancias");

        miNetProfit.setText("Ganancia Neta por Campaña");
        miNetProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNetProfitActionPerformed(evt);
            }
        });
        mProfitsReports.add(miNetProfit);

        jmReports.add(mProfitsReports);

        jMenuBar1.add(jmReports);

        jMenu4.setText("Imprimir");

        miPrintOrderDetail.setText("Detalle de Pedido");
        miPrintOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPrintOrderDetailActionPerformed(evt);
            }
        });
        jMenu4.add(miPrintOrderDetail);

        mPrintClientInfo.setText("Información de Clientes");
        mPrintClientInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPrintClientInfoActionPerformed(evt);
            }
        });
        jMenu4.add(mPrintClientInfo);

        jMenuBar1.add(jMenu4);

        jmHelp.setText("Ayuda");
        jMenuBar1.add(jmHelp);

        jmAbout.setText("Acerca de");
        jMenuBar1.add(jmAbout);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            ArrayList<Campania> campaigns = new ArrayList<>();
            campaigns = gc.getCampaingSoonToClose();
            String message = "";
            String message2 = "";
            for (Campania campaign : campaigns) {
                message += "La Campaña " + campaign.getDescription() + " está por cerrar! Fecha de cierre: "+ campaign.getCloseDate() +" \n\n";
            }
            ArrayList<Campania> campaignsArrival = new ArrayList<>();
            campaignsArrival = gc.getCampaingSoonArrival();
            for (Campania campania : campaignsArrival) {
                message2 += "El pedido de la Campaña " + campania.getDescription() + " está por llegar! Fecha de Arribo: " + campania.getArrivalDate() + " \n\n";
            }
            txtaImportantNews.setText(message + "\n" + message2);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void miNewCampaignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewCampaignActionPerformed
        try {
            // TODO add your handling code here:
            AltaCampania ac = new AltaCampania();
            ac.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miNewCampaignActionPerformed

    private void miBuyersCampaignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuyersCampaignActionPerformed
        try {
            // TODO add your handling code here:
            ReporteTopComprasCliente rtcc = new ReporteTopComprasCliente();
            rtcc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miBuyersCampaignActionPerformed

    private void miTopPerClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTopPerClientActionPerformed
        try {
            // TODO add your handling code here:
            ReporteTopProductosPorCliente tppc = new ReporteTopProductosPorCliente();
            tppc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miTopPerClientActionPerformed

    private void miClientConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientConsultActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaCliente cc = new ConsultaCliente();
            cc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miClientConsultActionPerformed

    private void miTotalDebtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTotalDebtsActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaSaldoCliente csc = new ConsultaSaldoCliente();
            csc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miTotalDebtsActionPerformed

    private void miCampaignsDebtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCampaignsDebtsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_miCampaignsDebtsActionPerformed

    private void miOrderConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOrderConsultActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaPedidoPorCliente cppc = new ConsultaPedidoPorCliente();
            cppc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miOrderConsultActionPerformed

    private void miPriceActualStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPriceActualStatusActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaEstadoPremio cep = new ConsultaEstadoPremio();
            cep.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miPriceActualStatusActionPerformed

    private void miAnualBuyersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnualBuyersActionPerformed
        try {
            // TODO add your handling code here:
            ReporteTopComprasAnual tca = new ReporteTopComprasAnual();
            tca.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miAnualBuyersActionPerformed

    private void miDebtorsCampaignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDebtorsCampaignActionPerformed
        try {
            // TODO add your handling code here:
            ReporteDeudoresCampania rdc = new ReporteDeudoresCampania();
            rdc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miDebtorsCampaignActionPerformed

    private void miTopPerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTopPerTypeActionPerformed
        try {
            // TODO add your handling code here:
            ReporteProductosPorTipo  ppt = new ReporteProductosPorTipo();
            ppt.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miTopPerTypeActionPerformed

    private void miNetProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNetProfitActionPerformed
        try {
            // TODO add your handling code here:
            ReporteGananciaNeta rgn = new ReporteGananciaNeta();
            rgn.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miNetProfitActionPerformed

    private void miPrintOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPrintOrderDetailActionPerformed
        try {
            // TODO add your handling code here:
            ImprimirDetallePedido idp = new ImprimirDetallePedido();
            idp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miPrintOrderDetailActionPerformed

    private void mPrintClientInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPrintClientInfoActionPerformed
        try {
            // TODO add your handling code here:
            ConsultaCliente cc = new ConsultaCliente();
            cc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mPrintClientInfoActionPerformed

    private void miCloseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCloseOrderActionPerformed
        try {
            // TODO add your handling code here:
            CerrarPedido cp = new CerrarPedido();
            cp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miCloseOrderActionPerformed

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
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmAbout;
    private javax.swing.JMenu jmCampaigns;
    private javax.swing.JMenu jmConsults;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmFileClients;
    private javax.swing.JMenu jmFileOrders;
    private javax.swing.JMenu jmFilePayments;
    private javax.swing.JMenu jmFilePrizes;
    private javax.swing.JMenu jmFileProducts;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenu jmReports;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JMenu mClientConsult;
    private javax.swing.JMenu mClientsReports;
    private javax.swing.JMenu mOrderConsult;
    private javax.swing.JMenu mPriceConsult;
    private javax.swing.JMenuItem mPrintClientInfo;
    private javax.swing.JMenu mProductsReports;
    private javax.swing.JMenu mProfitsReports;
    private javax.swing.JMenuItem miAnualBuyers;
    private javax.swing.JMenuItem miBuyersCampaign;
    private javax.swing.JMenuItem miCampaignsDebts;
    private javax.swing.JMenuItem miClientConsult;
    private javax.swing.JMenuItem miCloseCampaign;
    private javax.swing.JMenuItem miCloseOrder;
    private javax.swing.JMenuItem miDebtorsCampaign;
    private javax.swing.JMenuItem miModifyPrize;
    private javax.swing.JMenuItem miNetProfit;
    private javax.swing.JMenuItem miNewCampaign;
    private javax.swing.JMenuItem miNewClient;
    private javax.swing.JMenuItem miNewOrder;
    private javax.swing.JMenuItem miNewPayment;
    private javax.swing.JMenuItem miNewPrize;
    private javax.swing.JMenuItem miNewProduct;
    private javax.swing.JMenuItem miOrderConsult;
    private javax.swing.JMenuItem miPriceActualStatus;
    private javax.swing.JMenuItem miPrintOrderDetail;
    private javax.swing.JMenuItem miTopPerClient;
    private javax.swing.JMenuItem miTopPerType;
    private javax.swing.JMenuItem miTotalDebts;
    private javax.swing.JTextArea txtaImportantNews;
    // End of variables declaration//GEN-END:variables

}
