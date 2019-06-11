import java.util.*;
import java.util.Scanner;
public class prime {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int um=sc.nextInt();
	        boolean flag = false;
	        for(int i = 2; i <= um/2; ++i)
	        {
	            // condition for nonprime number
	            if(um % i==0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.println(um + " is a prime number.");
	        else
	            System.out.println(um+"is not a prime number.");
	    }
	}
