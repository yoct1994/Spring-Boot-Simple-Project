package avocat.spring.simple.signup.springbootsimpleproject.service.auth;

import avocat.spring.simple.signup.springbootsimpleproject.payload.request.SignInRequest;
import avocat.spring.simple.signup.springbootsimpleproject.payload.response.TokenResponse;

public interface AuthService {
    TokenResponse signIn(SignInRequest signInRequest);
}
