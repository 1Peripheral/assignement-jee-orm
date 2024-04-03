# Gestion de Produits avec Spring ORM

Ce dépôt contient le code source d'un projet réalisé dans le cadre d'un TP sur l'utilisation de Spring ORM pour la gestion de produits. L'objectif principal de ce TP est de se familiariser avec les concepts de base de Spring ORM, en utilisant Spring Data JPA pour la couche d'accès aux données.

## Entité JPA Product

L'entité JPA `Product` représente un produit avec les attributs suivants :
- `id` de type `Long`
- `name` de type `String`
- `price` de type `double`
- `quantity` de type `int`

## Configuration de l'unité de persistance

L'unité de persistance est configurée dans le fichier `application.properties` pour spécifier les paramètres de connexion à la base de données.

## Interface JPA Repository

Une interface JPA Repository basée sur Spring Data est créée pour effectuer des opérations CRUD de base sur l'entité `Product`.

## Opérations de gestion des produits

L'application implémente les opérations de gestion suivantes sur les produits :
- Ajout de nouveaux produits
- Consultation de tous les produits
- Consultation d'un produit spécifique par son ID
- Recherche de produits par nom
- Mise à jour des informations d'un produit
- Suppression d'un produit

## Migration de H2 Database vers MySQL

Dans le cadre de l'apprentissage, une migration de la base de données H2 vers PosgreSQL est réalisée pour comprendre le processus de changement de base de données.

