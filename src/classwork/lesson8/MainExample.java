package classwork.lesson8;

public class MainExample {

    public static void main(String[] args) {

        final int myInt;
        myInt = 3;

        Parent Parent = new Child();
        Parent.setName("Tom");
        System.out.println(Parent.getName());

        BadParent superBadParent = new BadParent();
        Personable personable = new BadParent();


    }
}
