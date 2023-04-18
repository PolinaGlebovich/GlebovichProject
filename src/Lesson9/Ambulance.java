package Lesson9;

import javax.print.Doc;
import java.util.Random;

public class Ambulance {
    public static void main(String[] args) {
        //1 - создать пациентов
        Patient[] patients = getPatients();

        for(Patient patient: patients){
            //2 - прописать им план лечения
            setMedicalPlan(patient);
            Doctor doctor = getDoctorToPatient(patient);
            doctor.heal();
        }

    }

    /**
     * We give a doctor to Patient, if medicalPlan = 1 - we give Terapevt
     * if medicalPlan = 2, we give Dantist
     * else - we give surgeon
     * @param patient - current patient
     * @return - needed type of Doctor
     */
    private static Doctor getDoctorToPatient(Patient patient){
        if(patient.getMedicalPlan() == 1){
            return new Therapist();
        }
        if(patient.getMedicalPlan() == 2){
            return new Dantist();
        }
        return new Surgeon();
    }

    /**
     * set different medical plans to patient
     * @param patient - current patient
     */
    private static void setMedicalPlan(Patient patient) {
        if(patient.getName() == null){
            patient.setMedicalPlan(1);
        } else {
            Random random = new Random();
            patient.setMedicalPlan(random.nextInt(3));
        }
    }

    private static Patient[] getPatients(){
        Patient [] patients = new Patient[2];
        patients[0] = new Patient("Vasya Pupkin", 23);
        patients[1] = new Patient();
        return new Patient[0];
    }
}
