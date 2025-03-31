package fr.numres.edusign.services;

import fr.numres.edusign.dtos.UserDto;

import java.util.List;

public interface IUserService {
    public UserDto getUser(Long id);
    public List<UserDto> getUsers();
    public UserDto createUser(UserDto user);
    public UserDto createAndFlushUser(UserDto user);
    public void deleteUser(Long id);
}
