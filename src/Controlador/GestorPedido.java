/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pedido;
import Modelo.VmPedidoDetalle;
import Modelo.VmPedidoCliente;
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
    public ArrayList<VmPedidoDetalle> getOrdersWithDetails(int idPedido) throws SQLException {
        ArrayList<VmPedidoDetalle> orders = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_orders_with_details ?");
        stmt.setInt(1, idPedido);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmPedidoDetalle vp = new VmPedidoDetalle();
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

    public ArrayList<VmPedidoCliente> getClientOrderByCampaign(int campania, int agent) throws SQLException {
        ArrayList<VmPedidoCliente> orders = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC get_client_order_by_campaign ?, ?");
        stmt.setInt(1, campania);
        stmt.setInt(2, agent);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmPedidoCliente vpc = new VmPedidoCliente();
            vpc.setIdOrder(query.getInt("idPedido"));
            vpc.setClientName(query.getString("nombre"));
            vpc.setOrderDate(query.getString("fechaPedido"));
            orders.add(vpc);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return orders;
    }

    public int getMaxCodigo() throws SQLException {
        ad.abrirConexion();
        int codigo = 0;
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_max_pedidos");
        if (query.next()) {
            codigo = query.getInt("ultimo");
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return codigo;
    }

    public int[] getClientLastOrder() throws SQLException {
        int ultimo = 0;
        int idCliente = 0;
        ad.abrirConexion();
        int[] resultados = new int[2];
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_client_last_order");
        if (query.next()) {
            ultimo = query.getInt("ultimo");
            idCliente = query.getInt(idCliente);
            resultados[0] = ultimo;
            resultados[1] = idCliente;
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return resultados;
    }

    public float getTotalAmount(int agente, int campania, int pedido) throws SQLException {
        float totalAmount = 0;
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_total_amount_per_client_order ?, ?, ?");
        stmt.setInt(1, agente);
        stmt.setInt(2, campania);
        stmt.setInt(3, pedido);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            totalAmount = query.getFloat("Monto Total");
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return totalAmount;
    }
    
    public void deliverOrder(Pedido p) throws SQLException{
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_deliver_order ?, ?");
        stmt.setInt(1, p.getIdOrder());
        stmt.setString(2, p.getDeliveryDate());        
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

//    public float getTotalAmount(){
//        
//    }
}
