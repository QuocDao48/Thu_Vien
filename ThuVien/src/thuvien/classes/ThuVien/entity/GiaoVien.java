/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien.classes.ThuVien.entity;

/**
 *
 * @author QUOC DAO
 */
public class GiaoVien {
    public String MaGV;
    public String HoTenGV;
    public Boolean GioiTinh = true;
    public String MatKhau;

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getHoTenGV() {
        return HoTenGV;
    }

    public void setHoTenGV(String HoTenGV) {
        this.HoTenGV = HoTenGV;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.GioiTinh = gioiTinh;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    
}
