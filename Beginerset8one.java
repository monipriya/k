
import java.util.*;
public class set8one {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);
	String str=sb.reverse().toString();
	if(s.equals(str)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
