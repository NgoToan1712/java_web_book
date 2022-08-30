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
public class TaiKhoan implements Serializable {

    private int id;
    private String email;
    private String matKhau;
    private String hoTen;
    private String gioiTinh;
    private String SDT;
    private String diaChi;
    private boolean isAdmin;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String email, String matKhau, String hoTen, String gioiTinh, String SDT, String diaChi, boolean isAdmin) {
        this.id = id;
        this.email = email;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.isAdmin = isAdmin;
    }

    public TaiKhoan(TaiKhoan t) {
        this.id = t.getId();
        this.email = t.getEmail();
        this.matKhau = t.getMatKhau();
        this.hoTen = t.getHoTen();
        this.gioiTinh = t.getGioiTinh();
        this.SDT = t.getSDT();
        this.diaChi = t.getDiaChi();
        this.isAdmin = t.isIsAdmin();
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
