# Lista11-Java

## Polimorfismo em Java

### Exercício 1 — Zoológico de Animais

Em linguagem de programação Java, crie um algoritmo utilizando os pacotes `animal` e `principal`, conforme as instruções a seguir.

### 1. Pacote `animal`

Nesse pacote, defina as classes `Animal`, `Elefante`, `Gorila`, `Leao`, `Urso` e `Zebra`.

**Classe Animal**

```java
package animal;

public class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void emitirSom() {
        System.out.println("Som de animal.");
    }
}
```

**Classe Elefante**

```java
package animal;

public class Elefante extends Animal {
    public Elefante() {
        super("[elefante]");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de elefante.");
    }
}
```

**Classe Gorila**

```java
package animal;

public class Gorila extends Animal {
    public Gorila() {
        super("[gorila]");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de gorila.");
    }
}
```

**Classe Leao**

```java
package animal;

public class Leao extends Animal {
    public Leao() {
        super("[leao]");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de leao.");
    }
}
```

**Classe Urso**

```java
package animal;

public class Urso extends Animal {
    public Urso() {
        super("[urso]");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }
}
```

**Classe Zebra**

```java
package animal;

public class Zebra extends Animal {
    public Zebra() {
        super("[zebra]");
    }
}
```

### 2. Pacote `principal`

Nesse pacote, defina uma classe chamada `Principal`, contendo o método `main(String[] args)`.

Dentro desse método, crie um vetor com 10 animais:

```java
Animal[] zoologico = new Animal[10];
```

Cada posição do vetor deve receber a referência para um objeto de uma das classes do pacote `animal`.

Percorra o vetor, chamando o método `emitirSom()` de cada objeto para executar o método sobrescrito nas respectivas classes.

**Objetivo:** praticar herança, sobrescrita de métodos (`@Override`) e polimorfismo em Java.
