import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.effect.Reflection;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class AdminView extends Group {

    public AdminView() {
        createView();
    }

    private void createView() {
        SquishyImage image = new SquishyImage("https://picsum.photos/400/150");
        image.setEffect(new Reflection());
        getChildren().add(image);
        //setAlignment(image, Pos.TOP_CENTER);
    }
} 