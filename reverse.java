import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String S=scan.nextLine();
	StringBuffer b=new StringBuffer(S);
	System.out.println(b.reverse());
}
}
