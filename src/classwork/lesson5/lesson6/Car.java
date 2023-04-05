package classwork.lesson5.lesson6;

public class Car {

    private String color;  // параметр класса  // public - каждый может поменять признак, private - икто не может изменить
    private int age;
    private String brand;
    private int wheelNumber = 4; //значение по умолчанию

    private boolean isRadioPresent = true;
    //todo
    //fixme
    private String korobka = "Auto";

    private int currentSpeed = 0;
    //признаки
    //цвет машины, год машины, марка машины, количество колёс, двигатель, кузов, есть ли магнитола, коробка передач

    public Car(String color, int age, String brand, int wheelNumber, boolean isRadioPresent, String korobka) {
        this.color = color;
        this.age = age;
        this.brand = brand;
        this.wheelNumber = wheelNumber;
        this.isRadioPresent = isRadioPresent;
        this.korobka = korobka;
    }

    public Car() {
    }

    public Car(String color, int age, String brand) {  //String color - параметр метода
        this.color = color;  // this. - используется именно парамет метода
        this.age = age;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getBrand() {
        return brand;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isRadioPresent() {
        return isRadioPresent;
    }

    public void setRadioPresent(boolean radioPresent) {
        isRadioPresent = radioPresent;
    }

    public String getKorobka() {
        return korobka;
    }

    public void setKorobka(String korobka) {
        this.korobka = korobka;
    }

    public void startDriving(){
        System.out.println("Woof-woof");
    }

    public void sound(){
        System.out.println("bee-beep!!!");
    }

    public void goDiracltly(){
        System.out.println("My car us going!!!");
    }

    public void switchDirection(boolean isRightOne){
        if(currentSpeed > 30){
            System.out.println("It is too dangerous to switch direction");
            return;
        }
        if (isRightOne) {
            System.out.println("We are moving to the right direction");
        } else {
            System.out.println("We are moving to the left direction");
        }

    }
    {
        age = 2022;
    }

    public void changeSpeed(int speedChange){
        currentSpeed = currentSpeed + speedChange;
        if(speedChange > 0){
            System.out.println("We are moving faster, our speed is " + currentSpeed);
        } else {
            System.out.println("We are moving slower, our speed is " + currentSpeed);
        }
        if(currentSpeed <= 0){
            System.out.println("We finished our best trip");
        }
    }
    @Override
    public String toString() {
        return " This is my best Car{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", wheelNumber=" + wheelNumber +
                ", isRadioPresent=" + isRadioPresent +
                ", korobka='" + korobka + '\'' +
                '}';
    }

    //действия
    // завестись, подать сигнал, поехать вперёд, повернуть, ускориться или замедлиться
}
