import java.util.Scanner;
public class j35 { 
 public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
System.out.println( "Input the number of sides for the polygon: ");
int n = Input.nextInt();
System.out.println( "Input the length of the side for the polygon: ");
double l = Input.nextDouble();
System.out.println("The area of the polygon is: " + polygonArea(n,l));
        }
public static double polygonArea(int n, double l) {
        return (n*(l*l))/(4*Math.tan(Math.PI/n));
        }
}
