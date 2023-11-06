import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){

        GamePane myPane = new GamePane();
        Scene scene = new Scene(myPane, 1000, 700);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);



    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
