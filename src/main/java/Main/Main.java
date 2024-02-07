package Main;

import Clients.*;
import Clinic.VetClinic;
import Drugstore.Component;
import Drugstore.Components.Azitronite;
import Drugstore.Components.Penicillin;
import Drugstore.Components.Water;
import Drugstore.Pharmacy;
import Personal.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Component penicillin = new Penicillin("Penicillin", 5D, 5);
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 4D, 10);
        Pharmacy p1 = new Pharmacy();
        p1.addComponents(penicillin, water);
        Pharmacy p2 = new Pharmacy();
        p2.addComponents(azitronite, water);
        Pharmacy p3 = new Pharmacy();
        p3.addComponents(azitronite, penicillin);

        List<Pharmacy> pharmacies = new ArrayList<>();

        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);

        Collections.sort(pharmacies);
        System.out.println(pharmacies);

//        List<Component> components = new ArrayList<>();
//
//        components.add(penicillin);
//        components.add(azitronite);
//        components.add(water);
//
//        System.out.println(components);
//        Collections.sort(components);
//        System.out.println(components);
//        for (Component c : p1) {
//            System.out.println(c);
//        }
    }

}