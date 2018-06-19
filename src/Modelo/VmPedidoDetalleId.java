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
public class VmPedidoDetalleId {
    
    private int idOrder;
    private int idDetail;
    private String clientName;
    private String productName;
    private int amount;
    private float price;
    private int pageNumber;
    private String observations;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public VmPedidoDetalleId() {
    }

    public VmPedidoDetalleId(int idOrder, int idDetail, String clientName, String productName, int amount, float price, int pageNumber, String observations) {
        this.idOrder = idOrder;
        this.idDetail = idDetail;
        this.clientName = clientName;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
        this.pageNumber = pageNumber;
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "VmPedidoDetalleId{" + "idOrder=" + idOrder + ", idDetail=" + idDetail + ", clientName=" + clientName + ", productName=" + productName + ", amount=" + amount + ", price=" + price + ", pageNumber=" + pageNumber + ", observations=" + observations + '}';
    }
    
    
    
}
