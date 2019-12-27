package fr.nextoo.micro.user.business;

import fr.nextoo.micro.user.dto.UserDto;
import fr.nextoo.micro.user.dto.transformer.UserTransformer;
import fr.nextoo.micro.user.persistence.entity.UserEntity;
import fr.nextoo.micro.user.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserBusiness {

    @Autowired
    UserRepository userRepository;

    public List<UserDto> getAll() {
        return new ArrayList<>(UserTransformer.entityToDto(userRepository.findAll()));
    }

}
