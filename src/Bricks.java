import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Bricks extends Pane{
    
    int rows = 3, cols = 7;
    Rectangle bricks[][] = new Rectangle[rows][cols];
    double brickX = 230, brickY = 100, brickWidth = 80, brickHeight = 30;

    public Bricks(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                bricks[i][j] = new Rectangle(brickX + j*brickWidth, brickY + i*brickHeight, brickWidth, brickHeight);
                bricks[i][j].setStroke(Color.WHITE);
                getChildren().add(bricks[i][j]);
            }
        }
    }

}
