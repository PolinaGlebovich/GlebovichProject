package Lesson9;

public class Patient {
    private String name;
    private int age;

    // это то, к какому врачу мы собираемся отправить пациента
    private int medicalPlan;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    public int getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(int medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
