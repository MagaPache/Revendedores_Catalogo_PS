/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.VmTopBuyers;
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
public class GestorCliente {

    AccesoDatos ad = new AccesoDatos();

    public void addClient(Cliente c) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_insert_client ?, ?, ?, ?, ?");
        stmt.setString(1, c.getClientName());
        stmt.setString(2, c.getAddress());
        stmt.setString(3, c.getTelephone());
        stmt.setString(4, c.getEmail());
        stmt.setString(5, c.getBirthDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void modifyClient(Cliente c) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_update_client ?, ?, ?, ?, ?, ?");
        stmt.setInt(1, c.getIdClient());
        stmt.setString(2, c.getClientName());
        stmt.setString(3, c.getAddress());
        stmt.setString(4, c.getTelephone());
        stmt.setString(5, c.getEmail());
        stmt.setString(6, c.getBirthDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public Cliente getClient(int id) throws SQLException {
        Cliente c = new Cliente();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_client ?");
        stmt.setInt(1, id);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getString("fechaNac"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return c;
    }

    public ArrayList<Cliente> getAllClients() throws SQLException {
        ArrayList<Cliente> clients = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM vw_get_all_clients");
        while (query.next()) {
            Cliente c = new Cliente();
            c.setIdClient(query.getInt("idCliente"));
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getString("fechaNac"));
            clients.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return clients;
    }

    public Cliente getClienteByName(String nombre) throws SQLException {
        Cliente c = new Cliente();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_client_by_name ?");
        stmt.setString(1, nombre);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            //c.setIdClient(query.getInt("idCliente"));
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getString("fechaNac"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return c;
    }

    public ArrayList<Cliente> getClientByName(String nombre) throws SQLException {
        ArrayList<Cliente> clients = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_client_by_name ?");
        stmt.setString(1, nombre);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            Cliente c = new Cliente();
            c.setIdClient(query.getInt("idCliente"));
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getString("fechaNac"));
            clients.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return clients;
    }

    public ArrayList<Cliente> getClientByEmail(String email) throws SQLException {
        ArrayList<Cliente> clients = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_client_by_email ?");
        stmt.setString(1, email);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            Cliente c = new Cliente();
            c.setIdClient(query.getInt("idCliente"));
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getString("fechaNac"));
            clients.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return clients;
    }
    
    public ArrayList<VmTopBuyers> getTopBuyersPerYear(int agente) throws SQLException{
        ArrayList<VmTopBuyers> top = new ArrayList<>();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_top_buys_per_client_per_agent ?");
        stmt.setInt(1, agente);
        ResultSet query = stmt.executeQuery();
        while (query.next()) {
            VmTopBuyers vtb = new VmTopBuyers();
            vtb.setYear(query.getString("Anio"));
            vtb.setTotalBuyed(query.getFloat("Total Compras"));
            vtb.setClientName(query.getString("nombre"));
            top.add(vtb);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return top;
    }

}
