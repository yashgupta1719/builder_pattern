import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product.Builder().id(1).color("yellow").build();
        Product p2 = new Product.Builder().name("charger").price(BigDecimal.valueOf(13.908)).build();
        Product p3 = Product.builder()
                .id(234)
                .name("toys")
                .price(BigDecimal.valueOf(129.1029))
                .build();
    }
}