package classwork.lesson8;

public class Parent {
    protected String value = "fdfd";
    public Parent(){
        System.out.println("this is my default constructor");
    }
    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
