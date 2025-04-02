
# Projet Spring Boot - API REST "User"

## Objectif

L'objectif de ce projet est d'implémenter une API REST complète et parfaitement fonctionnelle pour l'entité `User`. Vous devez reprendre le code existant et développer les fonctionnalités suivantes en respectant les bonnes pratiques de développement et en garantissant une couverture de tests exhaustive.

## Tâches à réaliser

### Implémentation des endpoints REST

#### Ressource `user`

-   `GET /user/{id}` : Récupérer un utilisateur par son identifiant

-   `PUT /user/{id}` : Mettre à jour un utilisateur (remplacement complet)

-   `PATCH /user/{id}` : Mettre à jour partiellement un utilisateur

-   `DELETE /user/{id}` : Supprimer un utilisateur


#### Ressource `users`

-   `GET /users` : Récupérer la liste complète des utilisateurs

-   `POST /users` : Créer un nouvel utilisateur


### Gestion des cas particuliers

-   Vérification des entrées et validation des données

-   Gestion des erreurs avec des codes d'état HTTP pertinents et des messages explicites

-   Protection contre les opérations non valides (ex : suppression d'un utilisateur inexistant)


### Qualité du code

-   Code entièrement commenté pour expliquer les choix et le fonctionnement

-   Respect des principes SOLID et bonnes pratiques Spring Boot

-   Utilisation de DTOs et de Mappers pour éviter l'exposition directe des entités


### Tests rigoureux

-   Écriture de tests unitaires et d'intégration couvrant tous les cas possibles

-   Création d'une collection Postman ou Bruno contenant des requêtes de test pour chaque endpoint

-   Ajout de scripts de test pour vérifier les codes HTTP retournés et le contenu des réponses

-   Organisation des tests dans une séquence logique permettant une exécution complète et automatisée


### Documentation

-   Rédaction d'un fichier `README.md` détaillé comprenant :

    -   Une description du projet et des fonctionnalités développées

    -   La procédure pour lancer le projet

    -   La procédure pour exécuter les tests (unitaires et collection Postman/Bruno)


## Exigences de rendu

Le projet étant volontairement restreint en périmètre, une attention particulière est attendue sur la qualité et la complétude du travail fourni. Assurez-vous que :

-   Le code est propre, bien structuré et bien commenté

-   Tous les cas d'utilisation sont gérés avec les bonnes réponses HTTP

-   Les tests couvrent tous les scénarios possibles et peuvent être exécutés de bout en bout sans erreur

-   La documentation fournie permet une prise en main rapide et efficace du projet


## Livrables

-   Code source complet et documenté

-   Fichier `README.md` détaillé

-   Collection Postman ou Bruno avec tests intégrés

-   Rapport final sur le projet et les choix techniques effectués


**Date limite de rendu : 20/04/2025 à 23h59**