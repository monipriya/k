import java.util.Scanner;

public class exp {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	long n=s.nextLong(); 
    String s1=String.valueOf(n);
    int c=Integer.parseInt(s1.substring(0,1));
    char ch=s1.charAt(s1.length()-1);
    int b=Integer.parseInt(String.valueOf(ch));
    System.out.println(c+b);
		       		               }
}
