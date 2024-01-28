package Clients;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
    }

    public Duck() {
        super();
    }
}
