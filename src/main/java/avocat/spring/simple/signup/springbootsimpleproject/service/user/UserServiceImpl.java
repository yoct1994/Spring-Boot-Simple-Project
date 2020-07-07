package avocat.spring.simple.signup.springbootsimpleproject.service.user;

import avocat.spring.simple.signup.springbootsimpleproject.entities.user.User;
import avocat.spring.simple.signup.springbootsimpleproject.entities.user.repository.UserRepository;
import avocat.spring.simple.signup.springbootsimpleproject.payload.request.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service // 이 클래스를 서비스 클래스로 빈에 등록한다
@RequiredArgsConstructor // 빈에 등록된 repository를 주입받기 위해 사용되었다
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository; // 주입받기 위해서는 final로 해줘야 한다

    @Override
    public void signUp(SignUpRequest signUpRequest) {
        userRepository.save(
                User.builder()
                .email(signUpRequest.getEmail())
                .password(signUpRequest.getPassword())
                .build()
        );
        // 대충 User객체를 만들어서 디비에 넣는다는 내용
    }
}
