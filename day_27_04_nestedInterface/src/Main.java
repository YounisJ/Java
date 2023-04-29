interface A {
    void Amethod();
    interface B{
        void Bmethod();
        interface C{
            interface D{
                void Dmethod();
            }
        }
    }
}

class C implements A.B.C.D,A,A.B
{
    public void Dmethod()
    {
        System.out.println("A's Method");
    }

    @Override
    public void Amethod() {
        System.out.println("D's Method");
    }
    public void Bmethod()
    {
        System.out.println("B's Method");
    }
}


public class Main
{
    public static void main(String[] args) {

        C obj=new C();

        obj.Amethod();
        obj.Bmethod();
        obj.Dmethod();

    }
}
