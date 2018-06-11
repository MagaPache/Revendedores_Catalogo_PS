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
    private String limitDate;
    private String startDate;

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
    

    public Premio() {
    }

    public Premio(int idPrice, int idCondition, String priceName, int idOfficialAgent, String limitDate, String startDate) {
        this.idPrice = idPrice;
        this.idCondition = idCondition;
        this.priceName = priceName;
        this.idOfficialAgent = idOfficialAgent;
        this.limitDate = limitDate;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Premio{" + "idPrice=" + idPrice + ", idCondition=" + idCondition + ", priceName=" + priceName + ", idOfficialAgent=" + idOfficialAgent + ", limitDate=" + limitDate + ", startDate=" + startDate + '}';
    }

    

    
    
    
}
