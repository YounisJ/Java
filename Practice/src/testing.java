class hello
{

}

public class testing
{
    public static void main(String[] args) {


        hello obj1=new hello();
        hello obj2=new hello();
        hello obj3=new hello();
        hello obj4=new hello();
        hello obj5=new hello();


        hello[] arr={obj1,obj2,obj3,obj4,obj5};

        for (int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
