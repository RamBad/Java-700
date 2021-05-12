import java.util.Scanner;
public class j34 { 
 public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
System.out.println( "Enter the length for the side of the hex: ");
double l = Input.nextDouble();
System.out.println("The area of the hex is: " + hexagonArea(l));
	}
public static double hexagonArea(double l) {
	return (6*(l*l))/(4*Math.tan(Math.PI/6));
	}
}
