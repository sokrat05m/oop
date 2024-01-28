package Clients;

import java.time.LocalDate;

public class Animal {
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

//    public void lifeCycle(){
//        wakeUp();
//        hunt();
//        eat();
//        sleep();
//    }
    public void wakeUp(){
        System.out.println();
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    public void hunt(){
        System.out.println("Животное охотится!");
    }
    public void eat(){
        System.out.println("Животное ест!");
    }
    public void sleep(){
        System.out.println("Животное уснуло!");
    }
    public void fly(){
        System.out.println("Животное летает");
    }
    public void toGo(){
        System.out.println("Животное ходит!");
    }
    public void swim(){
        System.out.println("Животное плавает");
    }
    @Override
    public String toString() {
        return String.format(
                "Имя животного: %s\nДата рождения: %s\nХозяин: %s\n" +
                        "Болезнь: %s", nickname, birthDate, owner, illness);
    }
}
