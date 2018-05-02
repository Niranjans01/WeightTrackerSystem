/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datetoday {
    public static final String DATE_FORMAT_NOW1 = "yyyy/MM/dd";
        public static final String DATE_FORMAT_NOW2 = "HH:mm:ss";


  public static String nowd() {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW1);
    return sdf.format(cal.getTime());

  }
  
  public static String nowt(){
      Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW2);
    return sdf.format(cal.getTime());
  }

  
}
