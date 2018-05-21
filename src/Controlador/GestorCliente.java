/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
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
        stmt.setDate(5, c.getBirthDate());
        stmt.executeUpdate();
        stmt.close();
        ad.cerrarConexion();
    }

    public void modifyClient(Cliente c) throws SQLException {
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("exec_sp_update_client ?, ?, ?, ?, ?, ?");//Where id = 
        stmt.setInt(1, c.getIdClient());
        stmt.setString(2, c.getClientName());
        stmt.setString(3, c.getAddress());
        stmt.setString(4, c.getTelephone());
        stmt.setString(5, c.getEmail());
        stmt.setDate(6, c.getBirthDate());
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
            c.setBirthDate(query.getDate("fechaNac"));
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
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getDate("fechaNac"));
            clients.add(c);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return clients;
    }

    public Cliente getClientByName(String nombre) throws SQLException {
        Cliente c = new Cliente();
        ad.abrirConexion();
        PreparedStatement stmt = ad.getConn().prepareStatement("EXEC sp_get_client_by_name ?");
        stmt.setString(1, nombre);
        ResultSet query = stmt.executeQuery();
        if (query.next()) {
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getDate("fechaNac"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return c;
    }

    public Cliente getClientByEmail(String email) throws SQLException {
        Cliente c = new Cliente();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("SELECT * FROM CLIENTES WHERE email LIKE '%" + email + "%'" );
        if (query.next()) {
            c.setClientName(query.getString("nombre"));
            c.setAddress(query.getString("direccion"));
            c.setTelephone(query.getString("telefono"));
            c.setEmail(query.getString("email"));
            c.setBirthDate(query.getDate("fechaNac"));
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return c;
    }

}
