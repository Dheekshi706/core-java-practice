import java.util.*;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int dig = a;
        int count=0;
        while (dig > 0)
        {
            dig = dig / 10;
            count++;
            
        }
        if (count==3 && a%10==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
