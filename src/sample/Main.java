package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.geometry.Orientation;
import javafx.stage.Stage;

public class Main extends Application {

    private void mistake(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("Existing value");
        alert.setTitle("Error");
        alert.setContentText("You can't add existing values");
        alert.showAndWait();
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane root1 = new FlowPane();
        root1.setMinHeight(100.0);
        root1.setHgap(10.0);
        root1.setVgap(10.0);
        root1.setAlignment(Pos.CENTER);
        FlowPane root2 = new FlowPane();
        root2.setMinHeight(100.0);
        root2.setHgap(10.0);
        root2.setVgap(10.0);
        root2.setAlignment(Pos.CENTER);
        FlowPane root3 = new FlowPane();
        root3.setMinHeight(100.0);
        root3.setHgap(10.0);
        root3.setVgap(10.0);
        root3.setAlignment(Pos.CENTER);
        FlowPane root4 = new FlowPane();
        root4.setMinHeight(100.0);
        root4.setHgap(10.0);
        root4.setVgap(10.0);
        root4.setAlignment(Pos.CENTER);
        FlowPane root5 = new FlowPane();
        root5.setMinHeight(100.0);
        root5.setHgap(10.0);
        root5.setVgap(10.0);
        root5.setAlignment(Pos.CENTER);
        FlowPane main_root = new FlowPane();
        main_root.setOrientation(Orientation.VERTICAL);
        main_root.setVgap(30.0);
        main_root.getChildren().addAll(root1, root2, root3, root4, root5);

        Button btn1 = new Button("push");
        Label lab11 = new Label("edit:");
        Label lab12 = new Label("1)");
        TextField tf1 = new TextField ();
        HBox hb1 = new HBox();
        hb1.getChildren().addAll(lab11, tf1);
        ComboBox cb1 = new ComboBox();
        btn1.setOnAction((ActionEvent e) -> {
            if (
                    (tf1.getText() != null && !tf1.getText().isEmpty())
            ) {
                boolean equal;
                equal = true;
                for (int cb_count=0; cb_count<cb1.getItems().size(); cb_count++){
                    if (cb1.getItems().get(cb_count).equals(tf1.getText())){
                        equal = false;
                    }
                }
                if (equal){
                    cb1.getItems().addAll(tf1.getText());
                    tf1.clear();
                } else{
                    mistake();
                    tf1.clear();
                }
            }
        });
        root1.getChildren().addAll(lab12, btn1, hb1, cb1);

        Label lab21 = new Label("edit:");
        Label lab22 = new Label("2)");
        TextField tf2 = new TextField ();
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(lab21, tf2);
        Button btn21 = new Button("push");
        Button btn22 = new Button("push");
        btn21.setOnAction((ActionEvent e) -> {
            if (
                    (tf2.getText() != null && !tf2.getText().isEmpty())
            ) {
                    btn22.setText(tf2.getText());
            }
        });
        btn22.setOnAction((ActionEvent e) -> {
            if (
                    ((btn21.getText() != null && !btn21.getText().isEmpty()) && (btn22.getText() != null && !btn22.getText().isEmpty()))
            ) {
                String temp_txt;
                temp_txt = btn22.getText();
                btn22.setText(btn21.getText());
                btn21.setText(temp_txt);
            }
        });
        root2.getChildren().addAll(lab22, btn21, btn22, hb2);

        Label lab31 = new Label("Name:");
        Label lab32 = new Label("3)");
        TextField tf3 = new TextField ();
        HBox hb3 = new HBox();
        hb3.getChildren().addAll(lab31, tf3);
        ToggleGroup rad_but_tg = new ToggleGroup();
        RadioButton rad_btn31 = new RadioButton("1");
        rad_btn31.setUserData('1');
        RadioButton rad_btn32 = new RadioButton("2");
        rad_btn32.setUserData('2');
        RadioButton rad_btn33 = new RadioButton("3");
        rad_btn33.setUserData('3');
        rad_but_tg.getToggles().addAll(rad_btn31, rad_btn32, rad_btn33);
        Button btn3 = new Button("push");
        btn3.setOnAction((ActionEvent e) -> {
            boolean check = false;
            for (int rad_btn_count=0; rad_btn_count<rad_but_tg.getToggles().size(); rad_btn_count++){
                if (tf3.getText().equals(rad_but_tg.getToggles().get(rad_btn_count).getUserData().toString())){
                    rad_but_tg.getToggles().get(rad_btn_count).setSelected(true);
                    tf3.clear();
                    check = true;
                    break;
                }
            }
            if (!check){
                mistake();
                tf3.clear();
            }
        });
        root3.getChildren().addAll(lab32, btn3, rad_btn31, rad_btn32, rad_btn33, hb3);

        Label lab41 = new Label("edit:");
        Label lab42 = new Label("4)");
        TextField tf4 = new TextField ();
        HBox hb4 = new HBox();
        hb4.getChildren().addAll(lab41, tf4);
        CheckBox ch_box41 = new CheckBox("1");
        CheckBox ch_box42 = new CheckBox("2");
        CheckBox ch_box43 = new CheckBox("3");
        Button btn4 = new Button("push");
        btn4.setOnAction((ActionEvent e) -> {
            if (
                    (tf4.getText() != null && !tf4.getText().isEmpty())
            ) {
                for (String word : tf4.getText().split(" ")) {
                    boolean equal = false;
                    if (word.equals(ch_box41.getText())){
                        ch_box41.fire();
                        equal = true;
                        tf4.clear();
                    }
                    if (word.equals(ch_box42.getText())){
                        ch_box42.fire();
                        equal = true;
                        tf4.clear();
                    }
                    if (word.equals(ch_box43.getText())){
                        ch_box43.fire();
                        equal = true;
                        tf4.clear();
                    }
                    if (!equal){
                        mistake();
                        tf4.clear();
                    }
                }
            }
        });
        root4.getChildren().addAll(lab42, btn4, ch_box41, ch_box42, ch_box43, hb4);

        Button btn51 = new Button("push");
        Button btn52 = new Button("push");
        Button btn53 = new Button("push");
        Label lab51 = new Label("edit:");
        Label lab52 = new Label("5)");
        TextField tf5 = new TextField ();
        HBox hb5 = new HBox();
        hb5.getChildren().addAll(lab51, tf5);
        TableView<Table> tabl5 = new TableView<Table>();
        tabl5.setEditable(true);
        tabl5.setMaxSize(300.0, 150.0);
        TableColumn<Table, String> tabl5col1 = new TableColumn<Table, String>("First column");
        tabl5col1.setMinWidth(tabl5.getMaxWidth()/2);
        tabl5col1.setCellValueFactory(new PropertyValueFactory<>("firstCol"));
        TableColumn<Table, String> tabl5col2 = new TableColumn<Table, String>("Second column");
        tabl5col2.setMinWidth(tabl5.getMaxWidth()/2);
        tabl5col2.setCellValueFactory(new PropertyValueFactory<>("secCol"));
        tabl5.getColumns().addAll(tabl5col1, tabl5col2);
        btn51.setOnAction((ActionEvent e) -> {
            if (
                    (tf5.getText() != null && !tf5.getText().isEmpty())
            ) {
                Table node = new Table(tf5.getText());
                tabl5.getItems().add(node);
                tf5.clear();
            }
        });
        btn52.setOnAction((ActionEvent e) -> {
            if (tabl5.getSelectionModel().getSelectedItem() != null){
                tabl5.getSelectionModel().getSelectedItem().rightSwap();
                tabl5.refresh();
            }
        });
        btn53.setOnAction((ActionEvent e) -> {
            if (tabl5.getSelectionModel().getSelectedItem() != null){
                tabl5.getSelectionModel().getSelectedItem().leftSwap();
                tabl5.refresh();
            }
        });

        root5.getChildren().addAll(lab52, btn51, btn52, btn53, hb5, tabl5);

        Scene scene = new Scene(main_root, 450, 800);

        primaryStage.setTitle("Ppvis_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}