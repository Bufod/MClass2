package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Controller {

    @FXML
    private Button goForward;

    @FXML
    void goForwardOnAction(ActionEvent event) throws IOException {
        Transition.hideWindow(goForward);
        Transition.openWindow(getClass().getResource("/sample/sample2.fxml"));
    }

}
