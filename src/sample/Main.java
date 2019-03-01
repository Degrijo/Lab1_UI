package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("top");
        btn.setLayoutX(20.0);
        btn.setLayoutY(90.0);
        btn.setMinSize(50.0, 50);

        /*TextField textField = new TextField ();
        textField.setLayoutX(20.0);
        textField.setLayoutY(20.0);
        textField.setMinSize(100.0, 50);*/

        Label label1 = new Label("Name:");
        TextField textField1 = new TextField ();
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField1);
        hb.setSpacing(10);
        hb.setLayoutX(20.0);
        hb.setLayoutY(20.0);
        hb.setMinSize(100.0, 50);

        ComboBox comboBox = new ComboBox();
        comboBox.setLayoutX(90.0);
        comboBox.setLayoutY(90.0);

        Pane root = new Pane();
        root.getChildren().addAll(btn, comboBox, hb);
        //root.setTop(pane);

        Scene scene = new Scene(root, 700, 700);

        primaryStage.setTitle("Ppvis_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}