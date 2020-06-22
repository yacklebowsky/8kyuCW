package illumf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Kata {
    public String nju(int n) {
        int number = 0;
        List<String> fruitsNames = new ArrayList<String>();
        fruitsNames.add(" ");
        fruitsNames.add("kiwi");
        while (true) {
            char[] charsy = (Integer.valueOf(n).toString().toCharArray());
            for (int i : charsy) {
                number = number + Character.getNumericValue(i);
                }if (!(fruitsNames.get(number).isEmpty()))
                    break;
        }return fruitsNames.get(number);
    }
    public int neww(int a,int b,int c){
        int []tabel={a+b+c,a+b*c,(a+b)*c,a*b+c, a*(b+c), a*b*c};
      int sum=0;
        for (int sumj:tabel) {
            if (sumj>sum)sum=sumj;
            }
        return sum;
        }
    public String dnaToRna(String dna) {
        return dna.replace("T","U");
    }
    int Side;
    public int getSide() {
        return Side;
    }
    public void setSide(int side) {
        Side = side;
    }
    public static boolean feast(String beast, String dish) {
        if( (beast.substring(0,1).equals(dish.substring(0,1)) && (beast.substring(beast.length()-1).equals(dish.substring(dish.length()-1)))))
            return true;
        else return false;
    }
    /*
     * Assume input will be only of Integer o String type
     */

    public int sum(List<Object> mixed) {
        mixed.add("2");
        mixed.add(4);
        Integer sum=0;
        for (Object o:mixed
             ) {
           sum+=Integer.parseInt(o.toString());
        }
        return sum;
    }


}