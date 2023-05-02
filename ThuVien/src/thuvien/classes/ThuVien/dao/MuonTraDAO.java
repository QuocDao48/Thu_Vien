package thuvien.classes.ThuVien.dao;

import thuvien.classes.ThuVien.entity.MuonTra;
import thuvien.classes.ThuVien.helper.XJdbc;

import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MuonTraDAO extends ThuVienDAO<MuonTra, String> {

    String INSERT_SQL = "INSERT INTO MuonTra(MaMuon, MaHS, HoTenHS, Lop, TenSach, LoaiSach, TacGia, TGMuon, TGTra) VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE MuonTra SET MaHS=?, HoTenHS=?, Lop=?, TenSach=?, LoaiSach=?, TacGia=?, TGMuon=?, TGTra=? WHERE MaMuon=?";
    String DELETE_SQL = "DELETE FROM MuonTra WHERE MaMuon=?";
    String SELECT_ALL_SQL = "SELECT * FROM MuonTra";
    String SELECT_ID_SQL = "SELECT * FROM MuonTra WHERE MaMuon=?";

    @Override
    public void insert(MuonTra entity) {
        try {
            XJdbc.update(INSERT_SQL, entity.MaMuon, entity.MaHS, entity.HoTenHS, entity.Lop, entity.TenSach, entity.LoaiSach, 
                    entity.TacGia, entity.TGMuon, entity.TGTra);
        } catch (Exception ex) {
            Logger.getLogger(MuonTraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(MuonTra entity) {
        try {
            XJdbc.update(UPDATE_SQL, entity.MaHS, entity.HoTenHS, entity.Lop, entity.TenSach,
                    entity.LoaiSach, entity.TacGia, entity.TGMuon, entity.TGTra, entity.MaMuon);
        } catch (Exception ex) {
            Logger.getLogger(MuonTraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            XJdbc.update(DELETE_SQL, key);
        } catch (Exception ex) {
            Logger.getLogger(MuonTraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<MuonTra> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public MuonTra selectById(String key) {
        List<MuonTra> list = this.selectBySql(SELECT_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<MuonTra> selectBySql(String sql, Object... agrs) {
        List<MuonTra> list = new ArrayList<MuonTra>();
        try {
            ResultSet result = XJdbc.query(sql, agrs);
            while (result.next()) {
                MuonTra entity = new MuonTra();
                entity.setMaMuon(result.getString("MaMuon"));
                entity.setMaHS(result.getString("MaHS"));
                entity.setHoTenHS(result.getString("HoTenHS"));
                entity.setLop(result.getString("Lop"));
                entity.setTenSach(result.getString("TenSach"));
                entity.setLoaiSach(result.getString("LoaiSach"));
                entity.setTacGia(result.getString("TacGia"));
                entity.setTGMuon(result.getString("TGMuon"));
                entity.setTGTra(result.getString("TGTra"));
                list.add(entity);
            }
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<MuonTra> selectByKeyWord(String name) {
        String sql = "SELECT * FROM MuonTra WHERE HoTenHS LIKE ?";
        return this.selectBySql(sql, "%" + name + "%");
    }
}
