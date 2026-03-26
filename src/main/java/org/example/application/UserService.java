package org.example.application;

import org.example.domain.entity.UserEntity;
import org.example.domain.interfaces.IUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<UserEntity> getUserByIdentification(String identification) {
        try {
            UserEntity user = userRepository.findByIdentification(identification);
            if (user == null) {
                throw new UserNotFoundException("User not found with identification: " + identification);
            }
            return ResponseEntity.ok(user);
        } catch (UserNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("An unexpected error occurred while retrieving user information.", e);
        }
    }
}
