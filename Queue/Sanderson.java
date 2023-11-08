import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Sanderson {
   public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
      Random rand = new Random();
      for (int i = 0; i<100; i++) {
    	  q.add(rand.nextInt(100));
      }
      
      System.out.println("The queue is: " + q);
      
   }
}