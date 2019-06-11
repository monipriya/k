import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int base=scan.nextInt();
		int exp=scan.nextInt();
		double result=Math.pow(base,exp);
	    System.out.println(result);
	}
}
