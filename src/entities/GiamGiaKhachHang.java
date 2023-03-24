/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class GiamGiaKhachHang extends GiamGia {

    private int kh_maso;

    public GiamGiaKhachHang(int maso, String ten, float giatri, String ngaybd, String ngaykt, int kh_maso) {
        super(maso, ten, giatri, ngaybd, ngaykt);
        this.kh_maso = kh_maso;
    }

    public int getKh_maso() {
        return kh_maso;
    }

    public void setKh_maso(int kh_maso) {
        this.kh_maso = kh_maso;
    }

}
