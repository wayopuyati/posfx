import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class SaleView extends BorderPane {

    GridPane productsView = new GridPane();

    public SaleView() {
        createView();
    }

    private void createView() {
        productsView.setHgap(8.0);
        productsView.setVgap(5.0);
        productsView.setPadding(new Insets(15.0));
        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                productsView.add(new ImageView("https://picsum.photos/190"), c, r);
            }
        }
        ScrollPane viewPane = new ScrollPane(productsView);
        setCenter(viewPane);
    }
}