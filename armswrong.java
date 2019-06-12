import java.util.Scanner;
public class armsbet {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i = n1;i<n2;i++){
		int r =0,p=i;
		int s = 0;
		while(p >0){
		r = p % 10;
		p = p / 10;
		s = s + (r * r * r);
		}
		if(s == i){
		System.out.println(i);
		}
		}

		}
		}
