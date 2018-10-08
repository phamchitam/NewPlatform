package tkt.cmu.vn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tkt.cmu.vn.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long > {
    UserEntity findByUserName(String userName);


}
