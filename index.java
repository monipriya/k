import java.util.*;
import java.util.Scanner;
public class count {
	
	
	    public static void main(String[] args)
	    {
	        Scanner scan=new Scanner(System.in);
	        int count=0;
	        int n=scan.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	        	a[i]=scan.nextInt();
              if(a[i]==i){
            	  System.out.print(a[i]+" ");
            	  count=count+1;
            	  
              }
	        }
              if(count==0){
            	  System.out.println("-1");
                 }
	        
	        }
	       
	}

