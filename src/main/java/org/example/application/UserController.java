package org.example.application;

import org.example.domain.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
        private final UserService userService;

        public UserController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping("/user")
        public ResponseEntity<UserEntity> getUserByIdentification(@RequestParam String identification) {
            return userService.getUserByIdentification(identification);
        }


}
