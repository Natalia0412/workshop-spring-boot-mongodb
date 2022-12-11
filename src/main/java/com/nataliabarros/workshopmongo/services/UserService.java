package com.nataliabarros.workshopmongo.services;

import com.nataliabarros.workshopmongo.domain.User;
import com.nataliabarros.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired// injeção de dependencia, instancia UserRepository
    private UserRepository repository;
    public List<User> findAll(){
        return repository.findAll();// vai no bd(User)e restorna tudo que tem lá

    }
}
