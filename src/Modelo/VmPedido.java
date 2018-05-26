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
public class VmPedido {
    
    private int idOrder;
    private String clientName;
    private String productName;
    private int amount;
    private float price;
    private int page;
    private String observations;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public VmPedido() {
    }

    public VmPedido(int idOrder, String clientName, String productName, int amount, float price, int page, String observations) {
        this.idOrder = idOrder;
        this.clientName = clientName;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
        this.page = page;
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "VmPedido{" + "idOrder=" + idOrder + ", clientName=" + clientName + ", productName=" + productName + ", amount=" + amount + ", price=" + price + ", page=" + page + ", observations=" + observations + '}';
    }    
    
    
}
