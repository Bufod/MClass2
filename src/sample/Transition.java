package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Transition {
    public static void openWindow(URL pathToFxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(pathToFxml);
        Parent rootLayout = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(rootLayout));
        stage.show();
    }

    public static void hideWindow(Node node){
        node.getScene().getWindow().hide();
    }
}
