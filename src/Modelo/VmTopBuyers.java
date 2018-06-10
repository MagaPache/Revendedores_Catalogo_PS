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
public class VmTopBuyers {
    
    private String year;
    private float totalBuyed;
    private String clientName;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getTotalBuyed() {
        return totalBuyed;
    }

    public void setTotalBuyed(float totalBuyed) {
        this.totalBuyed = totalBuyed;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public VmTopBuyers() {
    }

    public VmTopBuyers(String year, float totalBuyed, String clientName) {
        this.year = year;
        this.totalBuyed = totalBuyed;
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "VmTopBuyers{" + "year=" + year + ", totalBuyed=" + totalBuyed + ", clientName=" + clientName + '}';
    }

    
    
}
