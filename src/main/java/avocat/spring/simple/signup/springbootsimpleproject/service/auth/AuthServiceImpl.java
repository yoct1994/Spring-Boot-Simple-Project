package avocat.spring.simple.signup.springbootsimpleproject.service.auth;

import avocat.spring.simple.signup.springbootsimpleproject.entities.user.User;
import avocat.spring.simple.signup.springbootsimpleproject.entities.user.repository.UserRepository;
import avocat.spring.simple.signup.springbootsimpleproject.exceptions.UserNotFoundException;
import avocat.spring.simple.signup.springbootsimpleproject.payload.request.SignInRequest;
import avocat.spring.simple.signup.springbootsimpleproject.payload.response.TokenResponse;
import avocat.spring.simple.signup.springbootsimpleproject.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    private final JwtUtil jwtUtil;

    @Override
    public TokenResponse signIn(SignInRequest signInRequest) {
        String email = signInRequest.getEmail();
        String password = signInRequest.getPassword();

        User user = userRepository.findByEmail(email)
                .filter(u -> u.getPassword().equals(password))
                .orElseThrow(UserNotFoundException::new);

        return tokenResponse(user.getId());
    }

    private TokenResponse tokenResponse(Integer id) {
        return new TokenResponse(jwtUtil.getAccessToken(id),
                jwtUtil.getRefreshToken(id));
    }

}
