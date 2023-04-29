interface Drawable
{
    void Draw();
}
class recanagle implements Drawable
{
    public void Draw()
    {
        System.out.println("Rectangle Drawn");
    }
}
class circle implements Drawable
{
    public void Draw()
    {
        System.out.println("Circle Drawn");
    }
}
public class Interfaces {
    public static void main(String[] args) {

        recanagle obj=new recanagle();
        circle obj1=new circle();

        obj.Draw();
        obj1.Draw();
    }
}
