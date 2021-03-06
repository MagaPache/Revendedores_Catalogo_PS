/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.AccesoDatos;
import Modelo.TipoProducto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorTipoProducto {
    
    AccesoDatos ad = new AccesoDatos();
    
    public ArrayList<TipoProducto> getProductTypes() throws SQLException{
        ArrayList<TipoProducto> types = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("select * from TIPOS_PRODUCTOS");
        while(query.next()){
            TipoProducto tp = new TipoProducto();
            tp.setIdProductType(query.getInt("idTipoProducto"));
            tp.setPtName(query.getString("tipoProducto"));
            types.add(tp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return types;
    }
    
    public ArrayList<TipoProducto> getProductTypesPerOfficialAgent(int idAgent) throws SQLException{
        ArrayList<TipoProducto> types = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_product_type_per_official_agent ?");
        stmt.setInt(1, idAgent);
        ResultSet query = stmt.executeQuery();
        while(query.next()){
            TipoProducto tp = new TipoProducto();
            tp.setIdProductType(query.getInt("idTipoProducto"));
            tp.setPtName(query.getString("tipoProducto"));
            types.add(tp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return types;
    }
    
    public TipoProducto getProductType(String tipo) throws SQLException{
        TipoProducto tp = new TipoProducto();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_product_type_by_name ?");
        stmt.setString(1, tipo);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            tp.setIdProductType(query.getInt("idTipoProducto"));
            tp.setPtName(query.getString("tipoProducto"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return tp;
    }
}
