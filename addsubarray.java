import java.util.Scanner;

public class stringMul {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d1 = 0;
	int sum=1;
	int d[]=new int[n];
		for(int i=0;i<n;i++){
		d[i]=sc.nextInt();
		sum=sum*d[i];
		 d1=(int)Math.abs(sum);
	}
		System.out.println(d1);
		}
}
