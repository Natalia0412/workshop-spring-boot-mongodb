package com.nataliabarros.workshopmongo.resources;

import com.nataliabarros.workshopmongo.domain.User;
import com.nataliabarros.workshopmongo.dto.UserDTO;
import com.nataliabarros.workshopmongo.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")//caminho do endpoint
public class UserResource {
    @Autowired
    private UserService service;
    @RequestMapping(method = RequestMethod.GET)//ou  @GetMapping
    public ResponseEntity<List<UserDTO>>  findAll(){
        List<User>list =service.findAll();
        List<UserDTO> userDTOList=list.stream().map(x->new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(userDTOList);
        //ResponseEntity cria os cabeçalhos
        //return ResponseEntity.ok().body(list); = retorna a resposta da requisição
        /*
        * List<User>list =service.findAll(); = está  chamando o metedo findAll em UserService
        * esse metodo ele chama o repository.findAll();
        * que vai no bd e busca todos os elementos de User
        * assim retornando o mesmo para list
        * */
    }
}
