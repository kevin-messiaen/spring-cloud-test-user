package fr.nextoo.micro.user.entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class UserEntity {

    @Id
    private long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

}
