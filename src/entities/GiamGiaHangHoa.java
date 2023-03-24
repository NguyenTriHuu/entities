/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class GiamGiaHangHoa extends GiamGia {

    private String hh_maso;

    public GiamGiaHangHoa(int maso, String ten, float giatri, String ngaybd, String ngaykt, String hh_maso) {
        super(maso, ten, giatri, ngaybd, ngaykt);
        this.hh_maso = hh_maso;
    }

    public String getHh_maso() {
        return hh_maso;
    }

    public void setHh_maso(String hh_maso) {
        this.hh_maso = hh_maso;
    }

}
