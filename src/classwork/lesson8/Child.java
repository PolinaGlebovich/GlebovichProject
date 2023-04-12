package classwork.lesson8;

public class Child extends Parent {


    public Child(){
        super();  // всегда идёт первой строчкой
        System.out.println("This is mi child constructor");
        System.out.println(super.value);
        super.toString();
    }

    @Override
    public String getName() {
        System.out.println(super.getName());
        System.out.println(getName());
        return "this is cool child";
    }
}
