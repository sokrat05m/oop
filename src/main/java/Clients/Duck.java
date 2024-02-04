package Clients;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Flyable, Swimable{
    public Duck(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Duck() {
        super();
    }

    @Override
    public void eat() {
        System.out.println(nickname + " ест рыбку");
    }

    @Override
    public void sleep() {
        System.out.println(nickname + " спит");
    }

}
