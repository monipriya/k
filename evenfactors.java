import java.util.ArrayList;
import java.util.Scanner;

public class guviplayerset4String {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Integer> li=new ArrayList<Integer>();
	String re="";
	String str="";
	for(int i=1;i<=n;i++){
		if(n%i==0 &&i%2==0){
			li.add(i);
		}
	}
	for(int i=0;i<li.size();i++){
		System.out.print(li.get(i)+" ");
	}
	//System.out.println(li.toString().replace("[", " ").replace("]"," ").replace(","," ").trim());
	
	}
}
