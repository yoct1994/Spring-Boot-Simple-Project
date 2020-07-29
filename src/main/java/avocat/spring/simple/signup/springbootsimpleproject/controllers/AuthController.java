package avocat.spring.simple.signup.springbootsimpleproject.controllers;

import avocat.spring.simple.signup.springbootsimpleproject.payload.request.SignInRequest;
import avocat.spring.simple.signup.springbootsimpleproject.payload.response.TokenResponse;
import avocat.spring.simple.signup.springbootsimpleproject.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping
    public TokenResponse signIn(SignInRequest signInRequest) {
        return authService.signIn(signInRequest);
    }

}
