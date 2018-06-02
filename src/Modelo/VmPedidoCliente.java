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
public class VmPedidoCliente {
    
    private int idOrder;    
    private String clientName;
    private String orderDate;

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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    

    public VmPedidoCliente() {
    }

    public VmPedidoCliente(int idOrder, String clientName, String orderDate) {
        this.idOrder = idOrder;        
        this.clientName = clientName;
        this.orderDate = orderDate;
    }
    

    @Override
    public String toString() {
        return clientName;
    }
    
    
    
}
