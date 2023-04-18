package homework.homework8;

import java.util.Arrays;

public class Phone {

    public static void main(String[] args) {
        Phone huawei = new Phone(1234,"A52s", 250);
        Phone iphone = new Phone(344, "13 ProMax", 100);
        Phone xiaomi = new Phone(3242, "S12", 244);
        huawei.receiveCall("+375291598236", "Polina");
        huawei.receiveCall("Overloaded method");
        System.out.println("Numbers for messages: ");
        iphone.sendMessage("+375291598234", "+375292485392", "+375339885432");
        System.out.println(huawei + " " + iphone + " " + xiaomi);

    }
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }


    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.println("overloaded method");
    }
    public void receiveCall(String callNumber, String name){
        System.out.println("Calling: " + callNumber + " - " + name);
    }

    public void sendMessage(String...numbersForMessage){
        System.out.println(Arrays.toString(numbersForMessage));
    }



    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

}
