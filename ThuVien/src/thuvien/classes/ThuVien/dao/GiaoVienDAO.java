package thuvien.classes.ThuVien.dao;

import thuvien.classes.ThuVien.entity.GiaoVien;
import thuvien.classes.ThuVien.helper.XJdbc;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GiaoVienDAO extends ThuVienDAO<GiaoVien, String> {

    String INSERT_SQL = "INSERT INTO GiaoVien(MaGV, HoTenGV, GioiTinh, MatKhau) VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE GiaoVien SET HoTenGV =?, GioiTinh =?, MatKhau =? WHERE MaGV =?";
    String SELECT_ALL_SQL = "SELECT * FROM GiaoVien";
    String SELECT_ID_SQL = "SELECT * FROM GiaoVien WHERE MaGV=?";

    @Override
    public void insert(GiaoVien entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.MaGV, entity.HoTenGV, entity.GioiTinh, entity.MatKhau);
        } catch (Exception ex) {
            Logger.getLogger(GiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(GiaoVien entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.HoTenGV, entity.GioiTinh, entity.MatKhau, entity.MaGV);
        } catch (Exception ex) {
            Logger.getLogger(GiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
    }

    @Override
    public List<GiaoVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public GiaoVien selectById(String key) {

        List<GiaoVien> list = this.selectBySql(SELECT_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<GiaoVien> selectBySql(String sql, Object... agrs) {
        List<GiaoVien> list = new ArrayList<GiaoVien>();
        try {
            ResultSet result = XJdbc.query(sql, agrs);
            while (result.next()) {
                GiaoVien entity = new GiaoVien();
                entity.setMaGV(result.getString("MaGV"));
                entity.setHoTenGV(result.getString("HoTenGV"));
                entity.setGioiTinh(result.getBoolean("GioiTinh"));
                entity.setMatKhau(result.getString("MatKhau"));
                list.add(entity);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public List<GiaoVien> selectByKeyWord(String name) {
        String sql = "SELECT * FROM MuonTra WHERE HoTenGV LIKE ?";
        return this.selectBySql(sql, "%" + name + "%");
    }

}
