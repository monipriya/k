import java.util.Scanner;

public class countwords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String [] words=s.split(" ");
		System.out.println(words.length);
	
}
}
