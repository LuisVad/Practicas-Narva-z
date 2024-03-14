package mx.edu.utez.sda.springjwt8c.repository;

import mx.edu.utez.sda.springjwt8c.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<Long, UserInfo> {

    public Optional<UserInfo> findByUsername(String username);

}
