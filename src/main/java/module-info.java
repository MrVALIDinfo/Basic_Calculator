module com.example.calculatorproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.compiler;


    opens com.example.calculatorproject to javafx.fxml;
    exports com.example.calculatorproject;
}