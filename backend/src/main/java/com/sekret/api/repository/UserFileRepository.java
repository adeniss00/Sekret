package com.sekret.api.repository;

import com.sekret.api.model.UserFile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserFileRepository extends MongoRepository<UserFile,String> {
}
