module veterinariaApp {

    requires javafx.controls;
    requires javafx.fxml;
    opens co.edu.uniquindio.poo.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.view to javafx.fxml;
    exports co.edu.uniquindio.poo.app;
    exports co.edu.uniquindio.poo.model;
}
