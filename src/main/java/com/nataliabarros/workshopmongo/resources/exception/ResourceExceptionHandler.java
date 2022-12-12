package com.nataliabarros.workshopmongo.resources.exception;

import com.nataliabarros.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice // diz pro spring que essa classe trata possiveis erros de retorno da requisição
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectNotFoundException.class)// diz o tipo de erro
    public ResponseEntity<StandardError> objectNotfound(ObjectNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
    //ObjectNotFoundException= tipo de exceção que vou tratar
    //request pega de acordo com a resquisição que gerou o erro, no caso é o get
}
