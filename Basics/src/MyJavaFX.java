import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{

    public void start(Stage primaryStage){

        Button okBtn = new Button("OK");
        Scene scene = new Scene(okBtn, 200, 150);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Creating new stage
        Stage myStage = new Stage();
        myStage.setTitle("Second stage");
        myStage.setScene(new Scene(new Button("New Stage"), 200, 250));
        myStage.show();
    }
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
