import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
			for(String w:s.split("\\s",0)){ 
		StringBuffer str= new StringBuffer(w);
		System.out.print(str.reverse()+" ");  
		}  
	}
}
