import java.util.Scanner;

public class beginerset7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
int a=(n/10)*10;
int b=a+10;
//System.out.println(5 * ( n / 5 ));
System.out.println((n - a > b - n)? b : a);
}
}
