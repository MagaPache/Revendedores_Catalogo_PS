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
public class VmPremioCondicion {
    
    private int idPrice;
    private int idCondition;
    private String priceName;
    private int idAgent;
    private String limitDate;
    private String startDate;
    private int idProductCategory;
    private String productCategory;
    private int amount;

    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    public int getIdCondition() {
        return idCondition;
    }

    public void setIdCondition(int idCondition) {
        this.idCondition = idCondition;
    }

    public String getPriceName() {
        return priceName;
    }

    public void setPriceName(String priceName) {
        this.priceName = priceName;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public String getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public VmPremioCondicion() {
    }

    public VmPremioCondicion(int idPrice, int idCondition, String priceName, int idAgent, String limitDate, String startDate, int idProductCategory, String productCategory, int amount) {
        this.idPrice = idPrice;
        this.idCondition = idCondition;
        this.priceName = priceName;
        this.idAgent = idAgent;
        this.limitDate = limitDate;
        this.startDate = startDate;
        this.idProductCategory = idProductCategory;
        this.productCategory = productCategory;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "VmPremioCondicion{" + "idPrice=" + idPrice + ", idCondition=" + idCondition + ", priceName=" + priceName + ", idAgent=" + idAgent + ", limitDate=" + limitDate + ", startDate=" + startDate + ", idProductCategory=" + idProductCategory + ", productCategory=" + productCategory + ", amount=" + amount + '}';
    }  
     
    
    
   
    
}
