package hoekcel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Scene scene;

    public static Scene getScene() {
        return scene;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/mainView.fxml"));
        scene = new Scene(root, 1300, 800);
        stage.setScene(scene);
        stage.setTitle("Høkcel");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
