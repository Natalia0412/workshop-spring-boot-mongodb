package com.nataliabarros.workshopmongo.config;

import com.nataliabarros.workshopmongo.domain.User;
import com.nataliabarros.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
//Operação de instanciacao da base de dados
@Configuration
public class Instantiation implements CommandLineRunner{
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String ... arg0) throws Exception{
        repository.deleteAll();
        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        repository.saveAll(Arrays.asList(maria, alex, bob));
    }


}
