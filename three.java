import java.util.*;
public class three {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=sc.nextInt();
	int s=sc.nextInt();
	for(int i=r;i<=s;i++){
		if(n==i){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
			break;
		}
	}
}
}
