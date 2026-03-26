package org.example.domain;

public interface IUserRepository {
    void saveUser(int id, String name, String identification);
    String getUserNameById(String identrification);
}
