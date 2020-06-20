package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Controller2 {

    @FXML
    private Button goBackward;

    @FXML
    void goBackwardOnAction(ActionEvent event) throws IOException {
        Transition.hideWindow(goBackward);
        Transition.openWindow(getClass().getResource("/sample/sample.fxml"));
    }

}
