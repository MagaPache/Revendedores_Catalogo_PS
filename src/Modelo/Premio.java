/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Premio {
    
    private int idPrice;
    private int idCondition;
    private String priceName;
    private int idOfficialAgent;
    private Date limitDate;

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

    public int getIdOfficialAgent() {
        return idOfficialAgent;
    }

    public void setIdOfficialAgent(int idOfficialAgent) {
        this.idOfficialAgent = idOfficialAgent;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public Premio() {
    }

    public Premio(int idPrice, int idCondition, String priceName, int idOfficialAgent, Date limitDate) {
        this.idPrice = idPrice;
        this.idCondition = idCondition;
        this.priceName = priceName;
        this.idOfficialAgent = idOfficialAgent;
        this.limitDate = limitDate;
    }

    @Override
    public String toString() {
        return "Premio{" + "idPrice=" + idPrice + ", idCondition=" + idCondition + ", priceName=" + priceName + ", idOfficialAgent=" + idOfficialAgent + ", limitDate=" + limitDate + '}';
    }
    
    
    
}
