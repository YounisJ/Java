class Person
{
        private String name;

        Person(String name)
        {
            this.name=name;
        }

    public String getName() {
        return name;
    }

    class Adress
    {
        private  String street;
        private  String city;

        Adress (String street,String city)
        {
            this.street=street;
            this.city=city;
        }
        void getAdress()
        {
            System.out.println("Name   : "+name);
            System.out.println("Street : "+street);
            System.out.println("City   : "+city);
            System.out.println();

        }

    }
}

public class Assignment3task1 {
    public static void main(String[] args) {
        Person person_obj1=new Person("Muhammad Younis");
        Person.Adress adress_obj1=person_obj1.new Adress("D-Chowk street-55","Daharki");

        Person person_obj2=new Person("Muhammad Mubeen");
        Person.Adress adress_obj2=person_obj1.new Adress("T-Chowk street-40","Larkana");


        adress_obj1.getAdress();
        adress_obj2.getAdress();

    }
}
