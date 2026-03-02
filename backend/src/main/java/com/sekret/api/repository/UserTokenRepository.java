package com.sekret.api.repository;

import com.sekret.api.model.UserToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTokenRepository extends MongoRepository<UserToken,String> {
}
