package Clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable{
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println(nickname + "ест кролика");
    }

    @Override
    public void sleep() {
        System.out.println(nickname + " спит");
    }

}
