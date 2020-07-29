package avocat.spring.simple.signup.springbootsimpleproject.entities.user.repository;

import avocat.spring.simple.signup.springbootsimpleproject.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // 이 클래스를 디비 연결을 도와줄 클래스로 빈에 등록 한다
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
