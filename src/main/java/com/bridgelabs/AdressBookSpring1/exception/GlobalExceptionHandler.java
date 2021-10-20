package com.bridgelabs.AdressBookSpring1.exception;

import com.bridgelabs.AdressBookSpring1.dto.ResponceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.xml.bind.ValidationException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = CustomeException.class)
    public ResponseEntity<ResponceDto> handleCustomException(CustomeException customException) {
        return new ResponseEntity<>(new ResponceDto(customException.getMessage(), null), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = ValidationException.class)
    public ResponseEntity<ResponceDto> handleValidationException(ValidationException validationException) {
        return new ResponseEntity<>(new ResponceDto(validationException.getMessage(), null), HttpStatus.NOT_FOUND);
    }
}