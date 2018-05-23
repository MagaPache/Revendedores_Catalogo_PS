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
public class TipoProducto {
    
    private int idProductType;
    private String ptName;
    private int profitPercentage;
    private int idOfficialAgent;

    public int getIdProductType() {
        return idProductType;
    }

    public void setIdProductType(int idProductType) {
        this.idProductType = idProductType;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public int getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(int profitPercentage) {
        this.profitPercentage = profitPercentage;
    }

    public int getIdOfficialAgent() {
        return idOfficialAgent;
    }

    public void setIdOfficialAgent(int idOfficialAgent) {
        this.idOfficialAgent = idOfficialAgent;
    }

    public TipoProducto() {
    }

    public TipoProducto(int idProductType, String ptName, int profitPercentage, int idOfficialAgent) {
        this.idProductType = idProductType;
        this.ptName = ptName;
        this.profitPercentage = profitPercentage;
        this.idOfficialAgent = idOfficialAgent;
    }

    @Override
    public String toString() {
        return ptName;
    }
    
    
    
    
}
