/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class NhanVien implements Serializable {

    private static final long serialVersionUID = 1L;
    private int nv_maso;
    private int q_maso;
    private String nv_hoten;
    private String nv_taikhoan;
    private String nv_matkhau;
    private String nv_sdt;
    private String nv_email;
    private String nv_diachi;
    private String nv_ngaysinh;

    public NhanVien() {

    }

    public NhanVien(int nv_maso, int q_maso, String nv_hoten, String nv_taikhoan, String nv_matkhau, String nv_sdt, String nv_email, String nv_diachi, String nv_ngaysinh) {
        this.nv_maso = nv_maso;
        this.q_maso = q_maso;
        this.nv_hoten = nv_hoten;
        this.nv_taikhoan = nv_taikhoan;
        this.nv_matkhau = nv_matkhau;
        this.nv_sdt = nv_sdt;
        this.nv_email = nv_email;
        this.nv_diachi = nv_diachi;
        this.nv_ngaysinh = nv_ngaysinh;
    }

    public int getNv_maso() {
        return nv_maso;
    }

    public void setNv_maso(int nv_maso) {
        this.nv_maso = nv_maso;
    }

    public int getQ_maso() {
        return q_maso;
    }

    public void setQ_maso(int q_maso) {
        this.q_maso = q_maso;
    }

    public String getNv_hoten() {
        return nv_hoten;
    }

    public void setNv_hoten(String nv_hoten) {
        this.nv_hoten = nv_hoten;
    }

    public String getNv_taikhoan() {
        return nv_taikhoan;
    }

    public void setNv_taikhoan(String nv_taikhoan) {
        this.nv_taikhoan = nv_taikhoan;
    }

    public String getNv_matkhau() {
        return nv_matkhau;
    }

    public void setNv_matkhau(String nv_matkhau) {
        this.nv_matkhau = nv_matkhau;
    }

    public String getNv_sdt() {
        return nv_sdt;
    }

    public void setNv_sdt(String nv_sdt) {
        this.nv_sdt = nv_sdt;
    }

    public String getNv_email() {
        return nv_email;
    }

    public void setNv_email(String nv_email) {
        this.nv_email = nv_email;
    }

    public String getNv_diachi() {
        return nv_diachi;
    }

    public void setNv_diachi(String nv_diachi) {
        this.nv_diachi = nv_diachi;
    }

    public String getNv_ngaysinh() {
        return nv_ngaysinh;
    }

    public void setNv_ngaysinh(String nv_ngaysinh) {
        this.nv_ngaysinh = nv_ngaysinh;
    }

}
