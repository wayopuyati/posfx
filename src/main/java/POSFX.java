import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.border.BevelBorder;

import org.kordamp.bootstrapfx.scene.layout.Panel;


public class POSFX extends Application {
    final String title = "POSFX Application";

    @Override
    public void start(final Stage stage) throws Exception {
        Panel panel = new Panel(title);
        panel.getStyleClass().add("panel-primary");
        BorderPane content = new BorderPane();
        content.setPadding(new Insets(20));
        Button button = new Button("ปุ่มปิดโปรแกรม");
        button.getStyleClass().setAll("btn","btn-danger");
        button.setOnAction( (e) -> {
            stage.close();
        });
        GridPane productsView = new GridPane();
        productsView.setHgap(8.0);
        productsView.setVgap(5.0);
        productsView.setPadding(new Insets(15.0));
        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                productsView.add(new ImageView("https://picsum.photos/190"), c, r);
            }
        }
        ScrollPane viewPane = new ScrollPane(productsView);
        content.setCenter(viewPane);
        HBox hbox = new HBox(10);
        hbox.getStyleClass().setAll("panel", "panel-body");
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(new Button("Sale"));
        hbox.getChildren().add(new Button("Admin"));
        hbox.getChildren().add(button);
        content.setBottom(hbox);
        panel.setBody(content);

        Scene scene = new Scene(panel, 640, 480);
        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");

        stage.setTitle(title);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
}