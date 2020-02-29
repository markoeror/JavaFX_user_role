package com.eror.controller;

import com.eror.model.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Controller;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class CompanyController implements Initializable {

    private User user;

    @FXML
    private Label usersName;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setUsersName();
    }

    private void setUsersName() {
        usersName.setText(getUser().getFirstName());
    }
}
