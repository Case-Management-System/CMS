
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s177229
 */
public class test {
     public static void main(String[] args) {
    int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearCode = year%1000;
        System.out.println(""+year);

     }
}
