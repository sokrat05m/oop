package Clients;

public interface Flyable {
    default double getFlySpeed(){
        return 10D;
    }
}
