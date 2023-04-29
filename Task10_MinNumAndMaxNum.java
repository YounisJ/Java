import java.util.Scanner;

public class Task10_MinNumAndMaxNum {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first num");
        int num1=input.nextInt();
        System.out.println("Enter the second num");
        int num2= input.nextInt();

        switch (num1>num2?1:2)
        {
            case 1 :
                System.out.println(num1+" Is Greater Than "+num2);
                break;
            case 2 :
                System.out.println(num2+" Is Greater Than "+num1);
                break;
            default:
                System.out.println("Ghalat");


        }



    }

}
