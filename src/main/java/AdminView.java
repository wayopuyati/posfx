import javafx.geometry.Pos;
import javafx.scene.effect.Reflection;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class AdminView extends BorderPane {

    public AdminView() {
        createView();
    }

    private void createView() {
        ImageView image = new ImageView("https://picsum.photos/600/200");
        image.setEffect(new Reflection());
        setCenter(image);
        setAlignment(image, Pos.TOP_CENTER);
    }
} 