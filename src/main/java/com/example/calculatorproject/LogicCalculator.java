package com.example.calculatorproject;

import javafx.scene.control.TextField;

public class LogicCalculator {

    private StringBuilder currentInput = new StringBuilder();
    private TextField display;

    private String operator = "";
    private double firstOperand = 0;

    public void setDisplay(TextField display) {
        this.display = display;
    }

    public void appendNumber(String number) {
        currentInput.append(number);
        if (display != null) {
            display.setText(currentInput.toString());
        }
    }

    public void setOperator(String op) {
        if (currentInput.length() > 0) {
            firstOperand = Double.parseDouble(currentInput.toString());
            operator = op;
            currentInput.setLength(0);
        }
    }

    public void calculateResult() {
        if (currentInput.length() > 0 && !operator.isEmpty()) {
            double secondOperand = Double.parseDouble(currentInput.toString());
            double result = 0;

            switch (operator) {
                case "+" -> result = firstOperand + secondOperand;
                case "-" -> result = firstOperand - secondOperand;
                case "*" -> result = firstOperand * secondOperand;
                case "/" -> result = secondOperand != 0 ? firstOperand / secondOperand : 0;
            }

            System.out.println("Результат: " + result);
            currentInput.setLength(0);
            currentInput.append(result);
            operator = "";

            if (display != null) {
                display.setText(currentInput.toString());
            }
        }
    }

    public void clear() {
        currentInput.setLength(0);
        operator = "";
        firstOperand = 0;
        if (display != null) {
            display.setText("");
        }
    }

    public void appendDot() {
        if (!currentInput.toString().contains(".")) {
            if (currentInput.length() == 0) {
                currentInput.append("0.");
            } else {
                currentInput.append(".");
            }
            if (display != null) {
                display.setText(currentInput.toString());
            }
        }
    }

}
