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
public class VmCobro {
    
    private int idPayment;
    private int idOrder;
    private String clientName;
    private float amount;
    private String paymentDate;
    private String campaignName;
    private String agentName;

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }   
    
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public VmCobro() {
    }

    public VmCobro(int idPayment, int idOrder, String clientName, float amount, String paymentDate, String campaignName, String agentName) {
        this.idPayment = idPayment;
        this.idOrder = idOrder;
        this.clientName = clientName;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.campaignName = campaignName;
        this.agentName = agentName;
    }   

    @Override
    public String toString() {
        return "VmCobro{" + "idPayment=" + idPayment + ", idOrder=" + idOrder + ", clientName=" + clientName + ", amount=" + amount + ", paymentDate=" + paymentDate + ", campaignName=" + campaignName + ", agentName=" + agentName + '}';
    }

    
    
    
}
