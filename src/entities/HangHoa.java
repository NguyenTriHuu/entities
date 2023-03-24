/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public class HangHoa implements Serializable {
    private String hh_maso;
    private int lhh_maso;
    private int th_maso ;
    private Date hh_date;
    private String hh_tenhang ;
    private String hh_giaban ;
    private String hh_hinhanh ;

    public HangHoa() {
    }

    public HangHoa(String hh_maso, int lhh_maso, int th_maso, Date hh_date, String hh_tenhang, String hh_giaban, String hh_hinhanh) {
        this.hh_maso = hh_maso;
        this.lhh_maso = lhh_maso;
        this.th_maso = th_maso;
        this.hh_date = hh_date;
        this.hh_tenhang = hh_tenhang;
        this.hh_giaban = hh_giaban;
        this.hh_hinhanh = hh_hinhanh;
    }

    public String getHh_maso() {
        return hh_maso;
    }

    public void setHh_maso(String hh_maso) {
        this.hh_maso = hh_maso;
    }

    public int getLhh_maso() {
        return lhh_maso;
    }

    public void setLhh_maso(int lhh_maso) {
        this.lhh_maso = lhh_maso;
    }

    public int getTh_maso() {
        return th_maso;
    }

    public void setTh_maso(int th_maso) {
        this.th_maso = th_maso;
    }

    public Date getHh_date() {
        return hh_date;
    }

    public void setHh_date(Date hh_date) {
        this.hh_date = hh_date;
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

    public String getHh_hinhanh() {
        return hh_hinhanh;
    }

    public void setHh_hinhanh(String hh_hinhanh) {
        this.hh_hinhanh = hh_hinhanh;
    }

    
}
