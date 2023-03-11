/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class NhaCungCap {
    private int ncc_maso ;
    private String ncc_ten ;
    private String ncc_diachi;
    private String ncc_sdt ;
    private String ncc_email ;
    private String ncc_masothue ;

    public NhaCungCap() {
    }

    public NhaCungCap(int ncc_maso, String ncc_ten, String ncc_diachi, String ncc_sdt, String ncc_email, String ncc_masothue) {
        this.ncc_maso = ncc_maso;
        this.ncc_ten = ncc_ten;
        this.ncc_diachi = ncc_diachi;
        this.ncc_sdt = ncc_sdt;
        this.ncc_email = ncc_email;
        this.ncc_masothue = ncc_masothue;
    }

    public int getNcc_maso() {
        return ncc_maso;
    }

    public void setNcc_maso(int ncc_maso) {
        this.ncc_maso = ncc_maso;
    }

    public String getNcc_ten() {
        return ncc_ten;
    }

    public void setNcc_ten(String ncc_ten) {
        this.ncc_ten = ncc_ten;
    }

    public String getNcc_diachi() {
        return ncc_diachi;
    }

    public void setNcc_diachi(String ncc_diachi) {
        this.ncc_diachi = ncc_diachi;
    }

    public String getNcc_sdt() {
        return ncc_sdt;
    }

    public void setNcc_sdt(String ncc_sdt) {
        this.ncc_sdt = ncc_sdt;
    }

    public String getNcc_email() {
        return ncc_email;
    }

    public void setNcc_email(String ncc_email) {
        this.ncc_email = ncc_email;
    }

    public String getNcc_masothue() {
        return ncc_masothue;
    }

    public void setNcc_masothue(String ncc_masothue) {
        this.ncc_masothue = ncc_masothue;
    }

    @Override
    public String toString() {
        return "NhaCungCap{" + "ncc_maso=" + ncc_maso + ", ncc_ten=" + ncc_ten + ", ncc_diachi=" + ncc_diachi + ", ncc_sdt=" + ncc_sdt + ", ncc_email=" + ncc_email + ", ncc_masothue=" + ncc_masothue + '}';
    }
    
}
