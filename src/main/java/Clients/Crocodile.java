package Clients;

import java.time.LocalDate;

public class Crocodile extends Animal implements Swimable {

    public Crocodile(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Crocodile() {
        super();
    }

    @Override
    public void eat() {
        System.out.println(nickname + " ест мясо");
    }

    @Override
    public void sleep() {
        System.out.println(nickname + " спит");
    }

}
