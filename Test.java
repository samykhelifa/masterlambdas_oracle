import java.util.ArrayList ;

public class Test extends ArrayList<String> {
    void print(){
       System.out.println(this.get(1));}
    public static void main(String[] args) {
        Test t = new Test();
         t.add("1");t.add("3");
       // System.out.println(t);
         t.print(); 
      }
}
