import java.util.*;
import java.util.Scanner;
public class count {
		    public static void main(String[] args){
	        Scanner scan=new Scanner(System.in);
	        int count=0;
	        int n=scan.nextInt();
	        //int a[]=new int[n];
	       // for(;n!=0;n/=10,count++){
	            while(n!=0){
	             	n=n/10;
	            	count=count+1; 	
	        }
	        System.out.println(count);
	}

	}

