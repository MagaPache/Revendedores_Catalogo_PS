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
public class VmCondicion {
    
    private int idCondition;
    private String productCategoryName;
    private int amount;

    public int getIdCondition() {
        return idCondition;
    }

    public void setIdCondition(int idCondition) {
        this.idCondition = idCondition;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public VmCondicion() {
    }

    public VmCondicion(int idCondition, String productCategoryName, int amount) {
        this.idCondition = idCondition;
        this.productCategoryName = productCategoryName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "VmCondicion{" + "idCondition=" + idCondition + ", productCategoryName=" + productCategoryName + ", amount=" + amount + '}';
    }    
    
    
}
