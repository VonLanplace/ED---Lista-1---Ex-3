package view;

import controller.Factorial;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Factorial fc = new Factorial();
        Scanner in = new Scanner(System.in);
        int input = 0;

        System.out.print("Insira um número: ");
        input = in.nextInt();
        in.close();

        System.out.print("O fatorial de ");
        System.out.print(input);
        System.out.print(" é ");
        System.out.print(fc.factorial(input));
        System.out.print("\n");
    }
}
