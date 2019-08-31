import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.awt.Point;

public class Coll2streamsa {
 public static void  main(String[] args){
  
    List<Integer> intList = Arrays.asList(1, 2,7, 3, 4, 5);
    List<Point> pointList = new ArrayList<>(); 
     for (Integer i : intList) {
           pointList.add(new Point(i % 3, i / 1)); } 
   double maxDistance = Double.MIN_VALUE; 
   for (Point p : pointList) {
       maxDistance = Math.max(p.distance(0, 0),  maxDistance); 
      System.out.println( p + "  :  " + p.distance(0,0));
         }
       System.out.println( "max distance   :  " + maxDistance);
       
    }
}

