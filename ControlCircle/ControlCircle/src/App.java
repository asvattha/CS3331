import org.w3c.dom.events.Event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{

    private CirclePane circlePane = new CirclePane();

    public void start(Stage primaryStage){

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHandler());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("Control Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e){
            circlePane.enlarge();
        }
    }

    class ShrinkHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e){
            circlePane.shrink();
        }
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
