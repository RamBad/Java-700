import java.util.*;
import static java.lang.Math.*;
 public class j57 {
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int n = in.nextInt();
		System.out.println(result(n));
	 }
	public static int result(int -num) {
		int x = 0;
        for(int i=1; i<=(int)sqrt(num); i++) {
            if(num%i==0 && i*i!=num) {
                x+=2;
            } else if (i*i==num) {
                x++;
            }
        }
        return x;
	}
 }
