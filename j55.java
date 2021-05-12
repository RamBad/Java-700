import java.util.*;
    public class j55 {
	public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Input seconds: ");
      int seconds = in.nextInt();
        int n1 = seconds % 60;
        int n2 = seconds / 60;
        int n3 = n2 % 60;
        n2 = n2 / 60;
        System.out.print( n2 + ":" + n3 + ":" + n1);
System.out.print("\n");
    }
 }
