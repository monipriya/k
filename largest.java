import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt(); 
        int c=scan.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
    
}
