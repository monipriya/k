import java.util.Scanner;

public class guviplayerset4String {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String str="";
	for(int i=0;i<s.length()-1;i+=3){
		str+=s.charAt(i);
	}
	System.out.println(str);
	}
}
