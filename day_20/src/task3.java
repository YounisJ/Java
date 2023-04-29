
public class task3
{
    String[] arr={"Muhammad Younis","Muhammad Mubeen","Kashif Ali"};

    int check_student(String St_name)
    {
        for (int i=0; i< arr.length; i++)
        {

            if (St_name.equalsIgnoreCase(arr[i]))
            {
                return 1;
            }
            else
            {
               continue;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {

        task3 obj=new task3();

        System.out.println(obj.check_student("Muhammad Mubeen"));

    }
}
