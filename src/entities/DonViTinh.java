/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class DonViTinh {
    private int dvt_maso;
    private String dvt_ten;

    public DonViTinh() {
    }

    public DonViTinh(int dvt_maso, String dvt_ten) {
        this.dvt_maso = dvt_maso;
        this.dvt_ten = dvt_ten;
    }

    public int getDvt_maso() {
        return dvt_maso;
    }

    public void setDvt_maso(int dvt_maso) {
        this.dvt_maso = dvt_maso;
    }

    public String getDvt_ten() {
        return dvt_ten;
    }

    public void setDvt_ten(String dvt_ten) {
        this.dvt_ten = dvt_ten;
    }
    
    
}
