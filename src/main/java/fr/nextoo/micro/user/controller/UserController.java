package fr.nextoo.micro.user.controller;

import fr.nextoo.micro.user.business.UserBusiness;
import fr.nextoo.micro.user.dto.UserDto;
import fr.nextoo.micro.user.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserBusiness userBusiness;

    @GetMapping
    public List<UserDto> getUsers(){
        return userBusiness.getAll();
    }
}
