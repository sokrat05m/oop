package Clinic;

import Clients.Animal;
import Personal.AbstractPersonal;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private List<AbstractPersonal> personal = new ArrayList<>();
    private List<Animal> patients = new ArrayList<>();

    public VetClinic() {
        this.personal = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public List<Animal> getPatients() {
        return patients;
    }
    public List<AbstractPersonal> getPersonal(){
        return personal;
    }
    public void addPatients(Animal patient) {
        patients.add(patient);
    }
    public void addPersonal(AbstractPersonal personal) {
        this.personal.add(personal);
    }
    public void dischargePatient(Animal patient){
        patients.remove(patient);
    }
    public void fireWorker(AbstractPersonal personal) {
        this.personal.remove(personal);
    }
    public void giveSalary (AbstractPersonal person) {
        System.out.println("Работник " + person.getFullName() + " получил зарплату");
    }

}
