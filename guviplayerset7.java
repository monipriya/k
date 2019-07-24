import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class guviplayerset7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int n2=sc.nextInt();
	ArrayList<Integer> res=new ArrayList<Integer>();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		if(arr[i]<n2){
		
	res.add(arr[i]);	
		}
   	}
	Collections.sort(res);
	for(int i=0;i<res.size();i++){
		System.out.print(res.get(i)+" ");
	}
	
}
}
