/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Campania;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
    
    public Campania getCampaign(int agent, int id) throws SQLException{
        Campania c = new Campania();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_campaign ?, ?");
        stmt.setInt(1, agent);
        stmt.setInt(2, id);
        ResultSet query = stmt.executeQuery();
        if(query.next()){
            c.setIdCampaign(query.getInt("idCampania"));
            c.setStartDate(query.getString("fechaInicio"));
            c.setCloseDate(query.getString("fechaCierre"));
            c.setArrivalDate(query.getString("fechaArribo"));
            c.setAvailableCredit(query.getFloat("creditoDisponible"));
            c.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            c.setDescription(query.getString("descripcion"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return c;
    }
    
    public ArrayList<Campania> getCampaignPerOfficialAgent(int agent) throws SQLException{
        ArrayList<Campania> campaigns = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_campaigns_per_official_agent ?");
        stmt.setInt(1, agent);
        ResultSet query = stmt.executeQuery();
        while(query.next()){
            Campania c = new Campania();
            c.setIdCampaign(query.getInt("idCampania"));
            c.setStartDate(query.getString("fechaInicio"));
            c.setCloseDate(query.getString("fechaCierre"));
            c.setArrivalDate(query.getString("fechaArribo"));
            c.setAvailableCredit(query.getFloat("creditoDisponible"));
            c.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            c.setDescription(query.getString("descripcion"));
            campaigns.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return campaigns;
    }
    
    public ArrayList<Campania> getActiveCampaignsPerOfficialAgent(int agent) throws SQLException{
        ArrayList<Campania> campaigns = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_active_campaigns_per_official_agent ?");
        stmt.setInt(1, agent);
        ResultSet query = stmt.executeQuery();
        while(query.next()){
            Campania c = new Campania();
            c.setIdCampaign(query.getInt("idCampania"));
            c.setStartDate(query.getString("fechaInicio"));
            c.setCloseDate(query.getString("fechaCierre"));
            c.setArrivalDate(query.getString("fechaArribo"));
            c.setAvailableCredit(query.getFloat("creditoDisponible"));
            c.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            c.setDescription(query.getString("descripcion"));
            campaigns.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return campaigns;
    }
    
    public ArrayList<Campania> getCampaingSoonToClose() throws SQLException {
        ArrayList<Campania> campaigns = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();        
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_campaigns_soon_close");
        while(query.next()){
            Campania c = new Campania();
            c.setIdCampaign(query.getInt("idCampania"));
            c.setStartDate(query.getString("fechaInicio"));
            c.setCloseDate(query.getString("fechaCierre"));
            c.setArrivalDate(query.getString("fechaArribo"));
            c.setAvailableCredit(query.getFloat("creditoDisponible"));
            c.setTotalCost(query.getFloat("costoTotal"));
            c.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            c.setDescription(query.getString("descripcion"));
            campaigns.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return campaigns;
    }
    
    public ArrayList<Campania> getCampaingSoonArrival() throws SQLException {
        ArrayList<Campania> campaigns = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();        
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_campaigns_soon_arrival");
        while(query.next()){
            Campania c = new Campania();
            c.setIdCampaign(query.getInt("idCampania"));
            c.setStartDate(query.getString("fechaInicio"));
            c.setCloseDate(query.getString("fechaCierre"));
            c.setArrivalDate(query.getString("fechaArribo"));
            c.setAvailableCredit(query.getFloat("creditoDisponible"));
            c.setTotalCost(query.getFloat("costoTotal"));
            c.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            c.setDescription(query.getString("descripcion"));
            campaigns.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return campaigns;
    }
    
}
