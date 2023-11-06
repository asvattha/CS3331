import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class GamePane extends Pane{

    double ballX = 200, ballY = 400, radius = 20;
    double dx = 1, dy = 1;
    Circle ball = new Circle(ballX, ballY, radius);

    double paddleX = 350, paddleY = 600, paddleWidth = 150, paddleHeight = 20;
    double speed = 20;
    Rectangle paddle = new Rectangle(paddleX, paddleY, paddleWidth, paddleHeight);

    Timeline ballAnimation;

    public GamePane(){
        getChildren().addAll(ball, paddle);
        ballAnimation = new Timeline(new KeyFrame(new Duration(10), e->moveBall()));
        ballAnimation.setCycleCount(Timeline.INDEFINITE);
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

    public void play(){
        ballAnimation.play();
    }

    public void moveBall(){
        if(ballY - radius < 0){
            dy *= -1;
        }
        else if (ballX + radius > getWidth() || ballX - radius < 0){
            dx *= -1;
        }
        else if (ball.intersects(paddle.getBoundsInLocal())){
            dy *= -1;
        }
        else if (ballY + radius > getHeight()){
            ballAnimation.stop();
        }

        ballX += dx;
        ballY += dy;
        ball.setCenterX(ballX);
        ball.setCenterY(ballY);
    }
    
}
