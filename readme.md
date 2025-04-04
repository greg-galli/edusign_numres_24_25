
# Projet Spring Boot - API REST

## Objectif

L'objectif de ce projet est d'implémenter une API REST complète et parfaitement fonctionnelle pour l'entité `User`. Vous devez reprendre le code existant et développer les fonctionnalités suivantes en respectant les bonnes pratiques de développement et en garantissant une couverture de tests exhaustive.

## Tâches à réaliser

### Implémentation des endpoints REST

#### Ressource `user`

-   `GET /user/{id}` : Récupérer un utilisateur par son identifiant

-   `PUT /user/{id}` : Mettre à jour un utilisateur (remplacement complet, si un champs n'est pas spécifié il est mis à null / sa valeur par défaut si possible, si ce n'est pas possible alors l'opération doit renvoyer un code d'erreur et indiquer le problème)

-   `PATCH /user/{id}` : Mettre à jour partiellement un utilisateur (on ignore tous les champs qui ne sont pas spécifiés)

-   `DELETE /user/{id}` : Supprimer un utilisateur


#### Ressource `users`

-   `GET /users` : Récupérer la liste complète des utilisateurs

-   `POST /users` : Créer un nouvel utilisateur


### Gestion des cas particuliers

-   Vérification des entrées et **validation des données**

-   Gestion des erreurs avec des **codes d'état HTTP pertinents** et des **messages explicites**

-   Protection contre les opérations non valides (ex : suppression d'un utilisateur inexistant)


### Qualité du code

-   Code entièrement commenté pour expliquer les choix et le fonctionnement

-   Utilisation de DTOs et de Mappers pour éviter l'exposition directe des entités


### Tests rigoureux

-   Création d'une collection **Postman ou Bruno** contenant des requêtes de test **pour chaque type de retour de chaque endpoint**

-   Ajout de **scripts** de test pour **vérifier les codes HTTP retournés** et le **contenu des réponses**

-   Organisation des tests dans une **séquence logique** permettant une exécution complète et automatisée


### Documentation

-   Rédaction d'un fichier `README.md` détaillé comprenant :

    -   Une description du projet et des fonctionnalités développées

    -   La procédure pour lancer le projet

    -   La procédure pour exécuter les tests (collection Postman/Bruno)


## Exigences de rendu

Le projet étant volontairement très restreint en terme de périmètre, une attention particulière est attendue sur la qualité et la complétude du travail fourni. Assurez-vous que :

-   Le code est propre, bien structuré et bien commenté

-   Tous les cas sont gérés avec les bonnes réponses HTTP

-   Les tests couvrent tous les scénarios possibles et peuvent être exécutés de bout en bout sans erreur

-   La documentation fournie permet une prise en main rapide et efficace du projet


## Livrables

- Code source complet et documenté incluant :
  - Fichier `README.md` détaillé
  - Collection Postman ou Bruno avec tests intégrés
- Tout ce que vous pourriez produire au délà du périmètre décrit sera pris en compte sous forme de bonus, si vous mentionnez ces parties dans votre readme

## :warning: Attention :warning:
Je serai intransigeant sur la triche sur cet exercice, n'utilisez que le code que vous aurez produit, ne partagez pas vos sources


**Date limite de rendu : 20/04/2025 à 23h59**