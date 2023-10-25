import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EnlargeHandler implements EventHandler<ActionEvent> {

    CirclePane circlePane;

    public EnlargeHandler(CirclePane circlePane){
        this.circlePane = circlePane; 
    }

    @Override
    public void handle(ActionEvent e){
        circlePane.enlarge();
    }
    
}
