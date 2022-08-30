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
public class Book implements Serializable {

    private int id;
    private String tenSach;
    private String NXB;
    private String tacGia;
    private String theLoai;
    private String urlHinhAnh;
    private int gia;
    private float danhGia;
    private String moTa;

    public Book() {
    }

    public Book(int id, String tenSach, String NXB, String tacGia, String theLoai, String urlHinhAnh, int gia, float danhGia, String moTa) {
        this.id = id;
        this.tenSach = tenSach;
        this.NXB = NXB;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.urlHinhAnh = urlHinhAnh;
        this.gia = gia;
        this.danhGia = danhGia;
        this.moTa = moTa;
    }

    public Book(Book b) {
        this.id = b.getId();
        this.tenSach = b.getTenSach();
        this.NXB = b.getNXB();
        this.tacGia = b.getTacGia();
        this.theLoai = b.getTheLoai();
        this.urlHinhAnh = b.getUrlHinhAnh();
        this.gia = b.getGia();
        this.danhGia = b.getDanhGia();
        this.moTa = b.getMoTa();
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getUrlHinhAnh() {
        return urlHinhAnh;
    }

    public void setUrlHinhAnh(String urlHinhAnh) {
        this.urlHinhAnh = urlHinhAnh;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public float getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(float danhGia) {
        this.danhGia = danhGia;
    }

}
