class person implements Cloneable
{
    String face;
    String hair;
    String eyes;


    public person clone() {
        try {
            person clone = (person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    void show()
    {
        System.out.println(face);
        System.out.println(hair);
        System.out.println(eyes);
    }
}
public class objclonning implements Cloneable

{

    public static void main(String[] args) {

        person younis=new person();

        younis.face="round";
        younis.eyes="Brown";
        younis.hair="Black";

        person kashii=(person) younis.clone();

        younis.show();
        System.out.println();
        kashii.show();





    }
}
