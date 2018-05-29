/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Campania;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class GestorCampania {

    AccesoDatos ad = new AccesoDatos();

    public void addCampaign(Campania c) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_campaign @cFechaInicio = ?, @cFechaCierre = ?, @cFechaArribo = ?, @cCreditoDisponible = ?, @cIdAgente = ?, @cDescripcion = ?");
        stmt.setString(1, c.getStartDate());
        stmt.setString(2, c.getCloseDate());
        stmt.setString(3, c.getArrivalDate());
        stmt.setFloat(4, c.getAvailableCredit());
        stmt.setInt(5, c.getIdOfficialAgent());
        stmt.setString(6, c.getDescription());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
    
    public void addCampaigns(Campania c) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_campaign ?, ?, ?, ?, ?, ?, ?");
        stmt.setString(1, c.getStartDate());
        stmt.setString(2, c.getCloseDate());
        stmt.setString(3, c.getArrivalDate());
        stmt.setFloat(4, c.getAvailableCredit());
        stmt.setFloat(5, c.getTotalCost());
        stmt.setInt(6, c.getIdOfficialAgent());
        stmt.setString(7, c.getDescription());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void closeCampaign(Campania c) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_close_campaign ?, ?, ?");
        stmt.setInt(1, c.getIdOfficialAgent());
        stmt.setInt(2, c.getIdCampaign());
        stmt.setFloat(3, c.getTotalCost());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }
}
