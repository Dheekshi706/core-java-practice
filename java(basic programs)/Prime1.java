import java.util.*;
class Prime1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;int count=0;
while(i<=n){
	if(n%i==0)
	{
		count++;
	}
	i++;
}
if(count==2){
	System.out.println("prime");
}
else{
	System.out.println("not prime");
}
}
}