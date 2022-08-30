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
public class DonDatSach implements Serializable {

    private int idDon;
    private int idTaiKhoan;
    private String tenTK;
    private String email;
    private String SDT;
    private String diaChi;
    private int idSach;
    private String tenSach;
    private String tacGia;
    private int gia;
    private int phiShip;
    private Date ngayDat;
    private int tongTien;
    private String thanhToan;
    private String trangThai;

    public DonDatSach() {
    }

    public DonDatSach(int idDon, int idTaiKhoan, String tenTK, String email, String SDT, String diaChi, int idSach, String tenSach, String tacGia, int gia, int phiShip, Date ngayDat, int tongTien, String thanhToan, String trangThai) {
        this.idDon = idDon;
        this.idTaiKhoan = idTaiKhoan;
        this.tenTK = tenTK;
        this.email = email;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.phiShip = phiShip;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
        this.thanhToan = thanhToan;
        this.trangThai = trangThai;
    }

    public DonDatSach(DonDatSach d) {
        this.idDon = d.getIdDon();
        this.idTaiKhoan = d.getIdTaiKhoan();
        this.tenTK = d.getTenTK();
        this.email = d.getEmail();
        this.SDT = d.getSDT();
        this.diaChi = d.getDiaChi();
        this.idSach = d.getIdSach();
        this.tenSach = d.getTenSach();
        this.tacGia = d.getTacGia();
        this.gia = d.getGia();
        this.phiShip = d.getPhiShip();
        this.ngayDat = d.getNgayDat();
        this.tongTien = d.getTongTien();
        this.thanhToan = d.getThanhToan();
        this.trangThai = d.getTrangThai();
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdDon() {
        return idDon;
    }

    public void setIdDon(int idDon) {
        this.idDon = idDon;
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getPhiShip() {
        return phiShip;
    }

    public void setPhiShip(int phiShip) {
        this.phiShip = phiShip;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public int getTongTien() {
        return this.getGia() + this.getPhiShip();
    }

    public String getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(String thanhToan) {
        this.thanhToan = thanhToan;
    }

}
