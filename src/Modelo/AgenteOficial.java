/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class AgenteOficial {
    
    private int idOfficialAgent;
    private String agentName;
    private String cuit;
    private String agentAddress;
    private String agentTelephone;
    private String webPage;

    public int getIdOfficialAgent() {
        return idOfficialAgent;
    }

    public void setIdOfficialAgent(int idOfficialAgent) {
        this.idOfficialAgent = idOfficialAgent;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
    }

    public String getAgentTelephone() {
        return agentTelephone;
    }

    public void setAgentTelephone(String agentTelephone) {
        this.agentTelephone = agentTelephone;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public AgenteOficial() {
    }

    public AgenteOficial(int idOfficialAgent, String agentName, String cuit, String agentAddress, String agentTelephone, String webPage) {
        this.idOfficialAgent = idOfficialAgent;
        this.agentName = agentName;
        this.cuit = cuit;
        this.agentAddress = agentAddress;
        this.agentTelephone = agentTelephone;
        this.webPage = webPage;
    }

    @Override
    public String toString() {
        return agentName;
    }
    
    
    
}
