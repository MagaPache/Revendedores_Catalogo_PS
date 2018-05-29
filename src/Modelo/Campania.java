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
public class Campania {
    
    private int idCampaign;
    private String startDate;
    private String closeDate;
    private String arrivalDate;
    private float availableCredit;
    private float totalCost; //Hace referencia al monto a abonar que llega en la factura por campaña al recibir la caja con los productos
    private int idOfficialAgent;
    private String description;

    public int getIdCampaign() {
        return idCampaign;
    }

    public void setIdCampaign(int idCampaign) {
        this.idCampaign = idCampaign;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public float getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(float availableCredit) {
        this.availableCredit = availableCredit;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public int getIdOfficialAgent() {
        return idOfficialAgent;
    }

    public void setIdOfficialAgent(int idOfficialAgent) {
        this.idOfficialAgent = idOfficialAgent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public Campania() {
    }

    public Campania(int idCampaign, String startDate, String closeDate, String arrivalDate, float availableCredit, float totalCost, int idOfficialAgent, String description) {
        this.idCampaign = idCampaign;
        this.startDate = startDate;
        this.closeDate = closeDate;
        this.arrivalDate = arrivalDate;
        this.availableCredit = availableCredit;
        this.totalCost = totalCost;
        this.idOfficialAgent = idOfficialAgent;
        this.description = description;
    }    
    

    @Override
    public String toString() {
        return description;
    }
    
    
}
