import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class collesam {
	 public static void main(String []args){
	     Scanner sc=new Scanner(System.in);
	     int j=sc.nextInt();
	     int m=sc.nextInt();
	     ArrayList l=new ArrayList();
	     for(int i=0;i<j;i++)
	     {  int j1=sc.nextInt();
	         l.add(j1);
	     }
	     ArrayList l2=new ArrayList();

	     for(int i=0;i<m;i++)
	     {  int m1=sc.nextInt();
	         l2.add(m1);
	     }
	     int p,count=0;
l.retainAll(l2);
Iterator itr=l.iterator();  
while(itr.hasNext()){  
	itr.next();
	count++;
}
if(count>0){
		System.out.println("yes");
	}
	else{
System.out.println("no");
	}
	 }
}

