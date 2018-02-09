package view;

import controller.NotesController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotesView extends Application
{
    private NotesController controller;

    public NotesView()
    {
        controller = new NotesController();
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        VBox box = new VBox();
        Button button = new Button("Click me");
        box.getChildren().add(button);

        button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                controller.addNewNote("Hello world!");
            }
        });

        stage.setScene(new Scene(box, 500, 500));
    }
}
