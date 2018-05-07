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
    private Date startDate;
    private Date closeDate;
    private Date arrivalDate;
    private float availableCredit;
    private float totalCost; //Hace referencia al monto a abonar que llega en la factura por campaña al recibir la caja con los productos
    private int idOfficialAgent;

    public int getIdCampaign() {
        return idCampaign;
    }

    public void setIdCampaign(int idCampaign) {
        this.idCampaign = idCampaign;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
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

    public Campania() {
    }

    public Campania(int idCampaign, Date startDate, Date closeDate, Date arrivalDate, float availableCredit, float totalCost, int idOfficialAgent) {
        this.idCampaign = idCampaign;
        this.startDate = startDate;
        this.closeDate = closeDate;
        this.arrivalDate = arrivalDate;
        this.availableCredit = availableCredit;
        this.totalCost = totalCost;
        this.idOfficialAgent = idOfficialAgent;
    }

    @Override
    public String toString() {
        return "Campania{" + "idCampaign=" + idCampaign + ", startDate=" + startDate + ", closeDate=" + closeDate + ", arrivalDate=" + arrivalDate + ", availableCredit=" + availableCredit + ", totalCost=" + totalCost + ", idOfficialAgent=" + idOfficialAgent + '}';
    }
    
    
}
