/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class LoaiHoaDon {

    private int lhd_maso;
    private String lhd_ten;

    public LoaiHoaDon() {
    }

    public LoaiHoaDon(int lhd_maso, String lhd_ten) {
        this.lhd_maso = lhd_maso;
        this.lhd_ten = lhd_ten;
    }

    public int getLhd_maso() {
        return lhd_maso;
    }

    public void setLhd_maso(int lhd_maso) {
        this.lhd_maso = lhd_maso;
    }

    public String getLhd_ten() {
        return lhd_ten;
    }

    public void setLhd_ten(String lhd_ten) {
        this.lhd_ten = lhd_ten;
    }

    @Override
    public String toString() {
        return "LoaiHoaDon{" + "lhd_maso=" + lhd_maso + ", lhd_ten=" + lhd_ten + '}';
    }

}
