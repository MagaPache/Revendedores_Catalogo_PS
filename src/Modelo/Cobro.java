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
public class Cobro {
    
    private int idPayment;
    private int idOrder;
    private float amountCharged;
    private String paymentDate;

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

    public float getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(float amountCharged) {
        this.amountCharged = amountCharged;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Cobro() {
    }

    public Cobro(int idPayment, int idOrder, float amountCharged, String paymentDate) {
        this.idPayment = idPayment;
        this.idOrder = idOrder;
        this.amountCharged = amountCharged;
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Cobro{" + "idPayment=" + idPayment + ", idOrder=" + idOrder + ", amountCharged=" + amountCharged + ", paymentDate=" + paymentDate + '}';
    }
    
    
    
}
