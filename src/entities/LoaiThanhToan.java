/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class LoaiThanhToan {

    private int ltt_maso;
    private String ltt_ten;

    public LoaiThanhToan(int ltt_maso, String ltt_ten) {
        this.ltt_maso = ltt_maso;
        this.ltt_ten = ltt_ten;
    }

    public int getLtt_maso() {
        return ltt_maso;
    }

    public void setLtt_maso(int ltt_maso) {
        this.ltt_maso = ltt_maso;
    }

    public String getLtt_ten() {
        return ltt_ten;
    }

    public void setLtt_ten(String ltt_ten) {
        this.ltt_ten = ltt_ten;
    }

}
