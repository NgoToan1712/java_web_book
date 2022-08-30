/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class DanhGiaSP implements Serializable {

    private int id;
    private int idTaiKhoan;
    private int idSach;
    private String tenTaiKhoan;
    private Date ngayDG;
    private int danhGia;
    private String nhanXet;

    public DanhGiaSP() {
    }

    public DanhGiaSP(int id, int idTaiKhoan, int idSach, String tenTaiKhoan, Date ngayDG, int danhGia, String nhanXet) {
        this.id = id;
        this.idTaiKhoan = idTaiKhoan;
        this.idSach = idSach;
        this.tenTaiKhoan = tenTaiKhoan;
        this.ngayDG = ngayDG;
        this.danhGia = danhGia;
        this.nhanXet = nhanXet;
    }

    public DanhGiaSP(DanhGiaSP d) {
        this.id = d.getId();
        this.idTaiKhoan = d.getIdTaiKhoan();
        this.idSach = d.getIdSach();
        this.tenTaiKhoan = d.getTenTaiKhoan();
        this.ngayDG = d.getNgayDG();
        this.danhGia = d.getDanhGia();
        this.nhanXet = d.getNhanXet();
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public int getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(int danhGia) {
        this.danhGia = danhGia;
    }

    public Date getNgayDG() {
        return ngayDG;
    }

    public void setNgayDG(Date ngayDG) {
        this.ngayDG = ngayDG;
    }

}
