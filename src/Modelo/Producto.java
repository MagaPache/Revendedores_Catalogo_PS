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
public class Producto {
    
    private int idProduct;
    private String productName;
    private int code;
    private int idProductType;
    private int idProductCategory;
    private float unitPrice;
    private int idOfficialAgent;

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getIdProductType() {
        return idProductType;
    }

    public void setIdProductType(int idProductType) {
        this.idProductType = idProductType;
    }

    public int getIdProductCategory() {
        return idProductCategory;
    }

    public void setIdProductCategory(int idProductCategory) {
        this.idProductCategory = idProductCategory;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getIdOfficialAgent() {
        return idOfficialAgent;
    }

    public void setIdOfficialAgent(int idOfficialAgent) {
        this.idOfficialAgent = idOfficialAgent;
    }

    public Producto() {
    }

    public Producto(int idProduct, String productName, int code, int idProductType, int idProductCategory, float unitPrice, int idOfficialAgent) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.code = code;
        this.idProductType = idProductType;
        this.idProductCategory = idProductCategory;
        this.unitPrice = unitPrice;
        this.idOfficialAgent = idOfficialAgent;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProduct=" + idProduct + ", productName=" + productName + ", code=" + code + ", idProductType=" + idProductType + ", idProductCategory=" + idProductCategory + ", unitPrice=" + unitPrice + ", idOfficialAgent=" + idOfficialAgent + '}';
    }
    
    
    
}
