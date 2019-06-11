import java.util.Scanner;
import java.util.*;
public class primebet {
	
	   public static void main(String args[]){		
	      Scanner scanner = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      String  primeNumbers = "";
	      //System.out.println("Enter the value of n:");
	      int k = scanner.nextInt();
	      int n = scanner.nextInt();
	     
	      scanner.close();
	      for (i = k; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0 && i!=k)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	   // System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	   }
	}


