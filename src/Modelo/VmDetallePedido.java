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
public class VmDetallePedido {
    
    private int idOrderDetail;
    private int idOrder;
    private String productName;
    private int amount;
    private float price;
    private int page;
    private String observations;

    public int getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(int idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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
    

    public VmDetallePedido() {
    }

    public VmDetallePedido(int idOrderDetail, int idOrder, String productName, int amount, float price, int page, String observations) {
        this.idOrderDetail = idOrderDetail;
        this.idOrder = idOrder;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
        this.page = page;
        this.observations = observations;
    }
    

    @Override
    public String toString() {
        return "VmDetallePedido{" + "idOrderDetail=" + idOrderDetail + ", idOrder=" + idOrder + ", productName=" + productName + ", amount=" + amount + ", price=" + price + ", page=" + page + '}';
    }
    
    
    
}
