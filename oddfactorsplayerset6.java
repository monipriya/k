import java.util.*;
public class oddfactorsplayerset6 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
	if(n%2==0){
		for(int i=1;i<n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
	}
	}
		else{
		for(int i=1;i<=n;i++){

	if(n%i==0){
		System.out.print(i+" ");
	}
		}
}
	
}
	}
