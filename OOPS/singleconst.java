import java.util.Scanner;

class A
{
    static Scanner sc = new Scanner(System.in);

    A()
    {
        System.out.print("D ");
    }

    A(int x)
    {
        System.out.print("I" + x + " ");
    }

    A(boolean b)
    {
        System.out.print("B" + b + " ");
    }

    A(char ch)
    {
        System.out.print("C" + ch + " ");
    }

    A(A obj)
    {
        System.out.print("O ");
    }

    public static void main(String[] args)
    {
	new A(new A(new A(new A(new A()).sc.nextInt()).sc.nextBoolean()).sc.next().charAt(0));
       
    }
}