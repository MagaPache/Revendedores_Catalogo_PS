/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AgenteOficial;
import Modelo.Condicion;
import Modelo.Premio;
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
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_price ?, ?, ?, ?");
        stmt.setInt(1, p.getIdCondition());
        stmt.setString(2, p.getPriceName());
        stmt.setInt(3, p.getIdOfficialAgent());
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
    

}
