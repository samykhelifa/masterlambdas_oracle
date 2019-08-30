import java.util.OptionalDouble;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.awt.Point;

public class Coll2streamsb {
 public static void  main(String[] args){
  
    List<Integer> intList = Arrays.asList(1, 2,7, 3, 4, 5);
    List<Point> pointList = new ArrayList<>(); 
    OptionalDouble maxDistance = intList.stream()
       .map(i -> new Point(i % 3, i / 1)) 
       .mapToDouble(p ->{ System.out.println(p +  " : " + p.distance(0,0));
                          return  p.distance(0, 0);})
       .max();
       System.out.println( "max distance   :  " + maxDistance.getAsDouble());
       
     

  }
}

