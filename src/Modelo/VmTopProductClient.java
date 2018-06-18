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
public class VmTopProductClient {
    
    private int amountBuyed;
    private int idProduct;
    private String productName;

    public int getAmountBuyed() {
        return amountBuyed;
    }

    public void setAmountBuyed(int amountBuyed) {
        this.amountBuyed = amountBuyed;
    }

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

    public VmTopProductClient() {
    }

    public VmTopProductClient(int amountBuyed, int idProduct, String productName) {
        this.amountBuyed = amountBuyed;
        this.idProduct = idProduct;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "VmTopProductClient{" + "amountBuyed=" + amountBuyed + ", idProduct=" + idProduct + ", productName=" + productName + '}';
    }
    
    
}
