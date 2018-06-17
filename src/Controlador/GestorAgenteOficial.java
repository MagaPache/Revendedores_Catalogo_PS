/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AgenteOficial;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorAgenteOficial {
    
    AccesoDatos ad = new AccesoDatos();
    
    public ArrayList<AgenteOficial> getOfficialAgents() throws SQLException {
        ArrayList<AgenteOficial> agents = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT idAgenteOficial, nombreAgente FROM AGENTES_OFICIALES");
        while (query.next()) {
            AgenteOficial ag = new AgenteOficial();
            ag.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            ag.setAgentName(query.getString("nombreAgente"));
            agents.add(ag);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return agents;
    }
    
    public AgenteOficial getAgent (String nombre) throws SQLException{
        AgenteOficial ao = new AgenteOficial();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_agent_by_name ?");
        stmt.setString(1, nombre);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            ao.setIdOfficialAgent(query.getInt("idAgenteOficial"));
            ao.setAgentName(query.getString("nombreAgente"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return ao;
    }
    
}
