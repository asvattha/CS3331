import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Pair;

public class Bricks extends Pane{
    
    int rows = 3, cols = 7;
    Rectangle bricks[][] = new Rectangle[rows][cols];
    int hit[][] = new int[rows][cols];
    double brickX = 230, brickY = 100, brickWidth = 80, brickHeight = 30;

    public Bricks(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                bricks[i][j] = new Rectangle(brickX + j*brickWidth, brickY + i*brickHeight, brickWidth, brickHeight);
                bricks[i][j].setStroke(Color.WHITE);
                getChildren().add(bricks[i][j]);
                hit[i][j] = 1;
            }
        }
    }

    public Pair<Boolean,String> intersects(Circle ball){
        Pair<Boolean, String> result = new Pair<Boolean, String>(false, "");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (hit[i][j] == 1){
                    if (bricks[i][j].intersects(ball.getBoundsInLocal())){
                        if (
                            (ball.getCenterY() - ball.getRadius() <= bricks[i][j].getY() + bricks[i][j].getHeight() || 
                            ball.getCenterY() + ball.getRadius() >= bricks[i][j].getY()) 
                            && 
                            (ball.getCenterX() >= bricks[i][j].getX() &&
                            ball.getCenterX() <= bricks[i][j].getX() + bricks[i][j].getWidth())
                        ) {
                            result = new Pair<Boolean,String>(true, "y");
                        }
                        
                        else if (
                            (ball.getCenterX() - ball.getRadius() <= bricks[i][j].getX() + bricks[i][j].getWidth() || 
                            ball.getCenterX() + ball.getRadius() >= bricks[i][j].getX()) 
                            && 
                            (ball.getCenterY() >= bricks[i][j].getY() &&
                            ball.getCenterY() <= bricks[i][j].getY() + bricks[i][j].getHeight())
                        ){
                            result =  new Pair<Boolean,String>(true, "x");
                        }
                        else {
                            result = new Pair<Boolean,String>(true, "y");
                        }

                        getChildren().remove(bricks[i][j]);
                        hit[i][j] = 0;
                        return result;
                    }
                }
            }
        }
        return result;
    }

}
