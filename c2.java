import java.util.Scanner;

public class defaultp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r,sum=0;
	while(n!=0){
		n/=10;
		sum=sum+1;
		
	}
	System.out.println(sum);
}
}
