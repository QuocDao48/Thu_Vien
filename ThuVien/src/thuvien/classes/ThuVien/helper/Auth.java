package thuvien.classes.ThuVien.helper;

import thuvien.classes.ThuVien.entity.GiaoVien;

public class Auth {
public static GiaoVien user =null;
    public static void clear(){
        Auth.user=null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return (Auth.isLogin() && (user.getMaGV().equals("GV001")));
    }
}
