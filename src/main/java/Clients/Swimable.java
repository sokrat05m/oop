package Clients;

public interface Swimable {
    default double getSwimSpeed(){
        return 10D;
    }
}
