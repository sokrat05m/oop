package Personal;

public class Nurse extends AbstractPersonal{
    public Nurse(String fullName, int experienceYears) {
        super(fullName, experienceYears);
    }

    public Nurse() {
        super();
    }
    public void helpDoctor(Doctor doctor){
        System.out.println(fullName + " помогает доктору " + doctor.fullName);
    }
}
