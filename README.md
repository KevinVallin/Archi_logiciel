# Rendu 1 Cours d'Architecture Logicielle

## Exercices réalisées par Corentin L. , Melanie T. , Kévin V.

### Exercice diagramme UML et C4

<img width="798" alt="image" src="https://user-images.githubusercontent.com/72194040/203358502-9de0ce0e-05f3-490d-8237-94c9ea5cfec7.png">

### Exercice SOLID (S)

<img width="798" alt="image" src="https://user-images.githubusercontent.com/72194040/203358827-6fc740b9-f1f1-4268-9382-6e124ca131ce.png">

### Exercice SOLID (O)

```java
class Boisson {
  name="EAU";calories=0;

  constructor(name, calories) {
    this.name = name;
    this.calories = calories;
  }
}

class Restaurant {
  main () {
    client = new Client();
    cafe = new Boisson("CAFÉ", 1);
    client.boire(cafe);
    // Comment gérer de nouvelles boissons ?
    client.boire(new Boisson("THÉ", 1));
    // Comment passer energy du client à 0 ?
    client.boire(new Boisson("POISON", 0));
  }
}

class Client {
  feeling="normal";energy=1000;

  boire (boisson) {
    switch (boisson.nom) {
      case "CAFÉ":
        this.feeling = "réveillé";
        this.energy += boisson.calories;
        break;
      case "TISANE":
        this.feeling = "reposé";
        this.energy += boisson.calories;
        break;
      case "SOUPE":
        this.feeling = "rassasié";
        this.energy += boisson.calories;
        break;
    }
  }
}

public interface Consomable {

  public void boire (Client c, Boisson b){
      c.energy -= this.calories;
  }

  public void boirePoison (Client c){
      c.energy = 0;
  }

}
```

### Exercice SOLID (L)

<img width="819" alt="image" src="https://user-images.githubusercontent.com/72194040/203359638-7af767bf-f6f1-48af-80cf-0212be5fe8a9.png">

### Exercice SOLID (I)

<img width="531" alt="image" src="https://user-images.githubusercontent.com/72194040/203359511-72419402-0b95-4a84-b15b-da3ec6284d6a.png">

```java
public interface ImprimanteMultifonction {
 void Imprimer(String content);
}

class ImprimanteSuperChere implements ImprimanteMultifonction {
 public void Imprimer(String content) {
   System.out.println("J'ai imprimé !");
 }
 public void Scanner(String content) {
   System.out.println("J'ai scanné !");
 }
 public void Faxer(String content) {
   System.out.println("J'ai faxé !");
 }
 public void ImprimerRectoVerso(String content) {
   System.out.println("J'ai imprimé recto-verso !");
 }
}

class ImprimantePasChere implements ImprimanteMultifonction {

 public void Imprimer(String content) {
   System.out.println("J'ai imprimé !");
 }
}
```

### Exercice SOLID (D)

<img width="709" alt="image" src="https://user-images.githubusercontent.com/72194040/203359217-cc434790-add9-44d3-b7f9-499ac14a0d7d.png">
