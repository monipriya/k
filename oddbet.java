import java.util.*;
import java.util.Scanner;
public class oddbetween {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	for(int i=n;i<=k;i++){
		if(i%2!=0 && i!=n){
			System.out.println(i);
		}
		
	}
}
}
