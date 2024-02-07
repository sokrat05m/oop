package Drugstore;

public abstract class Component implements Comparable<Component>{
    private String title;
    private Double weight;
    private int power;

    public int getPower() {
        return power;
    }

    public  Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;

    }

    @Override
    public String toString() {
        return String.format("Title: %s, power: %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power, o.power); // чтобы сортировать в обратном порядке, необходимо поменять аргументы местами
        // либо добавить comparator.reverseOrder() непосредственно при сортироваке
    }
}
