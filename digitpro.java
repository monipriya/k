import java.util.Arrays;
import java.util.Scanner;
import java.util.*
;public class count {
	public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int r,sum=0;
        while(n!=0){
        	r=n%10;
        	sum=sum+r*r;
        	n=n/10;
        
        }
        System.out.println(sum);
	}
}
