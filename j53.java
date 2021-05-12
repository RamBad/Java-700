import java.util.*;
 public class j53 {
 public static void main(String[] args)
{
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
	System.out.print("Input the second number: ");
	int b = in.nextInt();
	System.out.print("Input the third number : ");
        int c = in.nextInt();
        System.out.print("The result is: "+xyz(a, b, c));

	System.out.print("\n");
}
public static boolean xyz(int x, int y, int z)
      {
         return x<y && y<z;
	   }
}
