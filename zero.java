import java.util.Scanner;

public class subset {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
//	int m=s.nextInt();
	int a[]=new int[n];
	//int arr[]=new int[m];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
	for (int j=i+1;j<n;j++){
		int r=a[i]+a[j];
		if(r==0){
			System.out.println(a[i]+" "+a[j]);
				}
	}
}
}
}
