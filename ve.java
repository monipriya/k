import java.util.*;
import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
char s=sc.next().charAt(0);
if(s=='a'|| s=='e'|| s=='i' ||s=='o' ||s=='u'){
System.out.println("vowels");
}
else if(!(s=='a'|| s=='e'|| s=='i' ||s=='o' ||s=='u')){

System.out.println("consonent");
}
else{
System.out.println("invalid");
}
}
