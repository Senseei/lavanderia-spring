package com.projects.lavanderia.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projects.lavanderia.entities.Person;
import com.projects.lavanderia.projections.PersonProjection;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(nativeQuery = true, value = """
        SELECT *
			FROM tb_users
			WHERE tb_users.username = :username AND tb_users.password = :password
            """)
    Optional<PersonProjection> findByUsernameAndPassword(String username, String password);
}