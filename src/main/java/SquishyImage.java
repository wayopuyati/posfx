import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class SquishyImage extends ImageView {

    private Timeline bouncer = new Timeline();

    public SquishyImage(String url)  {
        super(url);
        bouncer.getKeyFrames().addAll(
            makeKeyFrame(0,   1.2, 1.0),
            makeKeyFrame(100, 1.0, 1.2),
            makeKeyFrame(300, 1.2, 1.0),
            makeKeyFrame(600, 1.0, 1.2)
        );
        bouncer.setCycleCount(1);
        setOnMouseEntered( (e) -> {
            bouncer.play();
        });
        setOnMouseExited( (e) -> {
            setScaleX(1.0);
        });
    }

    private KeyFrame makeKeyFrame(int d, double sx, double sy) {
        return new KeyFrame(
            new Duration(d),
            new KeyValue(scaleXProperty(), sx),
            new KeyValue(scaleYProperty(), sy)
        );
    }
}