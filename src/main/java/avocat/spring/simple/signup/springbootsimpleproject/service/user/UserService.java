package avocat.spring.simple.signup.springbootsimpleproject.service.user;

import avocat.spring.simple.signup.springbootsimpleproject.payload.request.SignUpRequest;

public interface UserService {
    void signUp(SignUpRequest signUpRequest);
}
