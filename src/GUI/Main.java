package GUI;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main extends Application {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Ford","F-150",2018, 76234);
        Vehicle vehicle2 = new Vehicle("JDub","Transporter",2020,0);

//        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
