import java.util.Scanner;

public class isomorphic {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	//String str1=scan.nextLine();
	//int count=0;
    String re="";
    for(int i=0;i<str.length();i++){
        if(!re.contains(String.valueOf(str.charAt(i)))){
        	re+=str.charAt(i);
        }

    }
    System.out.println(re);
}
}
