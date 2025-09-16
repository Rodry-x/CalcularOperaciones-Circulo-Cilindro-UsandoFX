package controllers;

import javafx.event.ActionEvent;

public class CrudCirculoController {
    private SceneController sceneController = new SceneController();

    public void cambiarAlPanelPrincipal(ActionEvent event) {
        sceneController.cambiarPanelPrincipal(event);
    }

}
