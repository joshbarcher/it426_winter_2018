package scenes;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StoryBook extends Application
{
    public static final int PADDING = 10;
    public static final int SPACING = 10;
    public static final int WIN_WIDTH = 500;
    public static final int WIN_HEIGHT = 500;
    //save our stage
    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception
    {
        this.stage = stage;

        //prepare the window
        stage.setTitle("Working with scenes!");
        stage.setScene(getWaitingScene());
        stage.show();

        //we are going to wait on the current screen using
        //animation (key frame)
        KeyFrame frame = new KeyFrame(Duration.millis(3000), new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                stage.setScene(getStorySceneOne());
            }
        });

        Timeline waitAnimation = new Timeline(frame);
        waitAnimation.play();
    }

    private Scene getWaitingScene()
    {
        //create a layout
        VBox waitingLayout = new VBox();

        //center child elements of the layout
        waitingLayout.setAlignment(Pos.CENTER);

        //space between child elements and edge of layout
        waitingLayout.setPadding(new Insets(PADDING));

        //space between child elements
        waitingLayout.setSpacing(SPACING);

        //add a few elements
        ProgressIndicator progressIndicator = new ProgressIndicator();
        Text waitingMessage = new Text("Please wait...");
        waitingMessage.setFont(Font.font("Courier New", FontWeight.BOLD, 30));

        waitingLayout.getChildren().add(progressIndicator);
        waitingLayout.getChildren().add(waitingMessage);

        //generate scene based on layout
        return new Scene(waitingLayout, WIN_WIDTH, WIN_HEIGHT);
    }

    private Scene getStorySceneOne()
    {
        //create a layout with spacing
        VBox sceneOneLayout = new VBox();
        sceneOneLayout.setAlignment(Pos.CENTER);
        sceneOneLayout.setPadding(new Insets(PADDING));
        sceneOneLayout.setSpacing(SPACING);

        //add controls
        Text message = new Text("Smaug was picking flowers one day...");
        message.setFont(Font.font("Fantasy", FontWeight.MEDIUM, 20));

        Button button = new Button("Continue");
        button.setMaxHeight(50);
        button.setMaxWidth(300);
        button.setAlignment(Pos.CENTER_RIGHT);

        button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {

            }
        });

        sceneOneLayout.getChildren().add(message);
        sceneOneLayout.getChildren().add(button);

        //display the scene
        return new Scene(sceneOneLayout, WIN_WIDTH, WIN_HEIGHT);
    }
}




