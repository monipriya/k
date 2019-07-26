import java.util.*;
public class set8Two {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String res="";
	String f="";
	char ch[]=str.toCharArray();
	
	for(int i=0;i<ch.length;i++){
		
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
			res+=ch[i];
		
		}
		
		}
	if(res.equals("")){
		System.out.println("no");
	}else{
		System.out.println("yes");
	}
		
	
	
}
}
