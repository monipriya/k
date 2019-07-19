import java.util.Scanner;

public class stringMul {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	int c=(int)Math.abs(Integer.parseInt(a)*Integer.parseInt(b));
//	int d=(int)Math.abs(c);
	String s=""+c;
	System.out.println(s);
}
}
