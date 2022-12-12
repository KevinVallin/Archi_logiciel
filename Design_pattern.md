# Rendu Cours d'Architecture Logicielle - Exercices Design Pattern

## Exercices réalisées par Corentin L. , Melanie T. , Kévin V.

### Exercice Singleton

```java

public class Main {
    public static void main(String[] args) {
        Singleton singleton = new Singleton("qkjfgskjhgfdqslhjgfkhjg");
        for (int i = 0; i < 10; i++) {
            System.out.println(singleton.getInstance());
        }
    }
}

class Singleton {
    public static String id;

    public Singleton(String id) {
        this.id = id;
    }

    public String getInstance() {
        return this.id;
    }
}

```

### Exercice Factory

![image](https://user-images.githubusercontent.com/57954853/203750560-12e3211b-5dd6-46de-a66a-c2977273f263.png)

### Exercice Observateur

![image](https://user-images.githubusercontent.com/57954853/203807929-e355bd82-5e74-4e3b-bbd7-f6dfc694bd2e.png)

### Exercice Strategie

![image](https://user-images.githubusercontent.com/57954853/203822952-8a697963-dd65-4cc8-9bab-6ca52208be4d.png)

### Exercice Builder

```java
class Burger {
    private final int nbBun;
    private final int nbSalad;
    private final int nbTomato;
    private final int nbMeat;
    private final int nbPickles;
    private final int nbOnions;

    public Burger(BurgerBuilder builder) {
        this.nbBun = builder.nbBun;
        this.nbSalad = builder.nbSalad;
        this.nbTomato = builder.nbTomato;
        this.nbMeat = builder.nbMeat;
        this.nbPickles = builder.nbPickles;
        this.nbOnions = builder.nbOnions;
    }
    public String toString() {
        return "Burger : "+this.nbBun+" buns, "+this.nbSalad+" salad(s), "+this.nbTomato+" tomato(es), "+this.nbMeat+" piece(s) of meat, "+this.nbOnions+" onion(s), "+this.nbPickles+" pickle(s)";
    }

    public static class BurgerBuilder {
        public static int nbBun;
        public static int nbSalad;
        public static int nbTomato;
        public static int nbMeat;
        public static int nbPickles;
        public static int nbOnions;

        public BurgerBuilder() {
            this.nbBun = 2;
        }
        public BurgerBuilder withSalad(int nbSalad) {
            this.nbSalad = nbSalad;
            return this;
        }
        public BurgerBuilder withTomato(int nbTomato) {
            this.nbTomato = nbTomato;
            return this;
        }
        public BurgerBuilder withMeal(int nbMeat) {
            this.nbMeat = nbMeat;
            return this;
        }
        public BurgerBuilder withPickles(int nbPickles) {
            this.nbPickles = nbPickles;
            return this;
        }
        public BurgerBuilder withOnion(int nbOnions) {
            this.nbOnions = nbOnions;
            return this;
        }
        public Burger build() {
            Burger burger = new Burger(this);
            return burger;
        }
    }
}```

