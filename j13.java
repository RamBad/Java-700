	import java.util.Scanner;
public class j13 {
  public static void main(String[] args) {
  Scanner Input = new Scanner(System.in); 
  System.out.println("Input the width rectangle: ");
  float w = Input.nextInt();
  System.out.println("Input the heidth rectangle: ");
  float h = Input.nextInt(); 
float perimeter = 2*w*h;
float area = w*h;
System.out.println("Perimeter is = " + perimeter + ";");
System.out.println("Area is = " + area + ".");
    }
}
