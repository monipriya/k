import java.util.Scanner;

public class product {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=((a*b)%c);
	System.out.println(d);
}
}
