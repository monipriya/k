import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<k;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
}

}
