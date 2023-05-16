# API Note/Commentaire Vendeur

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](http://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/it-works-why.svg)](https://forthebadge.com)

![alt text](https://www.openium.fr/images/actualites/notes-commentaires-store.jpeg)

## Description

Ce projet est une plateforme de vente en ligne dédiée aux articles de glisse d'occasion, facilitant les transactions entre particuliers. L'objectif est de permettre aux amateurs de sports de glisse, tels que le surf, le snowboard, le skateboard et autres. Afin de pouvoir acheter et vendre des équipements d'occasion de manière sécurisée et pratique.

Après chaque transaction, les utilisateurs peuvent laisser une évaluation et des commentaires sur le vendeur. Cela permet de renforcer la confiance au sein de la communauté et d'encourager les comportements responsables. 

Cette API vise à permettre aux utilisateurs de laisser leurs avis sur chaque vendeur dont il effectue leurs commandes sur le site de vente en ligne.

# Table des matières

1. [Note et commentaire vendeur](#note-vendeur)
2. [Description](#description)
3. [Pour commencer](#pour-commencer)
4. [Pré-requis](#pr-requis)
5. [Installation et Démarrage](#installation-et-dmarrage)
6. [API](#api)
7. [Fabriqué avec](#fabriqu-avec)
8. [Versions](#versions)
9. [Auteurs](#auteurs)

## Pour commencer

### Pré-requis

- Avoir un IDE adapté à Java.
- Possèder la version Java 17.

### Installation et Démarrage

- Ouvrez votre IDE préféré de java.
- Cloner le dossier avec ``git clone https://github.com/Thomas-Lebas/NoteVendeur.git`` .
- Vérifier qu'il n'y ai pas de problème de package dans le ``pom.xml`` du projet.
- Se rendre dans le fichier ``application.properties``, pour mettre les informations de connexion de votre base de données, en suivant le chemin suivant :
``NoteVendeur\src\main\ressources\application.properties``

## Exemple de l'utilisation API

Nos tokens d'authentification ne sont pas configurés, nous attendons son implémentation.

:x: Première requête pour récupérer tous les avis :

```json5
// GET /Avis/ :

{
  "avis": [
    {
      "id": 1,
      "titre": "Excellent produit",
      "description": "Je suis très satisfait de ce produit. Il est de haute qualité et répond parfaitement à mes attentes.",
      "note": 5,
      "id_utilisateur": 2
    },
    {
      "id": 2,
      "titre": "Décevant",
      "description": "Malheureusement, ce produit ne répond pas à mes attentes. La qualité est médiocre et je ne le recommande pas.",
      "note": 2,
      "id_utilisateur": 18
    },
    {
      "id": 3,
      "titre": "Très bon rapport qualité-prix",
      "description": "Ce produit offre un excellent rapport qualité-prix. Je suis agréablement surpris par ses performances.",
      "note": 4,
      "id_utilisateur": 5
    }
  ]
}
```

:white_check_mark: Deuxième requête pour récupérer tous les avis d'un utilisateur :

```json5
// GET /Avis/user/{id_utilisateur} 

{
  "avis": [
    {
      "id": 4,
      "titre": "Service client médiocre",
      "description": "Je suis déçu du service client. Les réponses sont lentes et peu utiles.",
      "note": 2
    },
    {
      "id": 7,
      "titre": "Très bon produit",
      "description": "Ce produit est exactement ce dont j'avais besoin. Il est performant et fiable.",
      "note": 5
    }
  ]
}
```

:white_check_mark: Troisième requête pour récupérer un avis :

```json5
// GET /avis/{id}

{
  "id": 5,
  "titre": "Bonne expérience d'achat",
  "description": "J'ai eu une expérience d'achat agréable avec ce vendeur. Livraison rapide et produit conforme.",
  "note": 4,
  "id_utilisateur": 15
}
```

:white_check_mark: Quatrième requête pour poster un avis :

```json5
// POST /Avis/

// Demande : "HEADER" : Token

{
  "titre": "Excellent service",
  "description": "Le service fourni était excellent. Le personnel était sympathique et compétent.",
  "note": 5
"num_commande": "EUYTICHG5689LK"
} 

// Réponse Body :
{
  "id": 8,
  "titre": "Excellent service",
  "description": "Le service fourni était excellent. Le personnel était sympathique et compétent.",
  "note": 5
}
```

:white_check_mark: Cinquième requête pour mettre un avis :

```json5
// PUT /avis/{id}

// Demande : "HEADER" : Token

{
  "titre": "Nouveau titre de l'avis",
  "description": "Nouvelle description de l'avis",
  "note": 3
} 

// Réponse Body :
{
  "id": 3,
  "titre": "Nouveau titre de l'avis",
  "description": "Nouvelle description de l'avis",
  "note": 3
}
```

:white_check_mark: Sixième requête pour supprimer un avis :

```json5
// DELETE /avis/{id}

// Demande : "HEADER" : Token

// Réponse :
{
  "message": "L'avis avec l'id 3 a été supprimé avec succès."
}
```

## Fabriqué avec

* [Java](https://www.java.com/fr/download/) - Langage de programmation
* [Spring](https://start.spring.io/) - Framework Java
* [Intellij IDEA](https://www.jetbrains.com/idea/) - Editeur de code Java

## Versions

* **Dernière version stable :** 1.0.0
* **Dernière version :** 1.0.0
* Liste des versions : [Cliquer pour afficher](https://github.com/Thomas-Lebas/NoteVendeur/tags)

## Auteurs

* **Hugo FERRY** _alias_ [@HugoFerry](https://github.com/HugoFerry)
* **Thomas LEBAS** _alias_ [@Thomas-Lebas](https://github.com/Thomas-Lebas)

