package fr.nextoo.micro.user.persistence.repository;

import fr.nextoo.micro.user.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Collection;

@Repository
@Transactional
public interface UserRepository  extends CrudRepository<UserEntity,Long> {

    Collection<UserEntity> findAll();
}
