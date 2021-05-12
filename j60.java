import java.util.*;
 public class j60 {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
        String text = input.nextLine();
	String[] words = text.split("[ ]+");
	System.out.println("Penultimate word: "+words[words.length - 2]);
	 }
}
