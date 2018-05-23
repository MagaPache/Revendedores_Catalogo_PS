/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AgenteOficial;
import Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorProducto {

    AccesoDatos ad = new AccesoDatos();

    public void addProduct(Producto p) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_product ?, ?, ?, ?, ?, ?");
        stmt.setString(1, p.getProductName());
        stmt.setInt(2, p.getCode());
        stmt.setInt(3, p.getIdProductType());
        stmt.setInt(4, p.getIdProductCategory());
        stmt.setFloat(5, p.getUnitPrice());
        stmt.setInt(6, p.getIdOfficialAgent());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void modifyProduct(Producto p) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec_sp_update_product ?, ?, ?, ?, ?, ?, ?");//Where id = 
        stmt.setInt(1, p.getIdProduct());
        stmt.setString(2, p.getProductName());
        stmt.setInt(3, p.getCode());
        stmt.setInt(4, p.getIdProductType());
        stmt.setInt(5, p.getIdProductCategory());
        stmt.setFloat(6, p.getUnitPrice());
        stmt.setInt(7, p.getIdOfficialAgent());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }    

    public void deleteProduct(Producto P) throws SQLException {

        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC delete_Product ?");
        stmt.setInt(1, P.getIdProduct());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();

    }

    public Producto getProductByName(String nombre) throws SQLException {
        Producto p = new Producto();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec sp_search_product_by_name ?");
        stmt.setString(1, nombre);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            p.setProductName(query.getString("producto"));
            p.setCode(query.getInt("codigoProducto"));
            p.setIdProductType(query.getInt("idTipoProducto"));
            p.setIdProductCategory(query.getInt("idCategoriaProducto"));
            p.setUnitPrice(query.getFloat("precioUnitario"));
            p.setIdOfficialAgent(query.getInt("idAgenteOficial"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return p;
    }

    public ArrayList<Producto> getAllProducts() throws SQLException {
        ArrayList<Producto> products = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM PRODUCTOS ORDER BY idAgenteOficial");
        while (query.next()) {
            Producto p = new Producto();
            p.setIdProduct(query.getInt("idProducto"));
            p.setProductName(query.getString("producto"));
            p.setCode(query.getInt("codigoProducto"));
            p.setIdProductType(query.getInt("idTipoProducto"));
            p.setIdProductCategory(query.getInt("idCategoriaProducto"));
            p.setUnitPrice(query.getFloat("precioUnitario"));
            p.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            products.add(p);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return products;
    }

    public Producto getProduct(int id) throws SQLException {
        Producto p = new Producto();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec sp_search_one_product ?");
        stmt.setInt(1, id);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            p.setProductName(query.getString("producto"));
            p.setCode(query.getInt("codigoProducto"));
            p.setIdProductType(query.getInt("idTipoProducto"));
            p.setIdProductCategory(query.getInt("idCategoriaProducto"));
            p.setUnitPrice(query.getFloat("precioUnitario"));
            p.setIdOfficialAgent(query.getInt("idAgenteOficial"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return p;
    }
    
    public ArrayList<AgenteOficial> getOfficialAgents() throws SQLException{
        ArrayList<AgenteOficial> agents = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT idAgenteOficial, nombreAgente FROM AGENTES_OFICIALES");
        while(query.next()){
            AgenteOficial ag = new AgenteOficial();
            ag.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            ag.setAgentName(query.getString("nombreAgente"));
//            ag.setCuit("cuit");
//            ag.setAgentAddress("direccion");
//            ag.setAgentTelephone("telefono");
//            ag.setWebPage("direccionWeb");
            agents.add(ag);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return agents;
    }    
    

}
