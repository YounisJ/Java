public class Task4_EvenSum
{
    public static void main(String[] args) {

        int count=0;
        int sum=0;

        for (int i=1; i<=20; i++)
        {
            if (i%2==0)
            {
                count++;
                sum=sum+i;
            }
        }
        System.out.println("Sum of the even from 2 to 20 = "+sum);
        System.out.println("total even numbers = "+count);

    }
}
