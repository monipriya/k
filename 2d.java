import java.util.Scanner;

public class matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			a[i][j]=sc.nextInt();
		}
	}
	int c1=0,c2=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(a[i][j]==0){
				c1=i;
				c2=j;
			}
		}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i==c1 ||j==c2){
				a[i][j]=0;
			}
		}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
