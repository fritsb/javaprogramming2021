package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField txtFirstName;

    @FXML
    private Button btnSubmit;

    @FXML
    private Label lblInfo;

    @FXML
    private ComboBox cbPlayers;

    private ArrayList<Player> players;

    @FXML
    private void handleSubmitButton(ActionEvent event) {
        System.out.println("handleSubmitButton uitgevoerd");

        Player tmpPlayer = (Player) cbPlayers.getSelectionModel().getSelectedItem();
        if(tmpPlayer != null) {
            lblInfo.setText(tmpPlayer.toString());
            try {
                // Following lines will load the second fxml-file
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("player.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();

                // Following lines will pass data to the second controller, so we can use data from first view in second view
                PlayerController controller = fxmlLoader.<PlayerController>getController();
                controller.setCurrentPlayer(tmpPlayer);
            }
            catch(Exception e) {
                System.out.println("Exception loading fxml");
            }
        }
        else {
            lblInfo.setText("Geen speler geselecteerd");
        }




        /*

        String firstName = txtFirstName.getText();

        if(firstName != "" && firstName.length() > 1) {
            lblInfo.setText( txtFirstName.getText()  );
        }
        else {
            lblInfo.setText("Ongeldige invoer");
        }*/



    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        players = new ArrayList<>();

        Player depay = new Player("Memphis","Depay",30);
        Player stekelenburg = new Player("Maarten", "Stekelenburg",38);
        Player dumfries = new Player("Dummy","Dumfries",25);

        players.add(depay);
        players.add(stekelenburg);
        players.add(dumfries);

        Collections.sort(players, Collections.reverseOrder());

    //  Zie dit artikel voor ArrayList vs ObservableList: https://stackoverflow.com/questions/41920217/what-is-the-difference-between-arraylist-and-observablelist

        ObservableList<Player> oPlayers = FXCollections.observableArrayList(players);
        cbPlayers.setItems(oPlayers);



    }
}
