package pl.com.engineering.span.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.com.engineering.span.service.FileService;
import pl.com.engineering.span.service.impl.FileServiceImpl;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Label sampleLabel;

    @FXML
    private Label warningLabel;

    @FXML
    private Button sampleButton;

    @FXML
    private TextField sampleField;

    private FileService fileService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sampleButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                if (sampleField.getText().length() < 3) {
                    warningLabel.setVisible(true);
                } else {
                    fileService = new FileServiceImpl();
                    fileService.generate(sampleField.getText());

                    warningLabel.setVisible(false);
                }
            }
        });
    }
}
