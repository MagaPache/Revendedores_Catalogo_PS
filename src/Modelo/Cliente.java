/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private int idClient;
    private String clientName;
    private String address;
    private String telephone;
    private String email;
    private Date birthDate;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Cliente() {
    }

    public Cliente(int idClient, String clientName, String address, String telephone, String email, Date birthDate) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idClient=" + idClient + ", clientName=" + clientName + ", address=" + address + ", telephone=" + telephone + ", email=" + email + ", birthDate=" + birthDate + '}';
    }
    
    
}
