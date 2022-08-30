/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class TheLoai implements Serializable {

    private int id;
    private String tenTheLoai;
    private int soLuong;

    public TheLoai() {
    }

    public TheLoai(int id, String tenTheLoai, int soLuong) {
        this.id = id;
        this.tenTheLoai = tenTheLoai;
        this.soLuong = soLuong;
    }

    public TheLoai(TheLoai t) {
        this.id = t.getId();
        this.tenTheLoai = t.getTenTheLoai();
        this.soLuong = t.getSoLuong();
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

}
