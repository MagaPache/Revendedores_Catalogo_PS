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
public class VmTopProductType {
    
    private int idProduct;
    private String productName;
    private int amountSold;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

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

    public VmTopProductType() {
    }

    public VmTopProductType(int idProduct, String productName, int amountSold) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.amountSold = amountSold;
    }

    @Override
    public String toString() {
        return "VmTopProductType{" + "idProduct=" + idProduct + ", productName=" + productName + ", amountSold=" + amountSold + '}';
    }
    
    
    
    
}
