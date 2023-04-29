public class var_arg
{

    void add(String st,String ...my_arr)
    {String  result="";

        for (String val:my_arr)
        {
            result+=val;
        }
        System.out.println(result);

    }
    public static void main(String[] args) {

        var_arg obj=new var_arg();

        obj.add("We ","Are ","Working ","On Var");

    }
}
