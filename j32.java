import java.util.Scanner;
public class j32 {
  public static void main( String args[] )
    {
	Scanner input = new Scanner(System.in);
	int num1;
	int num2;

	System.out.print( "Enter first number: ");
	num1 = input.nextInt();
	System.out.print( "Enter second number: ");
	num2 = input.nextInt();
	
	if(num1<num2){
	System.out.println(num1 + " < " + num2 + "\n" + num1 + " <= " + num2 +"\n" + num1 + " != " + num2);

}
	else if(num1>num2){
	System.out.println(num1 + " > " + num2 + "\n" + num1 + " >= " + num2 +"\n" + num1 + " != " + num2);
}
        else{
        System.out.println(num1 + " = " + num2);
  }
 }
}
