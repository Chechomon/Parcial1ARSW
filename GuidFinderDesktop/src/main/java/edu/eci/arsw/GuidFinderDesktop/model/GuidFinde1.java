/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop.model;

/**
 *
 * @author 2110461
 */
public class GuidFinde1 {
    
    String fecha;
    String Guid;
    int Count;
    public GuidFinde1(String fecha, String Guid, int Count) {
        this.fecha=fecha;
        this.Guid=Guid;
        this.Count=Count;
    }

    public String getFecha() {
        return fecha;
    }

    public String getGuid() {
        return Guid;
    }

    public int getCount() {
        return Count;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    
    
}
