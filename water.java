import java.util.*;
public class watermelon {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2!=0){
		System.out.println("no");
	}
	else if((n/2)%2==0){
			System.out.println(n/2+" "+n/2);
			System.out.println("yes");
	}
	else {
		System.out.println((n/2+1)+" "+(n/2-1));
	}
}
}
