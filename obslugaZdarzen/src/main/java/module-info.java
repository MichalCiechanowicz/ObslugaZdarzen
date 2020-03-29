module ObslugaZdarzen {

    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    
    exports com.poweremabox.obslugaZdarzen.main to javafx.graphics;
    opens com.poweremabox.obslugaZdarzen.controller to javafx.fxml;
}