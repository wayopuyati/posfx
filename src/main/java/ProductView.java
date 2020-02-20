import javafx.geometry.Insets;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class ProductView extends StackPane {

    private Product product;

    public ProductView(Product product) {
        this.product = product;
        createView();
    }

    public void createView() {
        setPadding(new Insets(14));
        ImageView imageView = new ImageView("https://picsum.photos/102");
        imageView.setEffect(new DropShadow());
        getChildren().add(imageView);
    }
}