import java.util.*;
 public class j58 {
     public static void main(String[] args) {
Scanner Input = new Scanner(System.in);
System.out.print("Input a Sentence: ");
String line = Input.nextLine();
String upper_case_line = "";
  Scanner StringLine = new Scanner(line);
    while(StringLine.hasNext()) {
	String word = StringLine.next();
	upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
}
System.out.println(upper_case_line.trim());
    }
}
