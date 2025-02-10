package fr.numres.edusign.services;

import fr.numres.edusign.dtos.UserDto;
import fr.numres.edusign.entities.User;

import java.util.List;

public interface IUserService {
    public UserDto getUser(Long id);
    public List<UserDto> getUsers();
    public UserDto createUser(User user);
    public UserDto createAndFlushUser(User user);
    public void deleteUser(Long id);
}
