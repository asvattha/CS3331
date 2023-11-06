import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){

        GamePane myPane = new GamePane();

        myPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.RIGHT || e.getCode() == KeyCode.LEFT){
                myPane.movePaddle(e);
                
            }
        });





        Scene scene = new Scene(myPane, 1000, 700);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        //primaryStage.setResizable(false);

        myPane.requestFocus();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
