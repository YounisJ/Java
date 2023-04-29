class student {
    int studentid;
    String name;

    student(int studentid,String name)
    {
        this.studentid=studentid;
        this.name=name;
    }
   public String toString ()
    {
        return studentid+" "+name;
    }


}
public class tostring
{
    public static void main(String[] args) {
        student s1=new student(231,"Younis");
        student s2=new student(232,"waseem");

        System.out.println(s1.toString());
        System.out.println(s1.toString());

    }
}
