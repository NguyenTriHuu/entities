/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class ChiTietMaGiam implements Serializable {
    private int gghh_maso;
    private String hh_maso ;
    private String hh_date;

    public ChiTietMaGiam() {
    }

    public ChiTietMaGiam(int gghh_maso, String hh_maso, String hh_date) {
        this.gghh_maso = gghh_maso;
        this.hh_maso = hh_maso;
        this.hh_date = hh_date;
    }

    public int getGghh_maso() {
        return gghh_maso;
    }

    public void setGghh_maso(int gghh_maso) {
        this.gghh_maso = gghh_maso;
    }

    public String getHh_maso() {
        return hh_maso;
    }

    public void setHh_maso(String hh_maso) {
        this.hh_maso = hh_maso;
    }

    public String getHh_date() {
        return hh_date;
    }

    public void setHh_date(String hh_date) {
        this.hh_date = hh_date;
    }
    
    
}
