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
public class TacGia implements Serializable {

    private int id;
    private String tenTacGia;
    private String urlHinhAnhTG;
    private String tieuSu;

    public TacGia() {
    }

    public TacGia(int id, String tenTacGia, String urlHinhAnhTG, String tieuSu) {
        this.id = id;
        this.tenTacGia = tenTacGia;
        this.urlHinhAnhTG = urlHinhAnhTG;
        this.tieuSu = tieuSu;
    }

    public TacGia(TacGia t) {
        this.id = t.getId();
        this.tenTacGia = t.tenTacGia;
        this.urlHinhAnhTG = t.getUrlHinhAnhTG();
        this.tieuSu = t.getTieuSu();
    }

    public String getTieuSu() {
        return tieuSu;
    }

    public void setTieuSu(String tieuSu) {
        this.tieuSu = tieuSu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getUrlHinhAnhTG() {
        return urlHinhAnhTG;
    }

    public void setUrlHinhAnhTG(String urlHinhAnhTG) {
        this.urlHinhAnhTG = urlHinhAnhTG;
    }

}
