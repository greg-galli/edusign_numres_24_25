package fr.numres.edusign.services;

import fr.numres.edusign.dtos.UserDto;
import fr.numres.edusign.entities.User;
import fr.numres.edusign.mappers.UserMapper;
import fr.numres.edusign.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto getUser(Long id) {
        return userMapper.toDto(userRepository.findById(id).orElse(null));
    }

    @Override
    public List<UserDto> getUsers() {
        return userMapper.toDtoList(userRepository.findAll());
    }

    @Override
    public UserDto createUser(User user) {
        return userMapper.toDto(userRepository.save(user));
    }

    @Override
    public UserDto createAndFlushUser(User user) {
        return userMapper.toDto(userRepository.saveAndFlush(user));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
