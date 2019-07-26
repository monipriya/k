import java.util.*;
public class guviplayerset8Four {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int n=sc.nextInt();
	if(n<str.length()){
	System.out.println(str.substring(n)+""+str.substring(0,n));
	}
	else{
		System.out.println(str);
	}
	}
}
