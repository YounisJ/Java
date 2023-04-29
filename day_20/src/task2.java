class Car
{
    private String model;
    private int year;
    private int price;


    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }



    int calculate_tax(int tax)
    {

        tax=(price/100)*2;
        return tax;
    }

    int calculate_tax(String name,int tax)
    {
        System.out.println(name);

        tax=(price/100)*3;
        return tax;
    }

    void start()
    {
        System.out.println("The Car Has Started");
    }

    void stop()
    {
        System.out.println("The Car Has Stopped");
    }

    class engine
    {
        int cc;
    }








}
public class task2
{
    public static void main(String[] args) {


        Car car_obj=new Car();
        Car.engine obj_engine=car_obj.new engine();


    }
}
