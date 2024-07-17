package rusio.pavlovsky.order.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import rusio.pavlovsky.order.controller.response.ErrorDto;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorDto> handleAllExceptions(Exception e) {
        logger.error(e);
        return createResponse(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
    }

    @ExceptionHandler(NoSuchElementException.class)
    public final ResponseEntity<ErrorDto> handleIllegalArgumentException(NoSuchElementException e) {
        logger.error(e);
        return createResponse(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public final ResponseEntity<ErrorDto> handleIllegalArgumentException(IllegalArgumentException e) {
        logger.error(e);
        return createResponse(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    private ResponseEntity<ErrorDto> createResponse (HttpStatus status, String message) {
        return new ResponseEntity<>(ErrorDto.builder()
                .code(status.value())
                .message(message).build(), status);
    }

}
