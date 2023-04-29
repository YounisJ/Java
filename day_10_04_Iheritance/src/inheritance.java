class Vehicle
{
    String make="Honda";
    String model="Civic";
    public void run()
    {
        System.out.println("Vehicle is running");
    }
}
class car extends Vehicle
{
    int num_doors=4;
    String make="Honda";
    String model="Civic Turbo";
    public void run()
    {
        System.out.println("Car is Running over the road ");
    }
    void show()
    {
        System.out.println(super.make);
        System.out.println(super.model);
        super.run();
        System.out.println();
        System.out.println(make);
        System.out.println(model);
        System.out.println("Doors ="+num_doors);
        run();

    }
}
public class inheritance {
    public static void main(String[] args)
    {
        car ca=new car();
        ca.show();
    }
}
