import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i=1;
        int sum=0;
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        while(i<=a){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
