import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ShowCircle extends Application{

    public void start(Stage primarStage){
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // binding circle with the pane
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        Scene scene = new Scene(pane, 200, 200);
        primarStage.setTitle("Show circle");
        primarStage.setScene(scene);
        primarStage.show();
    }
    public static void main(String[] args){
        launch();
    }
    
}
