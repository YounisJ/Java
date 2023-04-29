abstract class shape
{
    abstract void draw();
}
class circle extends shape{
    @Override
    void draw() {
        System.out.println("Circle drawn");

    }
}
class reactangle extends shape
{
    void draw() {
        System.out.println("reactangle drawn");
    }
}
public class Abstraction
{
    public static void main(String[] args)
    {
       circle circle_obj=new circle();
       reactangle reactangle_obj=new reactangle();

       circle_obj.draw();
       reactangle_obj.draw();

    }
}
