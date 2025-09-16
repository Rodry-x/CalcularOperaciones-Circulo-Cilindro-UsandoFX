package controllers;

public class CrudPanelPrincipalController {
    private final SceneController sceneController = new SceneController();

    public void cambiarPanelCirculo(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelCirculo(event);
    }

    public void cambiarPanelCilindro(javafx.event.ActionEvent event) {
        sceneController.cambiarPanelCilindro(event);
    }

}
