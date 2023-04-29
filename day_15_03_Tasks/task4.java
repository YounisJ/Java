public class task4 {
    public static void main(String[] args) {

        String st="Brown";
        char store;

        for (int i=st.length()-1; i>=0;  --i)
        {

            store=st.charAt(i);
            System.out.print(store);
        }
    }
}
