# Rendu 1 Cours d'Architecture Logicielle

## Exercices réalisées par Corentin L. , Melanie T. , Kévin V.

### Singleton

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
