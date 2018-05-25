/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cobro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorCobro {
    
    AccesoDatos ad = new AccesoDatos();
    
    public void addPayment(Cobro c) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec_sp_insert_payment ?, ?, ?"); //hacer sp
        stmt.setInt(1, c.getIdOrder());
        stmt.setFloat(2, c.getAmountCharged());
        stmt.setString(3, c.getPaymentDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();        
    }
    
    public void modifyPayment(Cobro c) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec_sp_update_payment ?, ?, ?, ?"); //where id = 
        stmt.setInt(1, c.getIdPayment());
        stmt.setInt(2, c.getIdOrder());
        stmt.setFloat(3, c.getAmountCharged());
        stmt.setString(4, c.getPaymentDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public void deletePayment(Cobro c) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec sp_delete_payment ?");
        stmt.setInt(1, c.getIdPayment());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public Cobro getCobro(int id) throws SQLException{
        Cobro c = new Cobro();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec sp_get_payment ?");
        stmt.setInt(1, id);
        ResultSet query = stmt.executeQuery();
        if(query.next()){
            c.setIdOrder(query.getInt("idPedido"));
            c.setAmountCharged(query.getFloat("montoCobrado"));
            c.setPaymentDate(query.getString("fechaPago"));            
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return c;
    }
    
    public ArrayList<Cobro> getAllPayments() throws SQLException{
        ArrayList<Cobro> payments = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("select * from COBROS");
        while(query.next()){
            Cobro c = new Cobro();
            c.setIdPayment(query.getInt("idCobro"));
            c.setIdOrder(query.getInt("idPedido"));
            c.setAmountCharged(query.getFloat("montoCobrado"));
            c.setPaymentDate(query.getString("fechaPago"));
            payments.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return payments;
    }
    
}
