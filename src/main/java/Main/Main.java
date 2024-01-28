package Main;

import Clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Солнышко", new Owner("Сократ Магомедович"),
                LocalDate.of(2021, 05, 10), new Illness("Лишай"));
        Cat catty = new Cat();
        Dog sobaka = new Dog();
        sobaka.fly();
        Owl sova = new Owl();
        sova.swim();
    }
}