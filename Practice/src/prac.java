interface A
{
    interface B
    {
        void test();
    }
}
class C implements A.B
{
    public void test() {
        System.out.println("Hello world");
    }
}
public class prac
{
    public static void main(String[] args) {
        A.B obj=new C();
        C obj1=new C();

        obj.test();
        obj1.test();
    }
}
