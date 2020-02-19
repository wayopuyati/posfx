import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
        content.setCenter(button);
        panel.setBody(content);

        Scene scene = new Scene(panel, 640, 480);
        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");

        stage.setTitle(title);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
}