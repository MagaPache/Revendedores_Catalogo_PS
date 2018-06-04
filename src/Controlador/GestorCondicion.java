/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Condicion;
import Modelo.VmCondicion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorCondicion {
    
    AccesoDatos ad = new AccesoDatos();
    
    public void addCondition(Condicion c) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_condition ?, ?");        
        stmt.setInt(1, c.getIdProductCategory());
        stmt.setInt(2, c.getAmount());        
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public ArrayList<VmCondicion> getConditions() throws SQLException {
        ArrayList<VmCondicion> conditions = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_conditions");
        while(query.next()){
            VmCondicion vc = new VmCondicion();
            vc.setIdCondition(query.getInt("idCondicion"));
            vc.setProductCategoryName(query.getString("categoriaProducto"));
            vc.setAmount(query.getInt("cantidad"));            
            conditions.add(vc);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return conditions;
    }
    
}
