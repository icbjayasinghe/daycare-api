package com.skyhigh.daycareapi.repository;

import com.skyhigh.daycareapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String email);

    Boolean existsUserByEmail(String email);
}
