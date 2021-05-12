import java.util.Scanner;
public class P1 { 
 public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
System.out.println( "Enter hour: ");
int h = Input.nextInt();
          
        System.out.println(daytime(h));    
        
    }
    static String daytime(int h){
         
        if (h > 24 || h < 0)
            return "Invalid data";
        else if(h > 21 || h < 6)
            return "Good night zzz";
        else if(h >= 15)
            return "Good evening ;Р";
        else if(h >= 11)
            return "Good after noon =)";
        else
            return "Good morning!";
    }
}
