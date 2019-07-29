import java.util.*;
public class oddtoeventoodd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String res="";
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	if(arr[i]%2==0 && i%2!=0){
		System.out.print(arr[i]+" ");
	}
	else if(arr[i]%2!=0 && i%2==0){
		System.out.print(arr[i]+" ");
	}
	
	}
}
}
