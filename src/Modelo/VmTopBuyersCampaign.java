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
public class VmTopBuyersCampaign {
    
    private float maxAmountPurchased;
    private int idClient;
    private String clientName;
    private int unitsBuyed;

    public float getMaxAmountPurchased() {
        return maxAmountPurchased;
    }

    public void setMaxAmountPurchased(float maxAmountPurchased) {
        this.maxAmountPurchased = maxAmountPurchased;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getUnitsBuyed() {
        return unitsBuyed;
    }

    public void setUnitsBuyed(int unitsBuyed) {
        this.unitsBuyed = unitsBuyed;
    }

    public VmTopBuyersCampaign() {
    }

    public VmTopBuyersCampaign(float maxAmountPurchased, int idClient, String clientName, int unitsBuyed) {
        this.maxAmountPurchased = maxAmountPurchased;
        this.idClient = idClient;
        this.clientName = clientName;
        this.unitsBuyed = unitsBuyed;
    }

    @Override
    public String toString() {
        return "VmTopBuyersCampaign{" + "maxAmountPurchased=" + maxAmountPurchased + ", idClient=" + idClient + ", clientName=" + clientName + ", unitsBuyed=" + unitsBuyed + '}';
    }
    
    
    
    
    
}
