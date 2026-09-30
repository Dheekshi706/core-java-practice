import java.util.*;
public class ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //char ch = sc.next().charAt(0);//
        int n = sc.nextInt();
        if (n >= 97 && n <= 122){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
}