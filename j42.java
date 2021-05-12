import java.io.Console;
public class j42 {
  public static void main(String[] args) {
	Console cnsl;
	if ((cnsl = System.console()) != null) {
	char[] pwd = null;
	try {
	pwd = cnsl.readPassword("Input your password:");
	System.out.println("Your password was: " + new String(pwd));
} finally {
if (pwd != null) {
 java.util.Arrays.fill(pwd, ' ');
		}
      }
  } else {
	throw new RuntimeException("Can't get password...No console");
		}
	}
}
