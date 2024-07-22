
# Programmation Orientée Objet

Pour initier le concept de la Programmation Orienté Objets et la comparer avec la programmation littérale, je vais utiliser le language Javascript pour ne pas complexifier l'écriture (et la lecture). En effet, Java est un language accès Objets et se prête donc très bien a l'orienté objets, mais rends l'écriture de `map` plus verbeuse. Nous reviendrons sur le Java pour traiter plus en profondeur le sujet.

## Programmation Littérale

### Description
- La programmation littérale utilise des objets et fonctions simples sans utiliser de classes.
- Les objets sont définis directement avec des paires clé-valeur.

### Avantages
- Simple et direct pour les petits projets.
- Facile à lire et comprendre pour les débutants.

### Limites
- Difficulté à réutiliser du code pour des structures similaires.
- Moins efficace pour les projets de grande taille ou complexes.

### Exemple

#### Objet Littéral

```javascript
const voiture = {
    marque: "Toyota",
    couleur: "rouge"
};

function start(voiture) {
  console.log(`La ${voiture.marque} démarre.`);
}

function stop(voiture) {
  console.log(`La ${voiture.marque} s'arrête.`);
}

// Utilisation de l'objet
start(voiture); // Affiche : "La voiture démarre."
stop(voiture);  // Affiche : "La voiture s'arrête."
```

## Programmation Orientée Objet (POO)

### Description
- La POO repose sur la création de classes qui définissent des objets.
- Les objets sont des instances de classes et peuvent avoir des propriétés (attributs) et des méthodes.

### Concepts Clés

Voici une liste de concepts clés important, nous y reviendons plus-tard :

1. **Classe** : Modèle définissant les propriétés et méthodes des objets. Une classe représente un concept métier et peut être considérée comme un plan pour créer des objets.
2. **Objet** : Instance d'une classe, représentant une entité spécifique créée à partir de ce modèle. C'est une occurrence concrète qui possède des valeurs spécifiques pour ses attributs.
3. **Attributs (Propriétés)** : Variables qui stockent les données d'un objet. Ce sont les caractéristiques de l'objet.
4. **Méthodes** : Fonctions définies dans une classe qui décrivent les comportements que les objets de cette classe peuvent réaliser.
5. **Encapsulation** : Restriction de l'accès aux données internes de l'objet, permettant de protéger son intégrité.
6. **Héritage** : Capacité de créer des classes à partir de classes existantes, permettant le partage et la réutilisation du code.
7. **Polymorphisme** : Traitement uniforme des objets de différentes classes, permettant aux objets d'être utilisés de manière interchangeable.

### Avantages
- Facilite la réutilisation et l'uniformisation du code grâce à l'héritage et au polymorphisme.
- Modularité accrue, rendant le code plus facile à maintenir et à faire évoluer.
- Encapsulation des données pour protéger l'intégrité des objets.
- Simplifie la représentation des besoins métiers par la modélisation de concepts en classes.

### Exemple

#### Utilisation de Classes

```javascript
// Définition de la classe Voiture
class Voiture {
    constructor(marque, couleur) {
        this.marque = marque;  // Attribut
        this.couleur = couleur; // Attribut
    }

    start() { // Méthode
        console.log(`La ${this.marque} démarre.`);
    }

    stop() { // Méthode
        console.log(`La ${this.marque} s'arrête.`);
    }
}

// Créer une instance de la classe Voiture
const maVoiture = new Voiture("Toyota", "rouge");

// Utilisation de l'objet
maVoiture.start(); // Affiche : "La Toyota démarre."
maVoiture.stop();  // Affiche : "La Toyota s'arrête."
```

#### Héritage

```javascript
// Classe dérivée de Voiture
class VoitureÉlectrique extends Voiture {
    constructor(marque, couleur, autonomie) {
        super(marque, couleur);
        this.autonomie = autonomie; // Attribut supplémentaire
    }

    charge() { // Nouvelle méthode
        console.log(`La ${this.marque} est en charge.`);
    }
}

// Créer une instance de la classe VoitureÉlectrique
const maVoitureElectrique = new VoitureÉlectrique("Tesla", "bleue", 400);

// Utilisation de l'objet
maVoitureElectrique.start(); // Affiche : "La Tesla démarre."
maVoitureElectrique.charge();  // Affiche : "La Tesla est en charge."
```

## 1. Classe

(Retour au Java)

**Description :**
Une classe est un modèle qui définit les propriétés (attributs) et comportements (méthodes) des objets. Elle représente un concept métier et est utilisée pour créer des objets.

**Exemple :**

```java
public class Voiture {
    // Attributs
    private String marque;
    private String couleur;

    // Constructeur
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    // Méthodes
    public void start() {
        System.out.println("La " + marque + " démarre.");
    }

    public void stop() {
        System.out.println("La " + marque + " s'arrête.");
    }
}
```

## 2. Objet

**Description :**
Un objet est une instance d'une classe. Il représente une entité spécifique qui possède des valeurs concrètes pour ses attributs et peut exécuter les méthodes définies dans sa classe.

**Exemple :**

```java
public class Main {
    public static void main(String[] args) {
        // Création d'un objet de type Voiture
        Voiture maVoiture = new Voiture("Toyota", "rouge");

        // Utilisation des méthodes de l'objet
        maVoiture.start(); // Affiche : "La Toyota démarre."
        maVoiture.stop();  // Affiche : "La Toyota s'arrête."
    }
}
```

## 3. Attributs (Propriétés)

**Description :**
Les attributs sont des variables qui stockent les données spécifiques d'un objet. Ils définissent les caractéristiques de l'objet.

**Exemple :**

```java
public class Voiture {
    // Attributs de la classe Voiture
    private String marque; // Marque de la voiture
    private String couleur; // Couleur de la voiture

    // Constructeur et méthodes...
}
```

## 4. Méthodes

**Description :**
Les méthodes sont des fonctions définies dans une classe qui décrivent les comportements que les objets de cette classe peuvent réaliser. Elles peuvent manipuler les attributs de l'objet et réaliser diverses actions.

**Exemple :**

```java
public class Voiture {
    private String marque;
    private String couleur;

    // Méthode pour démarrer la voiture
    public void start() {
        System.out.println("La " + marque + " démarre.");
    }

    // Méthode pour arrêter la voiture
    public void stop() {
        System.out.println("La " + marque + " s'arrête.");
    }
}
```

## 5. Encapsulation

**Description :**
L'encapsulation consiste à restreindre l'accès direct aux données d'un objet et à utiliser des méthodes pour accéder et modifier ces données. Cela protège l'intégrité des données de l'objet.

**Exemple :**

```java
public class Voiture {
    // Attributs privés pour protéger les données
    private String marque;
    private String couleur;

    // Constructeur
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    // Méthodes pour accéder aux attributs
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Méthodes pour démarrer et arrêter
    public void start() {
        System.out.println("La " + marque + " démarre.");
    }

    public void stop() {
        System.out.println("La " + marque + " s'arrête.");
    }
}
```

## 6. Héritage

**Description :**
L'héritage permet de créer une nouvelle classe (classe dérivée) à partir d'une classe existante (classe de base), en réutilisant les attributs et méthodes de la classe de base.

**Exemple :**

```java
// Classe de base
public class Voiture {
    private String marque;
    private String couleur;

    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    public void start() {
        System.out.println("La " + marque + " démarre.");
    }

    public void stop() {
        System.out.println("La " + marque + " s'arrête.");
    }
}

// Classe dérivée
public class VoitureÉlectrique extends Voiture {
    private int autonomie;

    public VoitureÉlectrique(String marque, String couleur, int autonomie) {
        super(marque, couleur);
        this.autonomie = autonomie;
    }

    public void charge() {
        System.out.println("La " + super.getMarque() + " est en charge.");
    }
}
```

## 7. Polymorphisme

**Description :**
Le polymorphisme permet de traiter des objets de différentes classes de manière uniforme. Cela permet d'utiliser une méthode sur des objets de différentes classes, chaque classe pouvant redéfinir le comportement de la méthode.

**Exemple :**

```java
// Classe de base
public class Véhicule {
    public void move() {
        System.out.println("Le véhicule se déplace.");
    }
}

// Classe dérivée Voiture
public class Voiture extends Véhicule {
    @Override
    public void move() {
        System.out.println("La voiture roule sur la route.");
    }
}

// Classe dérivée Vélo
public class Vélo extends Véhicule {
    @Override
    public void move() {
        System.out.println("Le vélo est pédalé sur le chemin.");
    }
}

public class Main {
    public static void main(String[] args) {
        Véhicule[] véhicules = {new Voiture(), new Vélo()};

        // Appel de la méthode déplacer sur différents types d'objets
        for (Véhicule véhicule : véhicules) {
            véhicule.move();
        }
        // Affiche :
        // "La voiture roule sur la route."
        // "Le vélo est pédalé sur le chemin."
    }
}
```

## Comparaison

| Aspect                        | Programmation Littérale             | Programmation Orientée Objet  |
|-------------------------------|-------------------------------------|-------------------------------|
| **Complexité**                | Simple pour des projets simples     | Adaptée pour des projets complexes |
| **Réutilisation du code**     | Limitée                             | Favorisée par l'héritage      |
| **Modularité**                | Moins modulaire                     | Haute modularité              |
| **Évolutivité**               | Difficile à maintenir et étendre    | Facile à étendre              |
| **Encapsulation**             | Aucune                              | Présente                      |
| **Polymorphisme**             | Non pris en charge                  | Pris en charge                |
| **Représentation Métiers**    | Directe mais limitée                | Naturelle et extensible via les classes |
