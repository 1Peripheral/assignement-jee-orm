# TP 2 ORM
Ce dépôt contient une application de gestion de produits développée avec Spring Boot, Spring Data JPA et MySQL. L'application permet de gérer des produits avec des opérations CRUD de base.

## Entité JPA Product

L'entité JPA `Product` est utilisée pour représenter les produits avec les attributs suivants :
- `id` de type `Long`
- `name` de type `String`
- `price` de type `double`
- `quantity` de type `int`

## Configuration de l'unité de persistance

L'unité de persistance est configurée dans le fichier `application.properties` pour permettre la connexion à la base de données MySQL.

## Interface JPA Repository

Une interface JPA Repository basée sur Spring Data est utilisée pour effectuer des opérations de base sur l'entité `Product`.

## Opérations de gestion des produits

L'application permet de réaliser les opérations suivantes sur les produits :
- Ajouter des produits
- Consulter tous les produits
- Consulter un produit spécifique
- Chercher des produits par nom
- Mettre à jour un produit
- Supprimer un produit

## Migration de H2 Database vers MySQL

La configuration est faite pour migrer de la base de données H2 vers MySQL.

