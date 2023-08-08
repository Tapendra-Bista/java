
import java.util.Arrays;

public class Nonprimitive {
    public static void main(String[] args) {
        int x =30;
        int y =x;
    System.out.println("Initial value of x and y is " + x +" and " + y);
   
   y=90;// y changed
       System.out.println("After y changed, value of x and y is " + x +" and " + y);
// here change of value x doesnot effect y.
x = 100; // x changedclear
     System.out.println("After x changed, value of x and y is " + x +" and " + y);
 
 int[] array = {1,2,3,4,5};
 System.out.println(array);
  System.out.println(Arrays.toString(array));

    }
 

}
