import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class GamePane extends Pane{

    double ballX = 200, ballY = 400, radius = 20;
    Circle ball = new Circle(ballX, ballY, radius);

    double paddleX = 350, paddleY = 600, paddleWidth = 150, paddleHeight = 20;
    double speed = 20;
    Rectangle paddle = new Rectangle(paddleX, paddleY, paddleWidth, paddleHeight);

    public GamePane(){
        getChildren().addAll(ball, paddle);
    }

    public void movePaddle(KeyEvent e){
        if (e.getCode() == KeyCode.LEFT){
            if (paddleX > 0)
                paddleX -= speed;
        }
        else if (e.getCode() == KeyCode.RIGHT){
            if (paddleX + paddleWidth < getWidth())
                paddleX += speed;
        }
        paddle.setX(paddleX);
    }
    
}
