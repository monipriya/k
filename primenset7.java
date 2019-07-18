import java.util.Scanner;

public class beginerset7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==0||n==1 || n==2 ){
		System.out.println("yes");
	}
	int count=0;
	for(int i=2;i<n;i++){
		if(i%n==0){
			count=count+1;;
		}
	}
	if(count==2){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
