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
public class VmMontoAdeudadoCampania {
    
    private int idClient;
    private String clientName;
    private float amountOwed;
    private float amountPayed;
    private float totalOwed;

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

    public float getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(float amountOwed) {
        this.amountOwed = amountOwed;
    }

    public float getAmountPayed() {
        return amountPayed;
    }

    public void setAmountPayed(float amountPayed) {
        this.amountPayed = amountPayed;
    }

    public float getTotalOwed() {
        return totalOwed;
    }

    public void setTotalOwed(float totalOwed) {
        this.totalOwed = totalOwed;
    }

    public VmMontoAdeudadoCampania() {
    }

    public VmMontoAdeudadoCampania(int idClient, String clientName, float amountOwed, float amountPayed, float totalOwed) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.amountOwed = amountOwed;
        this.amountPayed = amountPayed;
        this.totalOwed = totalOwed;
    }

    @Override
    public String toString() {
        return "VmMontoAdeudadoCampania{" + "idClient=" + idClient + ", clientName=" + clientName + ", amountOwed=" + amountOwed + ", amountPayed=" + amountPayed + ", totalOwed=" + totalOwed + '}';
    }
    
    
    
}
