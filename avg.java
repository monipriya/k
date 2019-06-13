import java.util.Scanner;
public class avg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int res=0 ,count=0,p=0;
	int a[]=new int [n];
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		res=res+a[i];
	}
		//System.out.println(res);
		count=res/n;
		System.out.println(count);
 }
}
