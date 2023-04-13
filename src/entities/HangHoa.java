/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import com.businessrefinery.barcode.Barcode;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class HangHoa implements Serializable {
    private String hh_maso;
    private int lhh_maso;
    private int th_maso ;
    private String hh_date;
    private String hh_tenhang ;
    private String hh_giaban ;
    private String hh_hinhanh ;
    private String hh_barcode;
    private float hh_trongluong;
    private int dvt_maso;

    public HangHoa() {
    }

    public HangHoa(String hh_maso, int lhh_maso, int th_maso, String hh_date, String hh_tenhang, String hh_giaban, String hh_hinhanh, String hh_barcode, float hh_trongluong, int dvt_maso) {
        this.hh_maso = hh_maso;
        this.lhh_maso = lhh_maso;
        this.th_maso = th_maso;
        this.hh_date = hh_date;
        this.hh_tenhang = hh_tenhang;
        this.hh_giaban = hh_giaban;
        this.hh_hinhanh = hh_hinhanh;
        this.hh_barcode = hh_barcode;
        this.hh_trongluong = hh_trongluong;
        this.dvt_maso = dvt_maso;
    }

    public String getHh_maso() {
        return hh_maso;
    }

    public void setHh_maso(String hh_maso) {
        this.hh_maso = hh_maso;
    }

    public int getLhh_maso() {
        return lhh_maso;
    }

    public void setLhh_maso(int lhh_maso) {
        this.lhh_maso = lhh_maso;
    }

    public int getTh_maso() {
        return th_maso;
    }

    public void setTh_maso(int th_maso) {
        this.th_maso = th_maso;
    }

    public String getHh_date() {
        return hh_date;
    }

    public void setHh_date(String hh_date) {
        this.hh_date = hh_date;
    }

    public String getHh_tenhang() {
        return hh_tenhang;
    }

    public void setHh_tenhang(String hh_tenhang) {
        this.hh_tenhang = hh_tenhang;
    }

    public String getHh_giaban() {
        return hh_giaban;
    }

    public void setHh_giaban(String hh_giaban) {
        this.hh_giaban = hh_giaban;
    }

    public String getHh_hinhanh() {
        return hh_hinhanh;
    }

    public void setHh_hinhanh(String hh_hinhanh) {
        this.hh_hinhanh = hh_hinhanh;
    }

    public String getHh_barcode() {
        return hh_barcode;
    }

    public void setHh_barcode(String hh_barcode) {
        this.hh_barcode = hh_barcode;
    }

    public float getHh_trongluong() {
        return hh_trongluong;
    }

    public void setHh_trongluong(float hh_trongluong) {
        this.hh_trongluong = hh_trongluong;
    }

    public int getDvt_maso() {
        return dvt_maso;
    }

    public void setDvt_maso(int dvt_maso) {
        this.dvt_maso = dvt_maso;
    }

   

    public void GenBarcode() throws Exception{
        Barcode barcode = new Barcode();
        barcode.setSymbology(Barcode.EAN13);
        barcode.setCode(hh_maso);
        barcode.drawImage2File("C:\\LearningCode\\Java\\Barcode\\java-ean13-"+hh_tenhang+".gif");
    }
}
