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

