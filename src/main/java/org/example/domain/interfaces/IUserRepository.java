package org.example.domain.interfaces;

import org.example.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
    void saveUser(int id, String name, String identification);
    UserEntity getUser(String identification);
}
