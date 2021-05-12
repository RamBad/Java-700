import java.util.Scanner;

public class j6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("First number - x, second number - y\n" + "Input values for x:" );
    int x = in.nextInt();

    System.out.println("Input values for y: ");
    int y = in.nextInt();

    System.out.print("than:\n");

    System.out.println(x + " + " + y + " = " + (x + y));

    System.out.println(x + " - " + y + " = " + (x - y));

    System.out.println(x + " x " + y + " = " + (x * y));

    System.out.println(x + " / " + y + " = " + (x / y));

    System.out.println(x + " mod " + y + " = " + (x % y));
 }
}
