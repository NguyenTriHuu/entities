/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class ThuongHieu {
    private int th_maso ;
    private String th_ten ;

    public ThuongHieu() {
    }

    public ThuongHieu(int th_maso, String th_ten) {
        this.th_maso = th_maso;
        this.th_ten = th_ten;
    }

    public int getTh_maso() {
        return th_maso;
    }

    public void setTh_maso(int th_maso) {
        this.th_maso = th_maso;
    }

    public String getTh_ten() {
        return th_ten;
    }

    public void setTh_ten(String th_ten) {
        this.th_ten = th_ten;
    }

    @Override
    public String toString() {
        return "ThuongHieu{" + "th_maso=" + th_maso + ", th_ten=" + th_ten + '}';
    }
    
}
