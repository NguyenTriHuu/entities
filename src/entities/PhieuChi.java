/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class PhieuChi {
    private int pc_maso ;
    private int ncc_maso ;
    private int nv_maso ;
    private String pc_ngaylap ;
    private String pc_tongtien ;

    public PhieuChi() {
    }

    public PhieuChi(int pc_maso, int ncc_maso, int nv_maso, String pc_ngaylap, String pc_tongtien) {
        this.pc_maso = pc_maso;
        this.ncc_maso = ncc_maso;
        this.nv_maso = nv_maso;
        this.pc_ngaylap = pc_ngaylap;
        this.pc_tongtien = pc_tongtien;
    }

    public int getPc_maso() {
        return pc_maso;
    }

    public void setPc_maso(int pc_maso) {
        this.pc_maso = pc_maso;
    }

    public int getNcc_maso() {
        return ncc_maso;
    }

    public void setNcc_maso(int ncc_maso) {
        this.ncc_maso = ncc_maso;
    }

    public int getNv_maso() {
        return nv_maso;
    }

    public void setNv_maso(int nv_maso) {
        this.nv_maso = nv_maso;
    }

    public String getPc_ngaylap() {
        return pc_ngaylap;
    }

    public void setPc_ngaylap(String pc_ngaylap) {
        this.pc_ngaylap = pc_ngaylap;
    }

    public String getPc_tongtien() {
        return pc_tongtien;
    }

    public void setPc_tongtien(String pc_tongtien) {
        this.pc_tongtien = pc_tongtien;
    }

    @Override
    public String toString() {
        return "PhieuChi{" + "pc_maso=" + pc_maso + ", ncc_maso=" + ncc_maso + ", nv_maso=" + nv_maso + ", pc_ngaylap=" + pc_ngaylap + ", pc_tongtien=" + pc_tongtien + '}';
    }

    
    
    
}
