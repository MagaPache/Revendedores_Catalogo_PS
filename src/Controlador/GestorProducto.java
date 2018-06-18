/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AgenteOficial;
import Modelo.Producto;
import Modelo.VmProducto;
import Modelo.VmTopProductClient;
import Modelo.VmTopProductType;
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
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_update_products ?, ?, ?, ?, ?, ?, ?");
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

    public ArrayList<VmProducto> getProductByName(String nombre) throws SQLException {
        ArrayList<VmProducto> products = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        //stmt.setString(1, nombre);
        ResultSet query = stmt.executeQuery("SELECT p.idProducto id, producto producto, codigoProducto codigo, tp.tipoProducto tipo, cp.categoriaProducto categoria, precioUnitario precio, ao.nombreAgente agente FROM PRODUCTOS p join TIPOS_PRODUCTOS tp \n"
                + "ON p.idTipoProducto = tp.idTipoProducto JOIN CATEGORIAS_PRODUCTOS cp \n"
                + "ON p.idCategoriaProducto = cp.idCategoriaProducto JOIN AGENTES_OFICIALES ao \n"
                + "ON p.idAgenteOficial = ao.idAgenteOficial\n"
                + "WHERE producto LIKE '%" + nombre + "%'");
        while (query.next()) {
            VmProducto p  = new VmProducto();
            p.setIdProduct(query.getInt("id"));
            p.setProductName(query.getString("producto"));
            p.setProductCode(query.getInt("codigo"));
            p.setProductType(query.getString("tipo"));
            p.setProductCategory(query.getString("categoria"));
            p.setUnitPrice(query.getFloat("precio"));
            p.setAgentName(query.getString("agente"));
            products.add(p);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return products;
    }

    public ArrayList<VmProducto> getAllProducts() throws SQLException {
        ArrayList<VmProducto> products = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT p.idProducto id, producto producto, codigoProducto codigo, tp.tipoProducto tipo, cp.categoriaProducto categoria, precioUnitario precio, ao.nombreAgente agente FROM PRODUCTOS p join TIPOS_PRODUCTOS tp ON p.idTipoProducto = tp.idTipoProducto JOIN CATEGORIAS_PRODUCTOS cp ON p.idCategoriaProducto = cp.idCategoriaProducto JOIN AGENTES_OFICIALES ao ON p.idAgenteOficial = ao.idAgenteOficial ORDER BY 7");
        while (query.next()) {
            VmProducto p = new VmProducto();
            p.setIdProduct(query.getInt("id"));
            p.setProductName(query.getString("producto"));
            p.setProductCode(query.getInt("codigo"));
            p.setProductType(query.getString("tipo"));
            p.setProductCategory(query.getString("categoria"));
            p.setUnitPrice(query.getFloat("precio"));
            p.setAgentName(query.getString("agente"));
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
    
    public ArrayList<VmTopProductClient> getTop5ProductsPerClient(int cliente, int agente) throws SQLException {
        ArrayList<VmTopProductClient> products = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_top5_products_per_client ?, ?");
        stmt.setInt(1, cliente);
        stmt.setInt(2, agente);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmTopProductClient tp = new VmTopProductClient();
            tp.setIdProduct(query.getInt("idProducto"));
            tp.setProductName(query.getString("producto"));
            tp.setAmountBuyed(query.getInt("Cantidad Comprada"));            
            products.add(tp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return products;
    }
    
    public ArrayList<VmTopProductType> getTopProductsPerType(int agente, int tipo) throws SQLException {
        ArrayList<VmTopProductType> products = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_top_products_sold_per_type ?,?");
        stmt.setInt(1, agente);
        stmt.setInt(2, tipo);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmTopProductType tpt = new VmTopProductType();
            tpt.setIdProduct(query.getInt("idProducto"));
            tpt.setProductName(query.getString("producto"));
            tpt.setAmountSold(query.getInt("Cantidad Vendida"));            
            products.add(tpt);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return products;
    }

    

}
