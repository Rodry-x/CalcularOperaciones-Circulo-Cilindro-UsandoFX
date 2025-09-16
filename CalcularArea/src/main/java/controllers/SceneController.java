package controllers;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import utilities.Paths;
import javafx.event.ActionEvent;
import java.io.IOException;

public class SceneController {

    private Stage getStageFromEvent(ActionEvent event) {
        Object source = event.getSource();
        if (source instanceof Node) {
            return (Stage) ((Node) source).getScene().getWindow();
        } else {
            // Si viene de un MenuItem, busca la ventana activa
            return (Stage) Window.getWindows().stream()
                    .filter(Window::isFocused)
                    .findFirst()
                    .orElse(null);
        }
    }

    private void cambiarEscena(ActionEvent event, String fxmlPath) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = getStageFromEvent(event);
            if (stage != null) {
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cambiarPanelCirculo(ActionEvent event) {
        cambiarEscena(event, Paths.PANEL_CIRCULO_FXML);
    }

    public void cambiarPanelCilindro(ActionEvent event) {
        cambiarEscena(event, Paths.PANEL_CILINDRO_FXML);
    }

    public void cambiarPanelPrincipal(ActionEvent event) {
        cambiarEscena(event, Paths.PANEL_PRINCIPAL_FXML);
    }
}