import java.util.Scanner;

public class product {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
	if(a[i]==k){
System.out.println(k);
}
	
}
	}
}
