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
public class Condicion {
    
    private int idCondition;
    private int idProductCategory;
    private int amount;

    public int getIdCondition() {
        return idCondition;
    }

    public void setIdCondition(int idCondition) {
        this.idCondition = idCondition;
    }

    public int getIdProductCategory() {
        return idProductCategory;
    }

    public void setIdProductCategory(int idProductCategory) {
        this.idProductCategory = idProductCategory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Condicion() {
    }

    public Condicion(int idCondition, int idProductCategory, int amount) {
        this.idCondition = idCondition;
        this.idProductCategory = idProductCategory;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Condicion{" + "idCondition=" + idCondition + ", idProductCategory=" + idProductCategory + ", amount=" + amount + '}';
    }
    
    
    
}
