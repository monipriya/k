import java.util.*;
public class guviplayerset6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	String str="";
	for(int i=0;i<n;i++){
		if((int)Math.pow(k, i)==n){
           str+=i;			
		}

	}
	if(str==""){
		System.out.println("no");
	}
	else{
		System.out.println("yes");
	}
}

}
