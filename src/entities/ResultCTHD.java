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
public class ResultCTHD extends ChiTietHoaDon implements Serializable{
    private String hh_tenhang;
    private String hh_giaban ;

    public ResultCTHD(String hh_tenhang, String hh_giaban) {
        this.hh_tenhang = hh_tenhang;
        this.hh_giaban = hh_giaban;
    }

    public ResultCTHD(String hh_tenhang, String hh_giaban, int hd_maso, String hh_maso, String hh_date, int soluong) {
        super(hd_maso, hh_maso, hh_date, soluong);
        this.hh_tenhang = hh_tenhang;
        this.hh_giaban = hh_giaban;
    }

    public ResultCTHD() {
    }

    public String getHh_tenhang() {
        return hh_tenhang;
    }

    public void setHh_tenhang(String hh_tenhang) {
        this.hh_tenhang = hh_tenhang;
    }

    public String getHh_giaban() {
        return hh_giaban;
    }

    public void setHh_giaban(String hh_giaban) {
        this.hh_giaban = hh_giaban;
    }
    
    
    
}
