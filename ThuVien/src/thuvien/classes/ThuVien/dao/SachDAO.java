/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien.classes.ThuVien.dao;

import thuvien.classes.ThuVien.entity.Sach;
import thuvien.classes.ThuVien.helper.XJdbc;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SachDAO extends ThuVienDAO<Sach, String> {

    String INSERT_SQL = "INSERT INTO Sach(MaSach, TenSach, LoaiSach, TacGia, SoLuong, TGNhap) VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE Sach SET TenSach=?, LoaiSach=?, TacGia=?, SoLuong=?, TGNhap=? WHERE MaSach=?";
    String DELETE_SQL = "DELETE FROM Sach WHERE MaSach=?";
    String SELECT_ALL_SQL = "SELECT * FROM Sach";
    String SELECT_ID_SQL = "SELECT * FROM Sach WHERE MaSach=?";

    @Override
    public void insert(Sach entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.MaSach, entity.TenSach, entity.LoaiSach, entity.TacGia, entity.SoLuong,
                    entity.TGNhap);
        } catch (Exception ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Sach entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.TenSach, entity.LoaiSach, entity.TacGia, entity.SoLuong,
                    entity.TGNhap, entity.MaSach);
        } catch (Exception ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            XJdbc.update(DELETE_SQL, key);
        } catch (Exception ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Sach> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Sach selectById(String key) {
        List<Sach> list = this.selectBySql(SELECT_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List selectBySql(String sql, Object... agrs) {
        List<Sach> list = new ArrayList<Sach>();
        try {
            ResultSet result = XJdbc.query(sql, agrs);
            while (result.next()) {
                Sach entity = new Sach();
                entity.setMaSach(result.getString("MaSach"));
                entity.setTenSach(result.getString("TenSach"));
                entity.setLoaiSach(result.getString("LoaiSach"));
                entity.setTacGia(result.getString("TacGia"));
                entity.setSoLuong(result.getString("SoLuong"));
                entity.setTGNhap(result.getString("TGNhap"));
                list.add(entity);
            }
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Sach> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM Sach WHERE TenSach LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
