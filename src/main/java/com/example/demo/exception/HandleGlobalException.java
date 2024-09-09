package com.example.demo.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//we are using the rest controller advice to handle all the exceptions occurred in any place.
@RestControllerAdvice
public class HandleGlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public void handleMethodArgumentValidException(MethodArgumentNotValidException exception){
        exception.getBindingResult().getFieldErrors().forEach(filedError->{
            System.err.println(filedError.getField()+"  :  " + filedError.getDefaultMessage());
        });

    }

}
