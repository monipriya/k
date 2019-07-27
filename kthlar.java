package guviBeginner;
import java.util.*;
public class kthlar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
for(int i=arr.length-1;i>=0;i--){
	
		System.out.println(arr[k+1]);
		break;
	}
}
}
