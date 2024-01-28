package Clients;

import java.time.LocalDate;

public class Cat extends Animal{
    Double discount;

    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public static void meow(){
        System.out.println("Мяяяяяяу!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nСкидка: " + discount +" %";
    }

    @Override
    public void fly() {
        System.out.println("Коты не летают!");
    }

    @Override
    public void swim() {
        System.out.println("Коты боятся воды!");;
    }
}
