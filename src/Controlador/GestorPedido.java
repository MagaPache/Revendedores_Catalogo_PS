/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pedido;
import Modelo.VmPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorPedido {

    AccesoDatos ad = new AccesoDatos();

    public void addOrder(Pedido p) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_order @pFecha = ?, @pCliente = ?, @pCampania = ?");
        stmt.setString(1, p.getOrderDate());
        stmt.setInt(2, p.getIdClient());
        stmt.setInt(3, p.getIdCampaign());        
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void updateOrder(Pedido p) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_update_order ?, ?, ?");
        stmt.setInt(1, p.getIdOrder());
        stmt.setInt(2, p.getIdClient());
        stmt.setInt(3, p.getIdCampaign());        
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void deleteOrder(Pedido p) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_delete_order ?");
        stmt.setInt(1, p.getIdOrder());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void closeOrder(Pedido p) throws SQLException {
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
    public Pedido getOrder(int id) throws SQLException {
        Pedido p = new Pedido();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_one_order ?");
        stmt.setInt(1, id);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            p.setIdOrder(query.getInt("idPedido"));
            p.setOrderDate(query.getString("fechaPedido"));
            p.setIdClient(query.getInt("idCliente"));
            p.setDelivered(query.getBoolean("entregado"));
            p.setDeliveryDate(query.getString("fechaEntrega"));
            p.setPayed(query.getBoolean("estaPagado"));
            p.setIdCampaign(query.getInt("idCampania"));            
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return p;
    }

    //Obtener todos los pedidos con su detalle de pedido
    public ArrayList<VmPedido> getOrdersWithDetails() throws SQLException {
        ArrayList<VmPedido> orders = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_orders_with_details");
        while(query.next()){
            VmPedido vp = new VmPedido();
            vp.setIdOrder(query.getInt("pedido"));
            vp.setClientName(query.getString("nombre"));
            vp.setProductName(query.getString("producto"));
            vp.setAmount(query.getInt("cantidad"));
            vp.setPrice(query.getFloat("precio"));
            vp.setPage(query.getInt("pagina"));
            vp.setObservations(query.getString("observaciones"));
            orders.add(vp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return orders;
    }
    
//    public float getTotalAmount(){
//        
//    }

}
