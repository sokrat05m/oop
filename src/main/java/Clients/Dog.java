package Clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void fly() {
        System.out.println("Собаки не летают!");
    }
}
