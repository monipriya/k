
import java.util.Arrays;
import java.util.Scanner;

public class beginerset7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int [] n=new int[10];
	for(int i=0;i<10;i++){
		n[i]=sc.nextInt();
	}
	Arrays.sort(n);
	System.out.println(n[0]);
    
}
}
