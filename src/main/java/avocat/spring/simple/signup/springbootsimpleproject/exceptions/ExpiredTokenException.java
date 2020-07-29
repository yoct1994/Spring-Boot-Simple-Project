package avocat.spring.simple.signup.springbootsimpleproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.GONE)
public class ExpiredTokenException extends RuntimeException {
    public ExpiredTokenException() {
        super("Expired Token");
    }
}
