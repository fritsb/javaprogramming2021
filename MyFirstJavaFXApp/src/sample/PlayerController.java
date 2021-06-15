package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PlayerController {
    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtAge;

    private Player currentPlayer;

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
        setFormData();
    }

    public void setFormData() {
        if(currentPlayer != null) {
            txtFirstName.setText(currentPlayer.getFirstName());
            txtLastName.setText(currentPlayer.getLastName());
            txtAge.setText(currentPlayer.getAge());
        }
    }


}
