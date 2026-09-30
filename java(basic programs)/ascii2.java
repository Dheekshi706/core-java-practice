import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i = 1;
        
        while(i>0)
        {

            if (n2 % n1 == 0) {
                System.out.println(n2);
                break;
            }
            n2 = n2 * i;
            i++;
        }
       
    }
}

