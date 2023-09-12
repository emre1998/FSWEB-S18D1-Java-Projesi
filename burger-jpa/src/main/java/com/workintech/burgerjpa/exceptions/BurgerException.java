package com.workintech.burgerjpa.exceptions;


import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BurgerException extends RuntimeException{
    private HttpStatus status;

    public BurgerException(String message,HttpStatus status) {
        super(message);
        this.status=status;
    }


}
