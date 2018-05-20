/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
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
        PreparedStatement stmt = ad.getConn().prepareStatement("exec_sp_insert_client ?, ?, ?, ?, ?");
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
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("select * from CLIENTES where idCliente = " + id); //HACER SP PARA CONSULTAR UN CLIENTE
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
        ResultSet query = stmt.executeQuery("select * from CLIENTES"); //HACER VIEW PARA CONSULTAR TODOS LOS CLIENTES
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
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("select * from CLIENTES where nombre like = " + nombre); //HACER SP para buscar cliente x nombre
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
        ResultSet query = stmt.executeQuery("select * from CLIENTES where email like = " + email); //HACER SP para buscar cliente x email
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
