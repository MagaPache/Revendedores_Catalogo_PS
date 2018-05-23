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
public class CategoriaProducto {
    
    private int idProductCategory;
    private String pcName;
    private int idAgenteOficial;

    public int getIdProductCategory() {
        return idProductCategory;
    }

    public void setIdProductCategory(int idProductCategory) {
        this.idProductCategory = idProductCategory;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public int getIdAgenteOficial() {
        return idAgenteOficial;
    }

    public void setIdAgenteOficial(int idAgenteOficial) {
        this.idAgenteOficial = idAgenteOficial;
    }    
    

    public CategoriaProducto() {
    }

    public CategoriaProducto(int idProductCategory, String pcName, int idAgenteOficial) {
        this.idProductCategory = idProductCategory;
        this.pcName = pcName;
        this.idAgenteOficial = idAgenteOficial;
    }

    @Override
    public String toString() {
        return pcName;
    }

    

  
    
    
    
}
