package avocat.spring.simple.signup.springbootsimpleproject.controllers;

import avocat.spring.simple.signup.springbootsimpleproject.payload.request.SignUpRequest;
import avocat.spring.simple.signup.springbootsimpleproject.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 이 클래스틑 URI를 매핑해 주는 클래스로 지정한다
@RequestMapping("/user") // /user 로 요청을 보내면 이 클래스를 사용하겠다
@RequiredArgsConstructor // 빈에 등록된 객체를 주입맏겠다 (이거는 나중에 따로 설명해드림)
public class UserController {

    private final UserService userService; // 빈에 주입된 서비스 클래스를 주입 받는다 (이 때 꼭 final를 붙일것)

    @PostMapping // [POST] /user 로 보내는 요청을 담당한다
    public void signUp(@RequestBody SignUpRequest signUpRequest) { // SignUpRequest 클래스 형태로 json을 받는다
        userService.signUp(signUpRequest); // signUpRequest 를 인자로 보낸다
    }

}
