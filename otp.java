package monisha;
import java.util.*;
public class otp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		Long n=scan.nextLong();
		String m=scan.next();
		String h="";
		h=h+m.substring(0,2);
		String res=Long.toString(n);
		h=h+res.substring(0,1);
		String str=""+n;
		String p=str.substring(0,5);
		int sum1=0,r1=0,s1=0;
		for(int i=0;i<p.length();i++){
			//System.out.println(String.valueOf(p.charAt(i)));
			sum1=sum1+Integer.parseInt(String.valueOf(p.charAt(i)));
		}
		while(sum1>0){
			r1=sum1%10;
			s1=s1+r1;
			sum1=sum1/10;
			
		}
			h=h+s1;
			h=h+s.substring(0,1);
			String p1=str.substring(5,10);
			int sum2=0,r2=0,s2=0;
			for(int i=0;i<p1.length();i++){
				sum2=sum2+Integer.parseInt(String.valueOf(p1.charAt(i)));
			}
			while(sum2>0){
				r2=sum2%10;
				s2=s2+r2;
				sum2=sum2/10;
				}
			h=h+s2;
			char ch=s.charAt(s.length()-1);
			h=h+ch;
			h=h+str.charAt(str.length()-1);
			System.out.println(h);
			
	}

}
