/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Pedido {
    
    private int idOrder;
    private String orderDate;
    private int idClient;
    private boolean delivered;
    private String deliveryDate;
    private boolean payed;
    private int idCampaign;
    private String observations;

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

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public int getIdCampaign() {
        return idCampaign;
    }

    public void setIdCampaign(int idCampaign) {
        this.idCampaign = idCampaign;
    }
    
    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Pedido() {
    }

    public Pedido(int idOrder, String orderDate, int idClient, boolean delivered, String deliveryDate, boolean payed, int idCampaign, String observations) {
        this.idOrder = idOrder;
        this.orderDate = orderDate;
        this.idClient = idClient;
        this.delivered = delivered;
        this.deliveryDate = deliveryDate;
        this.payed = payed;
        this.idCampaign = idCampaign;
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idOrder=" + idOrder + ", orderDate=" + orderDate + ", idClient=" + idClient + ", delivered=" + delivered + ", deliveryDate=" + deliveryDate + ", payed=" + payed + ", idCampaign=" + idCampaign + ", observations=" + observations + '}';
    }
    
    
    
    
}
