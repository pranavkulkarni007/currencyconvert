import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates (example rates, you can update them as needed)
        double usdToEur = 0.92;
        double eurToUsd = 1.09;
        double usdToInr = 83.00;
        double inrToUsd = 0.012;
        double eurToInr = 90.00;
        double inrToEur = 0.011;
        double usdToGbp = 0.76;
        double gbpToUsd = 1.32;
        double inrToGbp = 0.0095;
        double gbpToInr = 105.00;

        System.out.println("Currency Converter");
        System.out.println("Available currencies: USD, EUR, INR, GBP");

        // Get user input
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter source currency (USD, EUR, INR, GBP): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (USD, EUR, INR, GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

        double convertedAmount = 0;
        boolean validConversion = true;

        // Perform conversion
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            convertedAmount = amount * usdToEur;
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            convertedAmount = amount * eurToUsd;
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("INR")) {
            convertedAmount = amount * usdToInr;
        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("USD")) {
            convertedAmount = amount * inrToUsd;
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("INR")) {
            convertedAmount = amount * eurToInr;
        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("EUR")) {
            convertedAmount = amount * inrToEur;
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            convertedAmount = amount * usdToGbp;
        } else if (sourceCurrency.equals("GBP") && targetCurrency.equals("USD")) {
            convertedAmount = amount * gbpToUsd;
        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("GBP")) {
            convertedAmount = amount * inrToGbp;
        } else if (sourceCurrency.equals("GBP") && targetCurrency.equals("INR")) {
            convertedAmount = amount * gbpToInr;
        } else if (sourceCurrency.equals(targetCurrency)) {
            convertedAmount = amount;
        } else {
            validConversion = false;
            System.out.println("Invalid currency selection.");
        }

        if (validConversion) {
            System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}
