package Clients;

import java.time.LocalDate;

public class Owl extends Animal implements Flyable, Goable{
    public Owl(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Owl() {
        super();
    }

    @Override
    public void eat() {
        System.out.println(nickname + " ест мышку");
    }

    @Override
    public void sleep() {
        System.out.println(nickname + " спит");
    }

}
