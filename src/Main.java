import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");
        double price = input.nextDouble();

        double shipping;

        if (price >= 100) {
            shipping = 0;
        } else {
            shipping = price * 0.02;
        }

        double total = price + shipping;

        System.out.printf("Shipping cost: $%.2f%n", shipping);
        System.out.printf("Total price: $%.2f%n", total);
    }
}