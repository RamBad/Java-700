import java.util.Scanner;
public class j51 {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String string = in.nextLine();
		int result = Integer.parseInt(string);
        System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");
    }
}
