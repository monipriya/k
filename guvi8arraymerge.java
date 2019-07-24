import java.util.*;
public class guvi8arraymerge {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int arr[]=new int[a];
	int brr[]=new int[b];
	ArrayList<Integer> arr1=new ArrayList<Integer>();

	for(int i = 0;i<a;i++)
			{
		arr[i] = sc.nextInt();
		arr1.add(arr[i]);

	}
	
	for(int i = 0;i<b;i++)
	{
		brr[i] = sc.nextInt();
		arr1.add(brr[i]);
	}
	for(int h:arr1){
		System.out.print(h+" ");
	}
}
}
