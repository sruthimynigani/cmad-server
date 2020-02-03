package com.cisco.cmad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cisco.cmad.model.Message;

@Repository
public interface MessageRepository extends MongoRepository<Message,String> {

}
