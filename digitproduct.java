import java.util.Scanner;

public class product {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int r=0,sum=1;

	while(n>0){
		r=n%10;
		sum=sum*r;
		n=n/10;

	}
	System.out.println(sum);

}
}
