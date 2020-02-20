import java.util.List;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class SaleView extends BorderPane {

   static List<Product> products = List.of(
      new Product("Shirt", 250.00, 10),
      new Product("Jeans", 1550.00, 15),
      new Product("Mug", 150.00, 20),
      new Product("Jacket", 5499.00, 5),
      new Product("Computer", 26490.00, 8)
    );

    GridPane productsView = new GridPane();
    GridPane menuView = new GridPane();

    public SaleView() {
        createView();
    }

    private void createView() {
        // productsView.setPadding(new Insets(15.0));
        int i = 0;
        for (Product product : products) {
            productsView.add(new ProductView(product), i%3, i/3);
            i++;
        }
        ScrollPane viewPane = new ScrollPane(productsView);
        viewPane.setHbarPolicy(ScrollBarPolicy.NEVER);
        setCenter(viewPane);

        TableView<Product> table = new TableView<>();
        table.setItems(FXCollections.observableArrayList(products));
        TableColumn<Product, String> descriptionCol = new TableColumn<>("สินค้า");
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description")); //products.get(0).descriptionProperty().getName()));
        TableColumn<Product, Double> priceCol = new TableColumn<>("ราคา");
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price")); //products.get(0).priceProperty().getName()));
        TableColumn<Product, Integer> unitCol = new TableColumn<>("หน่วย");
        unitCol.setCellValueFactory(new PropertyValueFactory<>("unit")); // products.get(0).unitProperty().getName()));
        table.getColumns().setAll(descriptionCol, priceCol, unitCol);
        ScrollPane menuPane = new ScrollPane(table);
        menuPane.setHbarPolicy(ScrollBarPolicy.NEVER);
        setRight(menuPane);
    }
}