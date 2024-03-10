import java.util.Scanner;

public class CurrencyConverter {
    private static final String EXCHANGE_RATE_API_URL = "https://api.example.com/exchangerates";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base currency code (e.g., USD): ");
        String baseCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the target currency code (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();
        double convertedAmount = convertCurrency(amountToConvert, exchangeRate);
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        return 1.2;
    }

    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
