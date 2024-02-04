package Clients;

import java.time.LocalDate;

public abstract class Animal {
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;

    private Illness illness;

    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болезнь"));
    }

    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void wakeUp(){
        System.out.println();
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    public abstract void eat();
    public abstract void sleep();



    @Override
    public String toString() {
        return String.format(
                "Имя животного: %s\nДата рождения: %s\nХозяин: %s\n" +
                        "Болезнь: %s", nickname, birthDate, owner, illness);
    }
}
