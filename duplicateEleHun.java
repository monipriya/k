import java.util.*;
public class duplicateEleHun {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String re="";
	for(int i=0;i<str.length();i++){
		if(!re.contains(String.valueOf(str.charAt(i)))){
			re+=str.charAt(i);
		}
	}
	System.out.println(re);
}
}
