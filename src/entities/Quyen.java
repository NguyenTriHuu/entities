/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class Quyen {

    private int q_maso;
    private String q_ten;

    public Quyen(int q_maso, String q_ten) {
        this.q_maso = q_maso;
        this.q_ten = q_ten;
    }

    public int getQ_maso() {
        return q_maso;
    }

    public void setQ_maso(int q_maso) {
        this.q_maso = q_maso;
    }

    public String getQ_ten() {
        return q_ten;
    }

    public void setQ_ten(String q_ten) {
        this.q_ten = q_ten;
    }

}
