/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AgenteOficial;
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
