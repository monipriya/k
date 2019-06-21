import java.util.Arrays;
import java.util.Scanner;

public class smallestset2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=n*m;
		if(c%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}

}
