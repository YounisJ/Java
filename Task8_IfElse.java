import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Task8_IfElse {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the temperature :");
        double temp=input.nextInt();

        if (temp>=80)
        {
            System.out.println("You Should Swim According to this temperature");
        }
        else if (temp>=60 && temp<80)
        {
            System.out.println("You Should Play Tennis According to this temperature");
        }
        else if (temp>=40 && temp<60)
        {
            System.out.println("You Should Play Golf According to this temperature");
        }
        else if (temp<40)
        {
            System.out.println("You Should do Skiing According to this temperature");
        }
        else if(temp>95 ||temp<20 ){
            System.out.println("You Should Visit our shops !");

        }


    }
}
