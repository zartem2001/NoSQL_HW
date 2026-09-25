package ru.netology.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);

    List<User> findByAgeGreaterThan(int age);

    List<User> findByEmailContaining(String domain);
}
