import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ProductView extends StackPane {

    private SelectProductListener listener;
    private Product product;

    public ProductView(Product product) {
        this.product = product;
        createView();
        onMouseClickedProperty().addListener( (e) -> {
            if (listener != null) {
                listener.selectProduct(this.product);
            }
        });
    }

    public void createView() {
        setPadding(new Insets(14));
        ImageView imageView = new ImageView("https://picsum.photos/102");
        imageView.setEffect(new DropShadow());
        getChildren().add(imageView);
        Rectangle box = new Rectangle(80,30);
        box.setFill(Color.web("#5A5A5A", 0.5));
        box.setArcWidth(10);
        box.setArcHeight(10);
        getChildren().add(box);
        Label label = new Label(product.getDescription());
        label.setTextFill(Color.web("#FEFEFE", 1.0));
        getChildren().add(label);
    }

    public void setSelectProductListener(SelectProductListener listener) {
        this.listener = listener;
    }
}