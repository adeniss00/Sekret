package com.sekret.api.repository;

import com.sekret.api.model.UserGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends MongoRepository<UserGroup,String> {
}
