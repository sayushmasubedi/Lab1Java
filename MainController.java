package com.example.sayu;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

    @FXML
    private ComboBox<String> fromComboBox;

    @FXML
    private ComboBox<String> toComboBox;

    @FXML
    private TextField amountTextField;

    @FXML
    private Button convertButton;

    @FXML
    private Label resultLabel;

    private CurrencyConversion conversion;

    @FXML
    public void initialize() {
        conversion = new CurrencyConversion();

        convertButton.setOnAction(event -> {
            try {
                String fromCurrency = fromComboBox.getValue();
                String toCurrency = toComboBox.getValue();
                double amount = Double.parseDouble(amountTextField.getText());
                double result = conversion.convert(fromCurrency, toCurrency, amount);
                resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, fromCurrency, result, toCurrency));
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter a valid amount.");
            } catch (IllegalArgumentException e) {
                resultLabel.setText(e.getMessage());
            }
        });
    }
}

