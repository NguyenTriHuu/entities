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
public class TableViewAllDiscount extends ChiTietMaGiam implements Serializable{
    

    private String hh_ten;
    private String ngay_bd ;
    private String ngay_kt ;
    private String lhh_ten ;
    private int gghh_phantram ;
    
    
    public TableViewAllDiscount(){
        
    }

    public TableViewAllDiscount(String hh_ten, String ngay_bd, String ngay_kt, String lhh_ten, int gghh_phantram) {
        this.hh_ten = hh_ten;
        this.ngay_bd = ngay_bd;
        this.ngay_kt = ngay_kt;
        this.lhh_ten = lhh_ten;
        this.gghh_phantram = gghh_phantram;
    }

    public TableViewAllDiscount(String hh_ten, String ngay_bd, String ngay_kt, String lhh_ten, int gghh_phantram, int gghh_maso, String hh_maso, String hh_date) {
        super(gghh_maso, hh_maso, hh_date);
        this.hh_ten = hh_ten;
        this.ngay_bd = ngay_bd;
        this.ngay_kt = ngay_kt;
        this.lhh_ten = lhh_ten;
        this.gghh_phantram = gghh_phantram;
    }

    public String getHh_ten() {
        return hh_ten;
    }

    public void setHh_ten(String hh_ten) {
        this.hh_ten = hh_ten;
    }

    public String getNgay_bd() {
        return ngay_bd;
    }

    public void setNgay_bd(String ngay_bd) {
        this.ngay_bd = ngay_bd;
    }

    public String getNgay_kt() {
        return ngay_kt;
    }

    public void setNgay_kt(String ngay_kt) {
        this.ngay_kt = ngay_kt;
    }

    public String getLhh_ten() {
        return lhh_ten;
    }

    public void setLhh_ten(String lhh_ten) {
        this.lhh_ten = lhh_ten;
    }

    public int getGghh_phantram() {
        return gghh_phantram;
    }

    public void setGghh_phantram(int gghh_phantram) {
        this.gghh_phantram = gghh_phantram;
    }

    @Override
    public String toString() {
        return "TableViewAllDiscount{" + "hh_ten=" + hh_ten + ", ngay_bd=" + ngay_bd + ", ngay_kt=" + ngay_kt + ", lhh_ten=" + lhh_ten + ", gghh_phantram=" + gghh_phantram + '}';
    }

    
    


    
    
    
    
}
