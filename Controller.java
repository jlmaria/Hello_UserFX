package hellofx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

@SuppressWarnings("ALL")
public class Controller {

    @FXML
    private TextField txt_name;

    @FXML
    void Show_Message() {

        String message = txt_name.getText();
        JOptionPane.showMessageDialog(null, "Hello, " + message, "Hello", JOptionPane.INFORMATION_MESSAGE);

    }

    @FXML
    public static void Close_Request(){

        int confirmar = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Closing", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirmar == JOptionPane.OK_OPTION) {

            JOptionPane.showMessageDialog(null, "Thanks for use the Hello User app", "Exit", JOptionPane.INFORMATION_MESSAGE);
            Platform.exit();

        }

    }

}