package Personal;

import Clients.Animal;

public class Doctor extends AbstractPersonal{
    public Doctor(String fullName, int experienceYears) {
        super(fullName, experienceYears);
    }

    public Doctor() {
        super();
    }

    public void cure (Animal animal){
        System.out.println("Доктор " + fullName + " лечит животное " + animal.getNickname());
    }
}
