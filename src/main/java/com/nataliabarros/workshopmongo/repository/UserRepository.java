package com.nataliabarros.workshopmongo.repository;

import com.nataliabarros.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends MongoRepository<User,String> {
    //<User,String> = <classe principal do projeto(User), String é pq  identificação da classe principal(id) é do tipo String
}
