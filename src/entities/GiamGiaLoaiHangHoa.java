/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class GiamGiaLoaiHangHoa extends GiamGia {

    private int lhh_maso;

    public GiamGiaLoaiHangHoa(int maso, String ten, float giatri, String ngaybd, String ngaykt, int lhh_maso) {
        super(maso, ten, giatri, ngaybd, ngaykt);
        this.lhh_maso = lhh_maso;
    }

    public int getLhh_maso() {
        return lhh_maso;
    }

    public void setLhh_maso(int lhh_maso) {
        this.lhh_maso = lhh_maso;
    }

}
