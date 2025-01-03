package CIS2206.Unit_14;

/**
 * An Item with name and priority
 *
 * @author Ilias Tachmazidis
 * @version September 2024
 */
public class Item implements Comparable<Item> {
    Integer priority;
    String name;

    public Item(String name) {
        this.priority = 0;
        this.name = name;
    }

    public Item(Integer priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        return this.priority.compareTo(o.priority);
    }
}
