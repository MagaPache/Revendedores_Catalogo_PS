/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class GestorPedido {
    
    AccesoDatos ad = new AccesoDatos();
    
    public void addOrder(Pedido p) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_order @pFecha = ?, @pCliente = ?, @pCampania = ?, @pObservac = ?");
        stmt.setString(1, p.getOrderDate());
        stmt.setInt(2, p.getIdClient());
        stmt.setInt(3, p.getIdCampaign());
        stmt.setString(4, p.getObservations());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public void modifyOrder(Pedido p) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_update_order ?, ?, ?, ?");
        stmt.setInt(1, p.getIdOrder());
        stmt.setInt(2, p.getIdClient());
        stmt.setInt(3, p.getIdCampaign());
        stmt.setString(4, p.getObservations());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public void deleteOrder(Pedido p) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_delete_order ?");
        stmt.setInt(1, p.getIdOrder());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public void closeOrder(Pedido p) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_close_order ?, ?, ?");
        stmt.setInt(1, p.getIdOrder());
        stmt.setBoolean(2, p.isDelivered());
        stmt.setString(3, p.getDeliveryDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    //Pedido completo con todos los campos
    public Pedido getOrder(int id) throws SQLException{
        Pedido p = new Pedido();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_one_order ?");
        stmt.setInt(1, id);
        ResultSet query = stmt.executeQuery();
        if(query.next()){
            p.setIdOrder(query.getInt("idPedido"));
            p.setOrderDate(query.getString("fechaPedido"));
            p.setIdClient(query.getInt("idCliente"));
            p.setDelivered(query.getBoolean("entregado"));
            p.setDeliveryDate(query.getString("fechaEntrega"));
            p.setPayed(query.getBoolean("estaPagado"));
            p.setIdCampaign(query.getInt("idCampania"));
            p.setObservations(query.getString("observaciones"));            
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return p;
    }
    
}
