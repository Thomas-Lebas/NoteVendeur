# Note et commentaire vendeur

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](http://forthebadge.com)[![forthebadge](https://forthebadge.com/generator/?plabel=MADE+WITH&slabel=SPRING&pbg=%2381E638&sbg=%236FC92E)](http://forthebadge.com)

## Description

Ce projet est une plateforme de vente en ligne dédiée aux articles de glisse d'occasion, facilitant les transactions entre particuliers. L'objectif est de permettre aux amateurs de sports de glisse, tels que le surf, le snowboard, le skateboard, etc., d'acheter et de vendre des équipements d'occasion de manière sécurisée et pratique.

Après chaque transaction, les utilisateurs peuvent laisser une évaluation et des commentaires sur l'autre partie. Cela permet de renforcer la confiance au sein de la communauté et d'encourager les comportements responsables.

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
- Avoir les différents packages nécessaires, sinon les installer après avoir ouvert le projet.

### Installation et Démarrage

Cloner le dossier avec ``git clone https://github.com/HugoFerry/EPSI_B3_Projet_JAVA_FSL.git``. \
Ouvrez le dossier cloné sur votre IDE préféré de java. \
Installer les différents packages s'il vous en manque.

Se rendre sur le fichier ``Main.java`` en suivant le chemin suivant :
``EPSI_B3_Projet_JAVA_FSL-DEV\src\main\java\projet`` \
Lancer le fichier ``Main.java`` via votre IDE.

## API

Première requête pour récupérer tous les avis :
```json
GET /Avis/ :

{
  "avis": [
    {
      "id": 1,
      "titre": "Excellent produit",
      "description": "Je suis très satisfait de ce produit. Il est de haute qualité et répond parfaitement à mes attentes.",
      "note": 5
    },
    {
      "id": 2,
      "titre": "Décevant",
      "description": "Malheureusement, ce produit ne répond pas à mes attentes. La qualité est médiocre et je ne le recommande pas.",
      "note": 2
    },
    {
      "id": 3,
      "titre": "Très bon rapport qualité-prix",
      "description": "Ce produit offre un excellent rapport qualité-prix. Je suis agréablement surpris par ses performances.",
      "note": 4
    }
  ]
}
```

Deuxième requête pour récupérer tous les avis d'un utilisateur :

```json
GET /Avis/user/{id_utilisateur} 

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

Troisième requête pour récupérer un avis :

```json
GET /avis/{id}

{
  "id": 5,
  "titre": "Bonne expérience d'achat",
  "description": "J'ai eu une expérience d'achat agréable avec ce vendeur. Livraison rapide et produit conforme.",
  "note": 4
"id_utilisateur": 15
}
```

Quatrième requête pour poster un avis :

```json
POST /Avis/
Content-Type: application/json

Demande : "HEADER" : Token

{
  "titre": "Excellent service",
  "description": "Le service fourni était excellent. Le personnel était sympathique et compétent.",
  "note": 5
"num_commande": "EUYTICHG5689LK"
} 

Réponse Body :
{
  "id": 8,
  "titre": "Excellent service",
  "description": "Le service fourni était excellent. Le personnel était sympathique et compétent.",
  "note": 5
}
```

Cinquième requête pour mettre un avis :

```json
PUT /avis/{id}

Demande : "HEADER" : Token

{
  "titre": "Nouveau titre de l'avis",
  "description": "Nouvelle description de l'avis",
  "note": 3
} 

Réponse Body :
{
  "id": 3,
  "titre": "Nouveau titre de l'avis",
  "description": "Nouvelle description de l'avis",
  "note": 3
}
```

Sixième requête pour supprimer un avis :

```json
DELETE /avis/{id}

Demande : "HEADER" : Token

Réponse :
{
  "message": "L'avis avec l'id 3 a été supprimé avec succès."
}
```

## Fabriqué avec

* [Java](https://www.java.com/fr/download/) - Langage de programmation
* [Spring](https://start.spring.io/) - Framework Java
* [Intellij IDEA](https://www.jetbrains.com/idea/) - Editeur de code Java

## Versions

* **Dernière version stable :** 0
* **Dernière version :** 0
* Liste des versions : [Cliquer pour afficher](https://github.com/Thomas-Lebas/NoteVendeur/tags)

## Auteurs

* **Hugo FERRY** _alias_ [@HugoFerry](https://github.com/HugoFerry)
* **Thomas LEBAS** _alias_ [@Thomas-Lebas](https://github.com/Thomas-Lebas)

