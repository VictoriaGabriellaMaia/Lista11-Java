package principal;

import animal.Animal;
import animal.Elefante;
import animal.Gorila;
import animal.Leao;
import animal.Urso;
import animal.Zebra;

public class Principal {

    public static void main(String[] args) {
        
        Animal[] zoologico = new Animal[10];

        zoologico[0] = new Leao();
        zoologico[1] = new Elefante();
        zoologico[2] = new Gorila();
        zoologico[3] = new Zebra();
        zoologico[4] = new Urso();
        zoologico[5] = new Leao();
        zoologico[6] = new Elefante();
        zoologico[7] = new Gorila();
        zoologico[8] = new Zebra();
        zoologico[9] = new Urso();

        System.out.println("Zoológico");

        for (int i = 0; i < zoologico.length; i++) {
            
            Animal animalAtual = zoologico[i];
            
            System.out.print("Jaula " + i + " (" + animalAtual.toString() + "): ");

            animalAtual.emitirSom(); 
        }
    }
}
