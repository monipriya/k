import java.util.*;
public class isnumeric {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char c=s.charAt(0);
	if(Character.isDigit(c)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	
}
}
