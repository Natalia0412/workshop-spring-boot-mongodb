package com.nataliabarros.workshopmongo.services;

import com.nataliabarros.workshopmongo.domain.User;
import com.nataliabarros.workshopmongo.repository.UserRepository;
import com.nataliabarros.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired// injeção de dependencia, instancia UserRepository
    private UserRepository repository;
    public List<User> findAll(){
        return repository.findAll();// vai no bd(User)e restorna tudo que tem lá
    }
    public User findById(String id){
        Optional<User> obj=repository.findById(id);
        return obj.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado"));
    }
}
