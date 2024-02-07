package Drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>{
    private List<Component> components = new ArrayList<>();
    private int index;
    private int power;

    public void addComponents(Component ... components){
        for (Component c : components){
            this.components.add(c);
            this.power += c.getPower();
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }


    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.power, o.power);
    }

    @Override
    public String toString() {
        return components.toString();
    }
}
