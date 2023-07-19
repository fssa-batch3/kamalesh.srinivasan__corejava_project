
package day07.solved;

import java.util.TreeSet;

public class TreeSetDemo {
 
    public static void main(String[] args) {
 
        // TreeSet sorts the collections
        TreeSet<String> cityNames = new TreeSet<>();
        cityNames.add("Delhi");
        cityNames.add("delhi");
        cityNames.add("Chennai");
        cityNames.add("Bangalore");
 
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }
         
         
    }
 
}