package Main;

import Clients.*;
import Clinic.VetClinic;
import Personal.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner sokrat = new Owner("Сократ");
        Illness rana = new Illness("Рана ноги");
        List<Goable> lst = new ArrayList<>();
        Cat ketu = new Cat("Гъаба", sokrat, LocalDate.now(), rana, 10D);
        Dog hoy = new Dog();
        lst.add(ketu);
        lst.add(hoy);

        Doctor doc = new Doctor();
        doc.cure(ketu);
        VetClinic clinic = new VetClinic();
        clinic.addPatients(ketu);
        System.out.println(clinic.getPatients());
        clinic.addPersonal(doc);
        System.out.println(clinic.getPersonal());
    }
}