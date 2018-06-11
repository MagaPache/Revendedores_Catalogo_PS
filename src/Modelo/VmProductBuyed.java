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
public class VmProductBuyed {
    
    private String productName;
    private int amountSold;
    private int idProductCategory;
    private String productCategory;
    private String orderDate;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public int getIdProductCategory() {
        return idProductCategory;
    }

    public void setIdProductCategory(int idProductCategory) {
        this.idProductCategory = idProductCategory;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public VmProductBuyed() {
    }

    public VmProductBuyed(String productName, int amountSold, int idProductCategory, String productCategory, String orderDate) {
        this.productName = productName;
        this.amountSold = amountSold;
        this.idProductCategory = idProductCategory;
        this.productCategory = productCategory;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "VmProductBuyed{" + "productName=" + productName + ", amountSold=" + amountSold + ", idProductCategory=" + idProductCategory + ", productCategory=" + productCategory + ", orderDate=" + orderDate + '}';
    }
    
    
    
}
