/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cobro;
import Modelo.VmCobro;
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
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_payment ?, ?, ?");
        stmt.setInt(1, c.getIdOrder());
        stmt.setFloat(2, c.getAmountCharged());
        stmt.setString(3, c.getPaymentDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();        
    }
    
    public void modifyPayment(Cobro c) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_update_payment ?, ?, ?, ?");
        stmt.setInt(1, c.getIdPayment());
        stmt.setInt(2, c.getIdOrder());
        stmt.setFloat(3, c.getAmountCharged());
        stmt.setString(4, c.getPaymentDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public void deletePayment(int idCobro) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_delete_payment ?");
        stmt.setInt(1, idCobro);
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
    
    public ArrayList<VmCobro> getAllPayments() throws SQLException{
        ArrayList<VmCobro> payments = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_all_payments");
        while(query.next()){
            VmCobro vc = new VmCobro();
            vc.setIdPayment(query.getInt("idCobro"));
            vc.setIdOrder(query.getInt("pedido"));
            vc.setClientName(query.getString("cliente"));
            vc.setAmount(query.getFloat("monto"));
            vc.setPaymentDate(query.getString("fecha"));
            vc.setCampaignName(query.getString("descripcion"));
            vc.setAgentName(query.getString("agente"));
            payments.add(vc);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return payments;
    }
    
    public ArrayList<VmCobro> getPaymentsByClient(String cliente) throws SQLException{
        ArrayList<VmCobro> payments = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_payment_by_client ?");
        stmt.setString(1, cliente);
        ResultSet query = stmt.executeQuery();
        while(query.next()){
            VmCobro vc = new VmCobro();
            vc.setIdPayment(query.getInt("cobro"));
            vc.setIdOrder(query.getInt("pedido"));
            vc.setClientName(query.getString("cliente"));
            vc.setAmount(query.getFloat("monto"));
            vc.setPaymentDate(query.getString("fecha"));
            vc.setCampaignName(query.getString("descripcion"));
            vc.setAgentName(query.getString("agente"));
            payments.add(vc);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return payments;
    }
    
    public float getProfitPerCampaign(int agente, int campania) throws SQLException{
        float profit = 0;
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_profit_per_campaign ?, ?");
        stmt.setInt(1, agente);
        stmt.setInt(2, campania);
        ResultSet query = stmt.executeQuery();
        if(query.next()){
            profit = query.getFloat("Total Cobrado");
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return profit;
    }
    
}
