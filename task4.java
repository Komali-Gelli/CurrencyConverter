import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        CURRENCY CONVERTER");
        System.out.println("=================================");

        System.out.println("Available currencies:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        System.out.println("4. GBP");

        System.out.print("\nEnter base currency: ");
        String base = scanner.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String target = scanner.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double result;

        if (base.equals("INR") && target.equals("USD")) {
            result = amount / 83.0;
        } 
        else if (base.equals("USD") && target.equals("INR")) {
            result = amount * 83.0;
        } 
        else if (base.equals("INR") && target.equals("EUR")) {
            result = amount / 90.0;
        } 
        else if (base.equals("EUR") && target.equals("INR")) {
            result = amount * 90.0;
        } 
        else if (base.equals("INR") && target.equals("GBP")) {
            result = amount / 105.0;
        } 
        else if (base.equals("GBP") && target.equals("INR")) {
            result = amount * 105.0;
        } 
        else if (base.equals("USD") && target.equals("EUR")) {
            result = amount * 0.92;
        } 
        else if (base.equals("EUR") && target.equals("USD")) {
            result = amount / 0.92;
        } 
        else if (base.equals("USD") && target.equals("GBP")) {
            result = amount * 0.79;
        } 
        else if (base.equals("GBP") && target.equals("USD")) {
            result = amount / 0.79;
        } 
        else if (base.equals(target)) {
            result = amount;
        } 
        else {
            System.out.println("Currency conversion not available.");
            scanner.close();
            return;
        }

        System.out.printf(
            "\n%.2f %s = %.2f %s\n",
            amount, base, result, target
        );

        scanner.close();
    }
}