// Exercice SOLID (O)

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



// Exercice SOLID (I)

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
