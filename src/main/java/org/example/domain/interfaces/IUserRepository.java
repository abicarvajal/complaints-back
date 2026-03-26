package org.example.domain.interfaces;

import org.example.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByIdentification(String identification);
}
