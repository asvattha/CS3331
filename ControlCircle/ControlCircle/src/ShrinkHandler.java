import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShrinkHandler implements EventHandler<ActionEvent> {

    CirclePane circlePane;

    public ShrinkHandler(CirclePane circlePane){
        this.circlePane = circlePane; 
    }

    @Override
    public void handle(ActionEvent e){
        circlePane.shrink();
    }
    
}