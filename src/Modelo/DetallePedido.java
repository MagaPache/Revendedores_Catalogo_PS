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
public class DetallePedido {
    
    private int idOrderDetail;
    private int idOrder;
    private int idProduct;
    private int amount;
    private float price;

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

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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

    public DetallePedido() {
    }

    public DetallePedido(int idOrderDetail, int idOrder, int idProduct, int amount, float price) {
        this.idOrderDetail = idOrderDetail;
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "idOrderDetail=" + idOrderDetail + ", idOrder=" + idOrder + ", idProduct=" + idProduct + ", amount=" + amount + ", price=" + price + '}';
    }
    
    
    
    
}
