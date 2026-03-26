package org.example.application;

import org.example.domain.IUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Map<String,String>> getUserByIdentification(String identification) {
        try {
            String name = userRepository.getUserNameById(identification);
            if (name == null) {
                throw new UserNotFoundException("User not found with identification: " + identification);
            }
            Map<String, String> response = new HashMap<>();
            response.put("identification", identification);
            response.put("name", name);
            return ResponseEntity.ok(response);
        } catch (UserNotFoundException e) {
            throw e; // Let the GlobalExceptionHandler handle this exception
        } catch (Exception e) {
            throw new RuntimeException("An unexpected error occurred while retrieving user information.", e);
        }
    }
}
