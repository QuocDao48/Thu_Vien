package thuvien.classes.ThuVien.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {

    static final SimpleDateFormat DATE_FORMATER =new SimpleDateFormat("dd-MM-yyyy");
    public static Date toDate(String date,String... pattern){
        try {
            if(pattern.length > 0){
            DATE_FORMATER.applyPattern(pattern[0]);
            }
            if (date == null) {
                return  XDate.now();               
            }
            return DATE_FORMATER.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String toString(Date date,String... pattern){
        if(pattern.length > 0){
        DATE_FORMATER.applyPattern(pattern[0]);
        }
          if (date == null) {
               date =  XDate.now();               
            }
        return DATE_FORMATER.format(date);
    }
    public static Date now(){
        return new Date();
    }
    public static Date addDays(Date date,long days){
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
      public static Date add(int days){
          Date now = XDate.now();
        now().setTime(now().getTime()+days*24*60*60*1000);
        return now();
    }
}
