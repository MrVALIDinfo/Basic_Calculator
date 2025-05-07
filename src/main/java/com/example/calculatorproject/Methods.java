package com.example.calculatorproject;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;



public class Methods

{
    @FXML
    private TextField display;

    private LogicCalculator logic = new LogicCalculator();

    @FXML
    public void initialize() {
        logic.setDisplay(display);
    }

    @FXML
    public void clickNum0(ActionEvent event){
        logic.appendNumber("0");
    }

    @FXML
    public void clickNum1(ActionEvent event){
        logic.appendNumber("1");

    }
    @FXML
    public void clickNum2(ActionEvent event){
        logic.appendNumber("2");
    }
    @FXML
    public void clickNum3(ActionEvent event){
        logic.appendNumber("3");
    }
    @FXML
    public void clickNum4(ActionEvent event){
        logic.appendNumber("4");
    }
    @FXML
    public void clickNum5(ActionEvent event){
        logic.appendNumber("5");
    }
    @FXML
    public void clickNum6(ActionEvent event){
        logic.appendNumber("6");
    }
    @FXML
    public void clickNum7(ActionEvent event){
        logic.appendNumber("7");
    }
    @FXML
    public void clickNum8(ActionEvent event){
        logic.appendNumber("8");
    }
    @FXML
    public void clickNum9(ActionEvent event){
        logic.appendNumber("9");
    }

    @FXML
    public void clearAll(ActionEvent event){
        logic.clear();
    }
    @FXML
    public void ToMinus(ActionEvent event){
        logic.setOperator("-");

    }
    @FXML
    public void ToPlus(ActionEvent event){
        logic.setOperator("+");
    }
    @FXML
    public void ToMultiply(ActionEvent event){
        logic.setOperator("*");
    }
    @FXML
    public void ToDivided(ActionEvent event){
        logic.setOperator("/");
    }
    @FXML
    public void ToResult(ActionEvent event){
        logic.calculateResult();
    }

    @FXML
    public void clickDot(ActionEvent event) {
        logic.appendDot();
    }


}






