import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){

        Label scoreBoard = new Label("Your Score: ");
        Text text = new Text();
        HBox hbox = new HBox(scoreBoard, text);
        GamePane myPane = new GamePane();

        myPane.scoreProperty().addListener(ov -> {
            text.setText(Integer.toString(myPane.scoreProperty().getValue()));
        });
        
        BorderPane bPane = new BorderPane();
        bPane.setBottom(hbox);
        bPane.setCenter(myPane);
        
        myPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.RIGHT || e.getCode() == KeyCode.LEFT){
                myPane.movePaddle(e);
            }

            else if (e.getCode() == KeyCode.ENTER){
                myPane.play();
            }
        });

        Scene scene = new Scene(bPane, 1000, 700);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        //primaryStage.setResizable(false);

        myPane.requestFocus();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
