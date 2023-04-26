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
public class GiamGia implements Serializable{

    private int gghh_maso;
    private String gghh_ngaybd;
    private String gghh_ngaykt;
    private int gghh_phantram;

    public GiamGia() {
    }

    public GiamGia(int gghh_maso, String gghh_ngaybd, String gghh_ngaykt, int gghh_phantram) {
        this.gghh_maso = gghh_maso;
        this.gghh_ngaybd = gghh_ngaybd;
        this.gghh_ngaykt = gghh_ngaykt;
        this.gghh_phantram = gghh_phantram;
    }

    public int getGghh_maso() {
        return gghh_maso;
    }

    public void setGghh_maso(int gghh_maso) {
        this.gghh_maso = gghh_maso;
    }

    public String getGghh_ngaybd() {
        return gghh_ngaybd;
    }

    public void setGghh_ngaybd(String gghh_ngaybd) {
        this.gghh_ngaybd = gghh_ngaybd;
    }

    public String getGghh_ngaykt() {
        return gghh_ngaykt;
    }

    public void setGghh_ngaykt(String gghh_ngaykt) {
        this.gghh_ngaykt = gghh_ngaykt;
    }

    public int getGghh_phantram() {
        return gghh_phantram;
    }

    public void setGghh_phantram(int gghh_phantram) {
        this.gghh_phantram = gghh_phantram;
    }

}
