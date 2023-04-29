import java.util.Random;
import java.util.Scanner;

public class task5
{
    public static void main(String[] args) {
        Random random=new Random();

        int num=0;

        num=random.nextInt(5)+1;

        System.out.println("You rolled a "+num);


    }
}
