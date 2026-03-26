package org.example.infraestructure;

import org.example.domain.IUserRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Repository
public class UserRepository implements IUserRepository {
    private static final String URL = "jdbc:h2:mem:testdb";
    private static final String USER = "sa";
    private static final String PASSWORD = "";


    @Override
    public void saveUser(int id, String name, String identification) {

    }

    @Override
    public String getUserNameById(String identrification) {
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT name FROM users WHERE identification = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, identrification);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("name");
            } else {
                throw new RuntimeException("User not found");
            }
        } catch (Exception e) {
            throw new RuntimeException("Database error: " + e.getMessage());
        }
    }
}
