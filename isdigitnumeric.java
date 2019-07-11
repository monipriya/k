import java.util.Scanner;

public class isnumeric {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String d="";
	for(int i=0;i<s.length();i++){
		if(Character.isAlphabetic(s.charAt(i))){
			
			d+=s.charAt(i);
			
		}
		
	}
	if(d==""){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	
	
}
}
