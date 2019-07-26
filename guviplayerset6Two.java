import java.util.*;
public class guviplayerset6Two {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
if(arr.length==n){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
}
}
