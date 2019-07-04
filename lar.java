import java.util.Arrays;
import java.util.Scanner;

public class countwords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1[]=new int[10];
	for(int i=0;i<10;i++){
		n1[i]=sc.nextInt();
	}
	Arrays.sort(n1);
	System.out.println(n1[10-1]);
	
	
}
}
