import java.util.Scanner;

public class task2
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("type any String ");
        String st=input.nextLine();
        int count=0;


        for (int i=0; i<st.length(); i++)
        {

            if ('a'== st.charAt(i)||'A'== st.charAt(i))
            {
                count++;
            }
            else
            {
                continue;
            }

        }

        System.out.println("Number of 'A' in your String is "+count);
    }
}
