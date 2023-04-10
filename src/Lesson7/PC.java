package Lesson7;

public class PC extends Comp{

    public PC(String hdd, String ram){
        super(hdd, ram);
    }

    @Override
    public void printDisplay() {
        System.out.println("this is PC display");
    }


}
