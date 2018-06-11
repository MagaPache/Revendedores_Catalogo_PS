/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AgenteOficial;
import Modelo.Condicion;
import Modelo.Premio;
import Modelo.VmPremio;
import Modelo.VmPremioCondicion;
import Modelo.VmProductBuyed;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorPremio {

    AccesoDatos ad = new AccesoDatos();

    public void addPrice(Premio p) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_price ?, ?, ?, ?, ?");
        stmt.setInt(1, p.getIdCondition());
        stmt.setString(2, p.getPriceName());
        stmt.setInt(3, p.getIdOfficialAgent());
        stmt.setString(4, p.getLimitDate());
        stmt.setString(5, p.getStartDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }   
    
    public void updatePrice(Premio p) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_update_price ?, ?, ?, ?");
        stmt.setInt(1, p.getIdPrice());
        stmt.setInt(2, p.getIdOfficialAgent());
        stmt.setInt(3, p.getIdCondition());
        stmt.setString(4, p.getLimitDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void deletePrice(int id) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec sp_delete_price ?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();       

    } 
    
    public Premio getPrice(int idPremio) throws SQLException{
        Premio p = new Premio();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_price ?");
        stmt.setInt(1, idPremio);       
        ResultSet query = stmt.executeQuery();
        if(query.next()){
            p.setIdPrice(query.getInt("idPremio"));
            p.setIdCondition(query.getInt("idCondicion"));
            p.setPriceName(query.getString("premio"));
            p.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            p.setLimitDate(query.getString("fechaLimite"));
            p.setStartDate(query.getString("fechaComienzo"));            
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return p;
    }
    
    public ArrayList<VmPremio> getPricePerOfficialAgent(int agente) throws SQLException {
        ArrayList<VmPremio> prices = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_search_price_by_agent ?");
        stmt.setInt(1, agente);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmPremio vp = new VmPremio();
            vp.setIdPrice(query.getInt("idPremio"));
            vp.setPriceName(query.getString("premio"));            
            prices.add(vp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return prices;
    }
    
    public ArrayList<VmPremioCondicion> getActivePrices(int agente) throws SQLException {
        ArrayList<VmPremioCondicion> prices = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_active_prices_per_agent ?");
        stmt.setInt(1, agente);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmPremioCondicion p = new VmPremioCondicion();
            p.setIdPrice(query.getInt("idPremio"));
            p.setIdCondition(query.getInt("idCondicion"));
            p.setPriceName(query.getString("premio"));
            p.setIdAgent(query.getInt("idAgenteOficial"));
            p.setLimitDate(query.getString("fechaLimite"));
            p.setStartDate(query.getString("fechaComienzo"));
            p.setIdProductCategory(query.getInt("idCategoriaProducto"));
            p.setProductCategory(query.getString("CategoriaProducto"));
            p.setAmount(query.getInt("cantidad"));
            prices.add(p);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return prices;
    }
    
    public ArrayList<VmProductBuyed> getProductsBuyedPerCategory(int agente, String categoria, String fechaCom, String fechaFin) throws SQLException {
        ArrayList<VmProductBuyed> products = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_products_buyed_per_category ?,?,?,?");        
        stmt.setInt(1, agente);
        stmt.setString(2, categoria);
        stmt.setString(3, fechaCom);
        stmt.setString(4, fechaFin);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmProductBuyed vpb = new VmProductBuyed();
            vpb.setProductName(query.getString("producto"));
            vpb.setAmountSold(query.getInt("Cantidad Vendida"));   
            vpb.setIdProductCategory(query.getInt("idCategoriaProducto"));
            vpb.setProductCategory(query.getString("categoriaProducto"));
            vpb.setOrderDate(query.getString("fechaPedido"));
            products.add(vpb);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return products;
    }
    

}
