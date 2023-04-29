public class Task7_Timer {
    public static void main(String[] args) {


        for (int i=1; i<=12;i++)
        {
            for (int j=0;j<=60; j++)
            {
                if (i<10)
                {
                    System.out.print("0"+i+":");
                    if (j<10)
                    {
                        System.out.println("0"+j);
                    }
                    else
                    {
                        System.out.println(j);
                    }

                }
                else
                {
                    System.out.print(i+":");
                    if (j<10)
                    {
                        System.out.println("0"+j);
                    }
                    else
                    {
                        System.out.println(j);
                    }
                }
            }




        }
    }
}
