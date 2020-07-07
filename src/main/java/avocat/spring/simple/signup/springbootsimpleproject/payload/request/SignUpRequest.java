package avocat.spring.simple.signup.springbootsimpleproject.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {

    private String email;
    private String password;

}
