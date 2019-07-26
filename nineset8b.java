import java.util.*;
public class nine {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String a=""+n;
	for(int i=0;i<a.length();i++){
		if((int)a.charAt(i)%2!=0){
			System.out.print(a.charAt(i)+" ");
		}
		
	}
}
}
