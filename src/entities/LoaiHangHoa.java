/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class LoaiHangHoa {

    private int lhh_maso;
    private String lhh_ten;

    public LoaiHangHoa() {
    }

    public LoaiHangHoa(int lhh_maso, String lhh_ten) {
        this.lhh_maso = lhh_maso;
        this.lhh_ten = lhh_ten;
    }

    public int getLhh_maso() {
        return lhh_maso;
    }

    public void setLhh_maso(int lhh_maso) {
        this.lhh_maso = lhh_maso;
    }

    public String getLhh_ten() {
        return lhh_ten;
    }

    public void setLhh_ten(String lhh_ten) {
        this.lhh_ten = lhh_ten;
    }

    @Override
    public String toString() {
        return "LoaiHangHoa{" + "lhh_maso=" + lhh_maso + ", lhh_ten=" + lhh_ten + '}';
    }

}
