import java.util.Arrays;
import java.util.Scanner;

public class subset {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
Arrays.sort(a);

	for(int i=0,j=n-1;i<=n/2;i++,j--){
		if(i==j){
			System.out.println(a[i]);}
		else{
			
		System.out.print(a[j]+" "+a[i]+" ");
	}}
}
   }

