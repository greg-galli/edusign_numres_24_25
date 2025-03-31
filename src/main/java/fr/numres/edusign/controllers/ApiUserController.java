package fr.numres.edusign.controllers;

import fr.numres.edusign.dtos.UserDto;
import fr.numres.edusign.services.IUserService;
import fr.numres.edusign.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiUserController {

    IUserService userService;

    @Autowired
    public ApiUserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public UserDto getUser(@PathVariable Long id)
    {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public UserDto createUser(UserDto user)
    {
        return userService.createAndFlushUser(user);
    }

    /**
     * Liste des différents points d'entrée à gérer pour la ressource en question
     * - GET /api/user/{id} : retourne l'utilisateur avec l'id spécifié
     * - POST /api/users : crée un nouvel utilisateur
     * - GET /api/users : retourne la liste de tous les utilisateurs
     * - DELETE /api/user/{id} : supprime l'utilisateur avec l'id spécifié
     * - PUT /api/user/{id} : met à jour l'utilisateur avec l'id spécifié
     * - PATCH /api/user/{id} : met à jour partiellement l'utilisateur avec l'id spécifié
     *
     * Ne pas oublier de systématiquement retourner des code HTTP qui sont explicites et surtout accompagner d'un message si le retour peut être ambigu.
     *
     * TODO: Regarder du côte d'un serializer pour HAL
     *
     * - Reproduire l'équivalent sur une autre ressource (à définir)
     * - Documenter votre API avec Postman ou Bruno
     *     - Documenter tous les endpoints
     *     - Documenter les paramètres
     *     - Documenter les réponses
     *     - Documenter les codes HTTP
     *
     */

}
