import java.util.*;
public class Guviset8pow {
	public static void main(String[] args) {
		
	
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int count=0;
int arr[]=new int[a];
for(int i=0;i<a;i++){
	arr[i]=scan.nextInt();
}
for(int i=0;i<a;i++){
	for(int j=i+1;j<a;j++){
		if(arr[i]<arr[j]){
			count++;
		}
	}
}
System.out.println(count);
}
}
