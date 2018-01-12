package controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;

public class PracticeWithControls extends Application
{
    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception
    {
        this.stage = stage;

        stage.setTitle("Practicing with controls and layouts");
        stage.show();

        //useButtons();
        useImages();
    }

    public void useButtons()
    {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button previous = new Button("Previous");
        Button next = new Button("Next");

        hBox.getChildren().addAll(previous, next, new Button("Cancel"));

        previous.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                previous.setText("You clicked me!");
            }
        });

        stage.setScene(new Scene(hBox, 500, 500));
    }

    public void useImages() throws MalformedURLException
    {
        Image image = new Image(new File("images/pattern.jpg").toURI().toURL().toString());
        ImageView view = new ImageView(image);

        StackPane imageControlStackPane = new StackPane();
        imageControlStackPane.getChildren().add(view);

        stage.setScene(new Scene(imageControlStackPane, 500, 500));
    }

    public void useTextControls()
    {

    }

    public void useCheckboxesAndRadioButtons()
    {

    }

    public void useLists()
    {

    }

    public void useDialogs()
    {

    }
}

