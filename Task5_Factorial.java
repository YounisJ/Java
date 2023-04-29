import java.util.Scanner;

public class Task5_Factorial {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int num=input.nextInt();
        int fact=1;

        for (int i=num; i>=1; i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the given number is =" +fact);
    }
}
