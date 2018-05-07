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
    private int pageNumber;
    private Date orderDate;
    private int idClient;
    private int idProduct; //VER
    private String observations;
    private boolean delivered;
    private Date deliveryDate;
    private boolean payed;
    private int idCampaign;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
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

    public Pedido() {
    }

    public Pedido(int idOrder, int pageNumber, Date orderDate, int idClient, int idProduct, String observations, boolean delivered, Date deliveryDate, boolean payed, int idCampaign) {
        this.idOrder = idOrder;
        this.pageNumber = pageNumber;
        this.orderDate = orderDate;
        this.idClient = idClient;
        this.idProduct = idProduct;
        this.observations = observations;
        this.delivered = delivered;
        this.deliveryDate = deliveryDate;
        this.payed = payed;
        this.idCampaign = idCampaign;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idOrder=" + idOrder + ", pageNumber=" + pageNumber + ", orderDate=" + orderDate + ", idClient=" + idClient + ", idProduct=" + idProduct + ", observations=" + observations + ", delivered=" + delivered + ", deliveryDate=" + deliveryDate + ", payed=" + payed + ", idCampaign=" + idCampaign + '}';
    }
    
    
}
