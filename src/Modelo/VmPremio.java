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
public class VmPremio {
    
    private int idPrice;
    private String priceName;

    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    public String getPriceName() {
        return priceName;
    }

    public void setPriceName(String priceName) {
        this.priceName = priceName;
    }

    public VmPremio() {
    }

    public VmPremio(int idPrice, String priceName) {
        this.idPrice = idPrice;
        this.priceName = priceName;
    }

    @Override
    public String toString() {
        return priceName;
    }
    
    
    
}
