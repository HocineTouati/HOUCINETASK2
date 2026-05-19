package pl.edu.vistula.firstrestapi.shared.exception;

import pl.edu.vistula.firstrestapi.product.exception.ProductNotFoundException;
import pl.edu.vistula.firstrestapi.shared.api.response.ErrorMessageResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleProductNotFoundException(
            ProductNotFoundException exception
    ) {

        ErrorMessageResponse response =
                new ErrorMessageResponse(
                        exception.getMessage()
                );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}