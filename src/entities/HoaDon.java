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
public class HoaDon implements Serializable {

    private static final long serialVersionUID = 1L;
    private int hd_maso;
    private int nv_maso;
    private int kh_maso;
    private int ltt_maso;
    private String hd_ghichu;
    private String hd_tongtien;
    private String hd_ngaylap;

    public HoaDon() {
    }

    public HoaDon(int hd_maso, int nv_maso, int kh_maso, int ltt_maso, String hd_ghichu, String hd_tongtien, String hd_ngaylap) {
        this.hd_maso = hd_maso;
        this.nv_maso = nv_maso;
        this.kh_maso = kh_maso;
        this.ltt_maso = ltt_maso;
        this.hd_ghichu = hd_ghichu;
        this.hd_tongtien = hd_tongtien;
        this.hd_ngaylap = hd_ngaylap;
    }

    public int getHd_maso() {
        return hd_maso;
    }

    public void setHd_maso(int hd_maso) {
        this.hd_maso = hd_maso;
    }

    public int getNv_maso() {
        return nv_maso;
    }

    public void setNv_maso(int nv_maso) {
        this.nv_maso = nv_maso;
    }

    public int getKh_maso() {
        return kh_maso;
    }

    public void setKh_maso(int kh_maso) {
        this.kh_maso = kh_maso;
    }

    public int getLtt_maso() {
        return ltt_maso;
    }

    public void setLtt_maso(int ltt_maso) {
        this.ltt_maso = ltt_maso;
    }

    public String getHd_ghichu() {
        return hd_ghichu;
    }

    public void setHd_ghichu(String hd_ghichu) {
        this.hd_ghichu = hd_ghichu;
    }

    public String getHd_tongtien() {
        return hd_tongtien;
    }

    public void setHd_tongtien(String hd_tongtien) {
        this.hd_tongtien = hd_tongtien;
    }

    public String getHd_ngaylap() {
        return hd_ngaylap;
    }

    public void setHd_ngaylap(String hd_ngaylap) {
        this.hd_ngaylap = hd_ngaylap;
    }

}
