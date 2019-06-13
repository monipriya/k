import java.util.Scanner;

public class cnext {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int count=0;
	for(int i=0;i<n;i++){
		if((int)Math.pow(2, i)==n){
			count++;
			System.out.println("yes");
		}
		
	}
	if(count==0){
		System.out.println("no");
	}
}
}
