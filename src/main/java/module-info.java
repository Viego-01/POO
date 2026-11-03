module com.mycompany.nomina {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.nomina to javafx.fxml;
    exports com.mycompany.nomina;
}
