/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class AccesoDatos {
    
    private Connection conn;
    
    public void abrirConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Revendedores_Catalogo";
        String user = "sa";
        String pass = "CuasiRecontrameh1582";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("La conexión está abierta");
        } catch (Exception e) {
            System.out.println("Error al abrir la conexión");
        }
    }
    
    public void cerrarConexion(){
        
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("La conexión está cerrada");
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    

    
}
