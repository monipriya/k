import java.util.Arrays;
import java.util.Scanner;

public class alter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=n-1;i>=0;i--){
		if(i==0){
			System.out.print(a[i]);
			break;
		}
		System.out.print(a[i]+"->");
	}
}
}
