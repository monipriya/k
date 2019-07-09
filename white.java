import java.util.Scanner;

public class guvi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 String str =sc.nextLine();  
            String noSpaceStr = str.replaceAll("\\s", ""); 
     System.out.println(noSpaceStr);  
     int n=noSpaceStr.length();
     System.out.println(n);
	}
}
