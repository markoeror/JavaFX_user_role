package com.eror.server2;


import com.eror.server2.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class UserController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("getUser")
    public ResponseEntity<User> getUser() {
        try {
            User user = new User();
            user.setFirstName("Marko");
            user.setPassword("Eror");
            logger.debug("User details retrieved.");
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error while retrieving User details");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
