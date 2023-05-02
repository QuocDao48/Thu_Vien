/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien.classes.ThuVien.entity;

import java.util.Date;

/**
 *
 * @author QUOC DAO
 */
public class HocSinh {
    public String MaHS;
    public String HoTenHS;
    public Boolean GioiTinh = true;
    public String Lop;
//    public Date NgaySinh;
    public String NgaySinh;
    public String MatKhau;

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public String getHoTenHS() {
        return HoTenHS;
    }

    public void setHoTenHS(String HoTenHS) {
        this.HoTenHS = HoTenHS;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
//     public Date getNgaySinh() {
//        return NgaySinh;
//    }
//
//    public void setNgaySinh(Date NgaySinh) {
//        this.NgaySinh = NgaySinh;
//    }
    
    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

}