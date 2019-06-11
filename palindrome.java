import java.util.*;
import java.util.Scanner;
public class palin {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0,r;
	int temp=n;
	while(n>0){
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum){
		System.out.println("palindrome");
	}
	else{
		System.out.println("not palindrome");
	}
}

}
