import java.util.Scanner;
public class j39 {
public static void main(String[] args) {
int sum = 0;
int a, b, c;
	for(a=1; a<=4; a++){
	for(b=1; b<=4; b++){
	for(c=1; c<=4; c++){
		if(a != b && b != c && a != c){
		sum++;
		System.out.println(a + ""  + b + "" + c);
			} 
		}
	}
}
System.out.println("Sum number of the three-digit-number is " + sum);
	}
}
