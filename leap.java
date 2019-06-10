import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a%4==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
