import java.util.Scanner;
 public class j49 {
     public static void main(String[] args){
Scanner Input = new Scanner(System.in);
System.out.println( "Input a number : ");
int n = Input.nextInt();
//System.out.println(n % 2 + ";"); if 0 for even number
if (n % 2 != 0) {
System.out.println(0);
}
else {
System.out.println(1);
}
}
}
