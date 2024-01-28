package Clients;

import java.time.LocalDate;

public class Owl extends Animal{
    public Owl(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Owl() {
        super();
    }

    @Override
    public void swim() {
        System.out.println("Совы не плавают!");
    }
}
