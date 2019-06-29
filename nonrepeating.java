import java.util.Scanner;

public class repeat {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int count=0;
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
    
    for(int i = 0; i < a.length; i++) {  
    	count=0;
        for(int j = 0; j < a.length; j++) {  
            if(a[i] != a[j])  
            {
            	count++;
            }
                
                    }
        if(count==a.length-1){
            System.out.println(a[i]);  

        }
      
    }  

}
}
