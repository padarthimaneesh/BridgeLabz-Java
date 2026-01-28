package javacollectionsandstreams.javagenerics;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void show() {
        System.out.println(name + " Price: " + price);
    }
}

public class OnlineMarketplace {

    static <T extends Product> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }

    public static void main(String[] args) {
        Product book = new Product("Java Book", 500);
        applyDiscount(book, 10);
        book.show();
    }
}