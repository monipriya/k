import java.util.Scanner;

public class fac {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
 int fac=1;
 for(int i=1;i<=n;i++){
	 fac=fac*i;
 }
 System.out.println(fac);
}
}
