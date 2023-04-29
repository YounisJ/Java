abstract class bank
{
    abstract void getinterestrate();
}

class alied extends bank{
    void getinterestrate()
    {
        System.out.println("alied interest is = "+7+"%");
    }
}
class HBL extends bank{
    void getinterestrate()
    {
        System.out.println("HBL interest is = "+9+"%");
    }
}
public class class_task
{
    public static void main(String[] args) {
        alied alied_obj=new alied();
        HBL hbl_obj=new HBL();

        alied_obj.getinterestrate();
        hbl_obj.getinterestrate();

    }
}
