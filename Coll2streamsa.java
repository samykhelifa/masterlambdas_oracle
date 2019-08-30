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
      System.out.println( p + "  :  " + maxDistance);
         }
       System.out.println( "max distance   :  " + maxDistance);

  }
}
/*  OUTPUT
java.awt.Point[x=1,y=1]  :  1.4142135623730951
java.awt.Point[x=2,y=2]  :  2.8284271247461903
java.awt.Point[x=1,y=7]  :  7.0710678118654755
java.awt.Point[x=0,y=3]  :  7.0710678118654755
java.awt.Point[x=1,y=4]  :  7.0710678118654755
java.awt.Point[x=2,y=5]  :  7.0710678118654755
max distance   :  7.0710678118654755
*/

 
