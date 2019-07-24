import java.util.*;
public class Guviset8pow {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int count=0;
int odd=0;
int even=0;
int c1=0;
int arr[]=new int[a];
for(int i=0;i<a;i++){
	arr[i]=scan.nextInt();
}
for(int i=0;i<a;i++){
	if(arr[i]%2==0){
		odd=arr[i];
		count++;
	}
	else{
		even=arr[i];
		c1++;
	}
	}
	
if(c1==1){
	System.out.println(even);
}
else{
	System.out.println(odd);
}
}
}
