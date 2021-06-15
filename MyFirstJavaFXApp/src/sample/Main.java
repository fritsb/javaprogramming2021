package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /*
    Zie documentatie van JetBrains over JavaFX in combinatie met IntelliJ:
        “Configure JavaFX Scene Builder”:
 https://www.jetbrains.com/help/idea/opening-fxml-files-in-javafx-scene-builder.html
“Create a new JavaFX project”: https://www.jetbrains.com/help/idea/javafx.html
“Develop a basic JavaFX application":  https://www.jetbrains.com/help/idea/developing-a-javafx-application-examples.html
     */



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
