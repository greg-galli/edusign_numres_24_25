package fr.numres.edusign.services;

import fr.numres.edusign.entities.User;

import java.util.List;

public interface IUserService {
    public User getUser(Long id);
    public List<User> getUsers();
    public User createUser(User user);
    public User createAndFlushUser(User user);
    public void deleteUser(Long id);
}
