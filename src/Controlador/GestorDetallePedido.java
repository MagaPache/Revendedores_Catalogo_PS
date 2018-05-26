/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DetallePedido;
import Modelo.VmDetallePedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorDetallePedido {

    AccesoDatos ad = new AccesoDatos();

    public void addOrderDetail(DetallePedido dp) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_order_detail ?, ?, ?, ?, ?");
        stmt.setInt(1, dp.getIdOrder());
        stmt.setInt(2, dp.getIdProduct());
        stmt.setInt(3, dp.getAmount());
        stmt.setFloat(4, dp.getPrice());
        stmt.setInt(5, dp.getPage());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void modifyOrderDetail(DetallePedido dp) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_modify_order_detail ?, ?, ?, ?, ?, ?");
        stmt.setInt(1, dp.getIdOrderDetail());
        stmt.setInt(2, dp.getIdOrder());
        stmt.setInt(3, dp.getIdProduct());
        stmt.setInt(4, dp.getAmount());
        stmt.setFloat(5, dp.getPrice());
        stmt.setInt(6, dp.getPage());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void deleteOrderDetail(DetallePedido dp) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_delete_order_detail ?");
        stmt.setInt(1, dp.getIdOrderDetail());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public ArrayList<VmDetallePedido> getOrderDetail(int id) throws SQLException {
        ArrayList<VmDetallePedido> orderDetails = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_order_detail ?");
        stmt.setInt(1, id);
        ResultSet query = stmt.executeQuery();
        while(query.next()){
            VmDetallePedido vdp = new VmDetallePedido();
            vdp.setIdOrder(query.getInt("pedido"));
            vdp.setProductName(query.getString("producto"));
            vdp.setAmount(query.getInt("cantidad"));
            vdp.setPrice(query.getFloat("precio"));
            vdp.setPage(query.getInt("pagina"));
            orderDetails.add(vdp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return orderDetails;
    }

}
