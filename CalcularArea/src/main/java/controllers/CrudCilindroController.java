package controllers;

import javafx.event.ActionEvent;

public class CrudCilindroController {
    private SceneController sceneController = new SceneController();

    public void cambiarAlPanelPrincipal(ActionEvent event) {
        sceneController.cambiarPanelPrincipal(event);
    }

}
