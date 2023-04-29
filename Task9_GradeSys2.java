import java.util.Scanner;

public class Task9_GradeSys2
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of courses :");
        int course=input.nextInt();
        int ave=0,sum=0;
        int grades;

        System.out.println("Enetr the Marks of each course :");
        for (int i=1;i<=course; i++)
        {

            grades=input.nextInt();
            if (grades<0)
            {
                System.out.println("Invalid input....");
                break;
            }
            sum=sum+grades;
        }

        ave=sum/course;

        if (ave>=80 && ave<100 )
        {
            System.out.println("You Got A1 Grade");
        }

        else if (ave>=70 && ave<80 )
        {
            System.out.println("You Got A Grade");
        }

        else if (ave>=60 && ave<70 )
        {
            System.out.println("You Got B Grade");
        }

        else if (ave>=50 && ave<60 )
        {
            System.out.println("You Got C Grade");
        }

        else if (ave>=40 && ave<50 )
        {
            System.out.println("You Got D Grade");
        }
        else
        {
            System.out.println("FAIL.....");
        }

    }
}
