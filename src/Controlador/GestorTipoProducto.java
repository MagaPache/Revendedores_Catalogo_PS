/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.AccesoDatos;
import Modelo.TipoProducto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestorTipoProducto {
    
    AccesoDatos ad = new AccesoDatos();
    
    public ArrayList<TipoProducto> getProductTypes() throws SQLException{
        ArrayList<TipoProducto> types = new ArrayList<>();
        ad.abrirConexion();
        Statement stmt = ad.getConn().createStatement();
        ResultSet query = stmt.executeQuery("select * from TIPOS_PRODUCTOS"); //Arreglar en gestor producto que se cargue dependiendo del agente oficial que elija
        while(query.next()){
            TipoProducto tp = new TipoProducto();
            tp.setIdProductType(query.getInt("idTipoProducto"));
            tp.setPtName(query.getString("tipoProducto"));
            types.add(tp);
        }
        query.close();
        stmt.close();
        ad.cerrarConexion();
        return types;
    }
}
