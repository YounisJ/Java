
public class Main {

    int array[]={1,2,3,4,5};

    int sum(int arr[])
    {

        this.array=arr;
        int summ=0;
        for (int i=0; i< arr.length; i++)
        {
            summ=summ+arr[i];
        }

        return summ;
    }
    public static void main(String[] args) {

        Main obj=new Main();


        int [] b={1,2,3,4,5};

        obj.sum(b);
        System.out.println(obj.sum(b));

//        This Method Is Pass By Refference


    }
}