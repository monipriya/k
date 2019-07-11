import java.util.Scanner;

public class replace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s= sc.nextLine();
	String str=s.replaceAll("\\s+", " ");
	System.out.println(str);
}
}
