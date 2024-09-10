module org.example.kiemtra {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kiemtra to javafx.fxml;
    exports org.example.kiemtra;
}