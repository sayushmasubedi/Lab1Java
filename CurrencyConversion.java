package com.example.sayu;

public class CurrencyConversion {
    public double convert(String fromCurrency, String toCurrency, double amount) {
        // Dummy implementation, replace with actual conversion logic
        return amount * getConversionRate(fromCurrency, toCurrency);
    }

    private double getConversionRate(String fromCurrency, String toCurrency) {
        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {
                    case "CAD":
                        return 1.25; // 1 USD = 1.25 CAD
                    case "COP":
                        return 3789.50; // 1 USD = 3789.50 COP
                    case "YEN":
                        return 110.20; // 1 USD = 110.20 YEN
                    case "EGP":
                        return 15.71; // 1 USD = 15.71 EGP
                }
                break;
            case "CAD":
                switch (toCurrency) {
                    case "USD":
                        return 0.80; // 1 CAD = 0.80 USD
                    case "COP":
                        return 3032.16; // 1 CAD = 3032.16 COP
                    case "YEN":
                        return 88.16; // 1 CAD = 88.16 YEN
                    case "EGP":
                        return 12.57; // 1 CAD = 12.57 EGP
                }
                break;
            case "COP":
                switch (toCurrency) {
                    case "USD":
                        return 0.00026; // 1 COP = 0.00026 USD
                    case "CAD":
                        return 0.00033; // 1 COP = 0.00033 CAD
                    case "YEN":
                        return 0.029; // 1 COP = 0.029 YEN
                    case "EGP":
                        return 0.0042; // 1 COP = 0.0042 EGP
                }
                break;
            case "YEN":
                switch (toCurrency) {
                    case "USD":
                        return 0.0091; // 1 YEN = 0.0091 USD
                    case "CAD":
                        return 0.0113; // 1 YEN = 0.0113 CAD
                    case "COP":
                        return 34.44; // 1 YEN = 34.44 COP
                    case "EGP":
                        return 0.14; // 1 YEN = 0.14 EGP
                }
                break;
            case "EGP":
                switch (toCurrency) {
                    case "USD":
                        return 0.064; // 1 EGP = 0.064 USD
                    case "CAD":
                        return 0.079; // 1 EGP = 0.079 CAD
                    case "COP":
                        return 238.10; // 1 EGP = 238.10 COP
                    case "YEN":
                        return 7.14; // 1 EGP = 7.14 YEN
                }
                break;
        }
        throw new IllegalArgumentException("Conversion rate not available for specified currencies.");
    }
}
