import java.util.*;

public class rem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int res=a1%a2;
        if (a1 < a2) {
            System.out.println("-1");
        }
        else{
             System.out.println(res);
        }
    }
}
