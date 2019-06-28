import java.util.Scanner;

public class product {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int p=s.nextInt();
int sp=0;
int a[]=new int[p];
for(int i=0;i<p;i++){
	a[i]=s.nextInt();
	sp=sp+a[i];
}
System.out.println(sp);

	}
}
