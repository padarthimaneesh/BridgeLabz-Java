package javacollectionsandstreams.javagenerics;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void show();
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

    void show() {
        System.out.println("Electronics Item: " + name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

    void show() {
        System.out.println("Grocery Item: " + name);
    }
}

class Storage<T extends WarehouseItem> {
    T item;

    Storage(T item) {
        this.item = item;
    }

    void display() {
        item.show();
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> s1 = new Storage<>(new Electronics("Laptop"));
        Storage<Groceries> s2 = new Storage<>(new Groceries("Rice"));

        s1.display();
        s2.display();
    }
}