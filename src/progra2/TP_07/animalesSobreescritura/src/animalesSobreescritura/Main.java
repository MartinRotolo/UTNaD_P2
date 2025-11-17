/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalesSobreescritura;

/**
 *
 * @author Martin
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> granja = new ArrayList<>();

        granja.add(new Perro());
        granja.add(new Gato());
        granja.add(new Vaca());

        // Polimorfismo: Se llama al método de la superclase,
        for (Animal animal : granja) {
            animal.hacerSonido();
        }
    }
}