import java.util.Vector;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Pair;

public class Bricks extends Pane{
    
    int rows = 3, cols = 7;
    //Rectangle bricks[][] = new Rectangle[rows][cols];
    //int hit[][] = new int[rows][cols];
    Vector<Rectangle> bricks = new Vector<>();
    double brickX = 230, brickY = 100, brickWidth = 80, brickHeight = 30;

    IntegerProperty scoreProperty = new SimpleIntegerProperty();

    public Bricks(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                Rectangle rectangle = new Rectangle(brickX + j*brickWidth, brickY + i*brickHeight, brickWidth, brickHeight);
                rectangle.setStroke(Color.WHITE);
                getChildren().add(rectangle);
                bricks.add(rectangle);
                //hit[i][j] = 1;
            }
        }
    }

    public IntegerProperty scoreProperty(){
        return scoreProperty;
    }

    public Pair<Boolean,String> intersects(Circle ball){
        Pair<Boolean, String> result = new Pair<Boolean, String>(false, "");

        for (Rectangle r : bricks){
                    if (r.intersects(ball.getBoundsInLocal())){
                        scoreProperty.setValue(scoreProperty.getValue() + 5);
                        if (
                            (ball.getCenterY() - ball.getRadius() <= r.getY() + r.getHeight() || 
                            ball.getCenterY() + ball.getRadius() >= r.getY()) 
                            && 
                            (ball.getCenterX() >= r.getX() &&
                            ball.getCenterX() <= r.getX() + r.getWidth())
                        ) {
                            result = new Pair<Boolean,String>(true, "y");
                        }
                        
                        else if (
                            (ball.getCenterX() - ball.getRadius() <= r.getX() + r.getWidth() || 
                            ball.getCenterX() + ball.getRadius() >= r.getX()) 
                            && 
                            (ball.getCenterY() >= r.getY() &&
                            ball.getCenterY() <= r.getY() + r.getHeight())
                        ){
                            result =  new Pair<Boolean,String>(true, "x");
                        }
                        else {
                            result = new Pair<Boolean,String>(true, "y");
                        }

                        getChildren().remove(r);
                        bricks.remove(r);
                        //hit[i][j] = 0;
                        return result;
                    }
                //}
            
        }
        return result;
    }

}
