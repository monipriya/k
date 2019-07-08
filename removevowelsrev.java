import java.util.*;
public class guviset2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String str=s.next();
	 
	String t="";
	String g="";
if(str.length()<=n){
	char []ch=str.toCharArray();

for(int i=0;i<ch.length;i++){
	if((ch[i]=='i' || ch[i]=='e'|| ch[i]=='a'|| ch[i]=='o'|| ch[i]=='u')){
		g+=ch[i];
	}
	else	{
		t+=ch[i];
	}
}

}
char [] ch=t.toCharArray();
for(int i=ch.length-1;i>=0;i--){
	System.out.print(ch[i]);
}

}
}
