import java.util.*;
 public class j54 {
 public static void main(String[] args)
{
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
	System.out.print("Input the second number: ");
	int b = in.nextInt();
	System.out.print("Input the third number : ");
        int c = in.nextInt();
        System.out.print("The result is: "+rightmost_digit(a, b, c));

	System.out.print("\n");
}
public static boolean rightmost_digit(int x, int y, int z)
      {
         return (x%10 ==y%10 ||x%10==z%10 || y%10==z%10);
}
}
