import java.util.Scanner;
import java.util.*;
public class primebet {
	
	   public static void main(String args[]){		
	      Scanner scanner = new Scanner(System.in);
	      int num =0;
	      String  primeNumbers = "";
	      int n = scanner.nextInt();
	      for (int i = 0; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
               if(i%num==0 )
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println(primeNumbers);
	   }
	}


