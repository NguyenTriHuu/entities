/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public abstract class ThanhToan {

    private int maso;
    private int hd_maso;

    public ThanhToan(int maso, int hd_maso) {
        this.maso = maso;
        this.hd_maso = hd_maso;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public int getHd_maso() {
        return hd_maso;
    }

    public void setHd_maso(int hd_maso) {
        this.hd_maso = hd_maso;
    }

}
