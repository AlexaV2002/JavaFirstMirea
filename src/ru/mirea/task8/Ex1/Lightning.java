package ru.mirea.task8.Ex1;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Lightning extends Application{
    private final Image IMAGE = new Image(getClass().getResourceAsStream("lightning.png"));
    private static final int COLUMNS = 3;
    private static final int COUNT = 3;
    private static final int OFFSET_X = 0;
    private static final int OFFSET_Y = 0;
    private static final int WIDTH = 206;
    private static final int HEIGHT = 348;

    @Override
    public void start(Stage primaryStage) {
        final ImageView imageView = new ImageView(IMAGE);
        imageView.setViewport(new Rectangle2D(OFFSET_X,OFFSET_Y, WIDTH, HEIGHT));
        final Animation animation = new SpriteAnimation(
                imageView,
                Duration.millis(500),
                COUNT, COLUMNS,
                OFFSET_X, OFFSET_Y,
                WIDTH, HEIGHT);
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
        primaryStage.setScene(new Scene(new Group(imageView), 206, 348));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

    private class SpriteAnimation extends Transition{
        private final ImageView imageView;
        private final int count;
        private final int columns;
        private final int offsetX;
        private final int offsetY;
        private final int width;
        private final int height;

        public SpriteAnimation(
                ImageView imageView,
                Duration duration,
                int count, int columns,
                int offsetX, int offsetY,
                int width, int height)
        {
            this.imageView = imageView;
            this.count = count;
            this.columns = columns;
            this.offsetX = offsetX;
            this.offsetY = offsetY;
            this.width = width;
            this.height = height;
            setCycleDuration(duration);
        }

        protected void interpolate(double k){
            final int index = Math.min((int)Math.floor(k * count), count - 1);
            final int x = (index % columns) * width + offsetX;
            final int y = (index / columns) * height + offsetY;
            imageView.setViewport(new Rectangle2D(x, y, width, height));
        }

    }
}
