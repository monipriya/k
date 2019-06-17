import java.util.Scanner;

public class decimaltobinary {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String str=String.valueOf(n);
	System.out.println(Integer.toHexString(Integer.parseInt(str,2)));
}
}
