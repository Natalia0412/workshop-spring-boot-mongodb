package com.nataliabarros.workshopmongo.resources;

import com.nataliabarros.workshopmongo.domain.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")//caminho do endpoint
public class UserResource {
    @RequestMapping(method = RequestMethod.GET)//ou  @GetMapping
    public ResponseEntity<List<User>>  findAll(){
        User maria=new User("1","Maria Silva","maria@mail.com");
        User jose=new User("1","Jose Done","jose@mail.com");
        List<User>list =new ArrayList<>();
        list.addAll(Arrays.asList(maria,jose));
        return ResponseEntity.ok().body(list);
        //ResponseEntity cria os cabeçalhos
        //return ResponseEntity.ok().body(list); = retorna a resposta da requisição
    }
}
