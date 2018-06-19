/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class VmPedidoNoEntregado {
    
    private int idOrder;
    private String orderDate;
    private String clientName;
    private String campaignName;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public VmPedidoNoEntregado() {
    }

    public VmPedidoNoEntregado(int idOrder, String orderDate, String clientName, String campaignName) {
        this.idOrder = idOrder;
        this.orderDate = orderDate;
        this.clientName = clientName;
        this.campaignName = campaignName;
    }

    @Override
    public String toString() {
        return "VmPedidoNoEntregado{" + "idOrder=" + idOrder + ", orderDate=" + orderDate + ", clientName=" + clientName + ", campaignName=" + campaignName + '}';
    }
    
    
    
}
