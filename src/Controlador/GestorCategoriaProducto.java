/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CategoriaProducto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorCategoriaProducto {
    
    AccesoDatos ad = new AccesoDatos();
    
    public ArrayList<CategoriaProducto> getProductCategories() throws SQLException{
        ArrayList<CategoriaProducto> categories = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("select * from CATEGORIAS_PRODUCTOS");
        while(query.next()){
            CategoriaProducto cp = new CategoriaProducto();
            cp.setIdProductCategory(query.getInt("idCategoriaProducto"));
            cp.setPcName(query.getString("categoriaProducto"));
            categories.add(cp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return categories;
    }
    
    public ArrayList<CategoriaProducto> getProductCategoriesPerOfficialAgent(int idAgent) throws SQLException{
        ArrayList<CategoriaProducto> categories = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_prod_cat_per_official_agent ?");
        stmt.setInt(1, idAgent);
        ResultSet query = stmt.executeQuery();
        while(query.next()){
            CategoriaProducto cp = new CategoriaProducto();
            cp.setIdProductCategory(query.getInt("idCategoriaProducto"));
            cp.setPcName(query.getString("categoriaProducto"));
            categories.add(cp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return categories;
    }
    
}
