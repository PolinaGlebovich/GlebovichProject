package Lesson7;

public class Laptop extends Comp {//класс Laptop содержит все параметры, что и Comp


    public Laptop(String hdd, String ram, String touchpad){

        super(hdd, ram);
        this.touchpad = touchpad;
        this.username = "Polina";
    }
    private String touchpad;

    private String getTouchpad(){
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public void printDisplay() {
        System.out.println("this is laptop display");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad='" + touchpad + '\'' +
                "} " + super.toString();
    }
}



