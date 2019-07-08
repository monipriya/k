
import java.util.Arrays;
import java.util.Scanner;
import java.util.*
;public class countwords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		switch(s){
		case "monday":
		       System.out.println("no");
		       break;
		case "tuesday":
			System.out.println("no");
			break;
		case "wednesday":
			System.out.println("no");
			break;
		case "thursday":
			System.out.println("no");
			break;
		case "friday":
			System.out.println("no");
			break;
		case "saturday":
			System.out.println("yes");
			break;
		case "sunday":
			System.out.println("yes");
			break;
		default:
			System.out.println("not matches");
			break;
		
		
		}
	}
}
