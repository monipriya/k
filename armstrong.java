import java.util.Scanner;

public class armstrong {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int temp=n;
	int s=0;
	while(n>0){
		int a=n%10;
		n=n/10;
		s=s+(a*a*a);
				}
	if(temp==s){
		System.out.println("yes");
	}
	else{
	System.out.println("no");
}}
}
