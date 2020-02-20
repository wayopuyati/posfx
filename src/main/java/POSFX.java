import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.border.BevelBorder;

import org.kordamp.bootstrapfx.scene.layout.Panel;


public class POSFX extends Application implements ViewChangeListener {

    final String title = "POSFX Application";
    
    @Override
    public void start(final Stage stage) throws Exception {
        Panel panel = new Panel(title);
        panel.getStyleClass().add("panel-primary");

        BorderPane content = new BorderPane();
        content.setPadding(new Insets(20));

        content.setCenter(new SaleView());
        ButtonPane buttonPane = new ButtonPane();
        content.setBottom(buttonPane);
        buttonPane.setViewChangeListener(this);

        panel.setBody(content);
        Scene scene = new Scene(panel, 640, 480);
        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");

        stage.setTitle(title);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public void setView(String view) {
        var alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("View changed to "+view);
        alert.showAndWait();
    }

}