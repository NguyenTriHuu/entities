/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class ThanhToan {
    private int tt_maso ;
    private String tt_loai ;

    public ThanhToan() {
    }

    public ThanhToan(int tt_maso, String tt_loai) {
        this.tt_maso = tt_maso;
        this.tt_loai = tt_loai;
    }

    public int getTt_maso() {
        return tt_maso;
    }

    public void setTt_maso(int tt_maso) {
        this.tt_maso = tt_maso;
    }

    public String getTt_loai() {
        return tt_loai;
    }

    public void setTt_loai(String tt_loai) {
        this.tt_loai = tt_loai;
    }

    @Override
    public String toString() {
        return "ThanhToan{" + "tt_maso=" + tt_maso + ", tt_loai=" + tt_loai + '}';
    }
    
}
