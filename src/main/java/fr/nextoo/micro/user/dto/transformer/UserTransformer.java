package fr.nextoo.micro.user.dto.transformer;

import fr.nextoo.micro.user.dto.UserDto;
import fr.nextoo.micro.user.persistence.entity.UserEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserTransformer {

    public static Collection<UserDto> entityToDto(Collection<UserEntity> userEntityCollection) {

        if (userEntityCollection == null)
            return null;

        List<UserDto> userDtoList = new ArrayList<>();
        for (UserEntity userEntity : userEntityCollection) {
           userDtoList.add(entityToDto(userEntity));
        }

        return userDtoList;
    }


    public static UserDto entityToDto(UserEntity userEntity) {

        if (userEntity == null)
            return null;

        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setUsername(userEntity.getUsername());
        userDto.setPassword(userEntity.getPassword());

        return userDto;
    }
}

