import java.util.Scanner;

public class camelcase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	for(String words:s.split(" ")){
		System.out.print(words.substring(0,1).toUpperCase()+""+words.substring(1).toLowerCase()+" ");
	}
	}
}
