package com.eror.controller;


import com.eror.config.StageManager;
import com.eror.service.UserService;
import com.eror.view.FxmlView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


@Controller
public class LoginController implements Initializable {

	@FXML
	private Button btnLogin;

	@FXML
	private PasswordField password;

	@FXML
	private TextField username;

	@FXML
	private Label lblLogin;

	@Autowired
	private UserService userService;

	@Lazy
	@Autowired
	private StageManager stageManager;

	@FXML
	private void login(ActionEvent event) throws IOException {
//    	if(userService.authenticate(getUsername(), getPassword())){
		if (userService.authenticate("admin@gmail.com", "admin")) {
			stageManager.setUser(userService.findByEmail("admin@gmail.com"));
			stageManager.switchScene(FxmlView.USER);

		} else {
			lblLogin.setText("Login Failed.");
		}
	}

	public String getPassword() {
		return password.getText();
	}

	public String getUsername() {
		return username.getText();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
