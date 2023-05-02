package thuvien.classes.ThuVien.dao;

import thuvien.classes.ThuVien.entity.HocSinh;
import thuvien.classes.ThuVien.helper.XJdbc;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HocSinhDAO extends ThuVienDAO<HocSinh, String> {

    String INSERT_SQL = "INSERT INTO HocSinh(MaHS, HoTenHS, GioiTinh, Lop, NgaySinh, MatKhau) VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HocSinh SET HoTenHS =?, GioiTinh =?, Lop =?, NgaySinh =?, MatKhau =? WHERE MaHS =?";
    String SELECT_ALL_SQL = "SELECT * FROM HocSinh";
    String SELECT_ID_SQL = "SELECT * FROM HocSinh WHERE MaHS=?";

    @Override
    public void insert(HocSinh entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.MaHS, entity.HoTenHS, entity.GioiTinh, entity.Lop, entity.NgaySinh, entity.MatKhau);
        } catch (Exception ex) {
            Logger.getLogger(HocSinh.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(HocSinh entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.HoTenHS, entity.GioiTinh, entity.Lop, entity.NgaySinh, entity.MatKhau, entity.MaHS);
        } catch (Exception ex) {
            Logger.getLogger(HocSinh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
    }

    @Override
    public List<HocSinh> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocSinh selectById(String key) {
        List<HocSinh> list = this.selectBySql(SELECT_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HocSinh> selectBySql(String sql, Object... agrs) {
        List<HocSinh> list = new ArrayList<HocSinh>();
        try {
            ResultSet result = XJdbc.query(sql, agrs);
            while (result.next()) {
                HocSinh entity = new HocSinh();
                entity.setMaHS(result.getString("MaHS"));
                entity.setHoTenHS(result.getString("HoTenHS"));
                entity.setGioiTinh(result.getBoolean("GioiTinh"));
                entity.setLop(result.getString("Lop"));
                entity.setNgaySinh(result.getString("NgaySinh"));
                entity.setMatKhau(result.getString("MatKhau"));
                list.add(entity);
            }
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<HocSinh> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM HocSinh WHERE HoTenHS LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
