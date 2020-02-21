import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
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
    }

    public void createView() {
        setPadding(new Insets(14));
        ImageView imageView = new ImageView("https://picsum.photos/102");
        imageView.setEffect(new DropShadow());
        imageView.onMouseClickedProperty().addListener( (e) -> {
            if (listener != null) {
                listener.selectProduct(this.product);
            }
        });
        getChildren().add(imageView);
        Rectangle box = new Rectangle(80,30);
        box.setFill(Color.web("#a0af22", 0.95));
        box.setArcWidth(10);
        box.setArcHeight(10);
        box.setTranslateY(50);
        getChildren().add(box);
        Label label = new Label(product.getDescription());
        label.setTextFill(Color.web("#000000", 1.0));
        label.setTranslateY(50);
        getChildren().add(label);
        ImageView ribbin = new ImageView(new Image("file:./assets/ribbin.png"));
        ribbin.scaleXProperty().set(0.6);
        ribbin.scaleYProperty().set(0.6);
        ribbin.setTranslateX(30);
        ribbin.setTranslateY(-40);
        getChildren().add(ribbin);
    }

    public void setSelectProductListener(SelectProductListener listener) {
        this.listener = listener;
    }
}