import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonPane extends HBox {

    ViewChangeListener listener;

    public ButtonPane() {
        super(10);
        createView();
    }

    private void createView() {
        getStyleClass().setAll("panel", "panel-body");
        setAlignment(Pos.CENTER);
        Button saleButton = new Button("Sale");
        getChildren().add(saleButton);
        Button adminButton = new Button("Admin");
        getChildren().add(adminButton);
        Button button = new Button("ปุ่มปิดโปรแกรม");
        button.getStyleClass().setAll("btn","btn-danger");
        button.setOnAction( (e) -> {
            // stage.close();
            System.exit(0);
        });
        getChildren().add(button);

        saleButton.setOnAction( (e) -> {
            if (this.listener != null) {
                this.listener.setView("Sale");
            }
        });
        adminButton.setOnAction( (e) -> {
            if (this.listener != null) {
                this.listener.setView("Admin");
            }
        });
    }

    public void setViewChangeListener(ViewChangeListener listener) {
        this.listener = listener;
    }

}