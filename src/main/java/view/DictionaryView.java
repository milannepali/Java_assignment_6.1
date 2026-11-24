package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller = new DictionaryController();

    public void start(Stage stage) {

        TextField wordField = new TextField();
        wordField.setPromptText("Enter a word");

        Button searchButton = new Button("Search");

        Label result = new Label();
        result.setWrapText(true);

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(15));
        pane.setHgap(10);
        pane.setVgap(10);

        pane.getChildren().add(wordField);
        pane.getChildren().add(searchButton);
        pane.getChildren().add(result);

        searchButton.setOnAction(event -> {
            String word = wordField.getText();
            result.setText(controller.search(word));
        });

        Scene scene = new Scene(pane, 350, 150);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}