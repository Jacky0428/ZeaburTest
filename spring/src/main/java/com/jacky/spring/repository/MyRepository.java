package com.jacky.spring.repository;

import com.jacky.spring.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends MongoRepository<User, Integer> {
}
