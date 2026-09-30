import java.util.Scanner;
class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int sum = 0;
        for (int i = s; i <= e; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                i = i + 2;
            }

        }
        
        
    }
}