package fr.numres.edusign.mappers;

import fr.numres.edusign.dtos.UserDto;
import fr.numres.edusign.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {
    public UserDto toDto(User user)
    {
        if (user==null)
            return null;
        return new UserDto(user.getId(), user.getName(),
                user.getEmail(), user.getMatricule(),
                user.getDateCreated(), user.getLastUpdated(),
                user.getResponsibilities(), user.getClassroom(),
                user.getSessions());
    }

    public User toEntity(UserDto userDto)
    {
        if (userDto.getId()==null)
        {
            return new User(null, userDto.getName(), "password",
                    userDto.getEmail(), userDto.getMatricule(),
                    userDto.getDateCreated(), userDto.getLastUpdated(),
                    userDto.getResponsibilities(), userDto.getClassroom(),
                    userDto.getSessions());
        }
        return new User(userDto.getId(), userDto.getName(), "password",
                userDto.getEmail(), userDto.getMatricule(),
                userDto.getDateCreated(), userDto.getLastUpdated(),
                userDto.getResponsibilities(), userDto.getClassroom(),
                userDto.getSessions());
    }

    public List<UserDto> toDtoList(List<User> users)
    {
        return users.stream().map(this::toDto).toList();
    }
}
