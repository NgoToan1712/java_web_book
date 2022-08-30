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
public class GioHang implements Serializable {

    private int idTaiKhoan;
    private int idSach;
    private String tenSach;
    private String tacGia;
    private String urlHinhAnhS;
    private int gia;

    public GioHang() {
    }

    public GioHang(int idTaiKhoan, int idSach, String tenSach, String tacGia, String urlHinhAnhS, int gia) {
        this.idTaiKhoan = idTaiKhoan;
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.urlHinhAnhS = urlHinhAnhS;
        this.gia = gia;
    }

    public GioHang(GioHang g) {
        this.idTaiKhoan = g.getIdTaiKhoan();
        this.idSach = g.getIdSach();
        this.tenSach = g.getTenSach();
        this.tacGia = g.getTacGia();
        this.urlHinhAnhS = g.getUrlHinhAnhS();
        this.gia = g.getGia();
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getUrlHinhAnhS() {
        return urlHinhAnhS;
    }

    public void setUrlHinhAnhS(String urlHinhAnhS) {
        this.urlHinhAnhS = urlHinhAnhS;
    }

}
