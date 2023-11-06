import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class GamePane extends Pane{

    double ballX = 200, ballY = 400, radius = 20;
    Circle ball = new Circle(ballX, ballY, radius);

    double paddleX = 350, paddleY = 600, paddleWidth = 150, paddleHeight = 20;
    Rectangle paddle = new Rectangle(paddleX, paddleY, paddleWidth, paddleHeight);

    public GamePane(){
        getChildren().addAll(ball, paddle);
    }
    
}
