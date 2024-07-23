package Animal;
import java.util.ArrayList;
import java.util.List;

class SPA {
    private List<Animal> animaux;

    public SPA(){
        this.animaux = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animaux.add(animal);
    }

    public List<Animal> getAnimaux(){
        return this.animaux;
    }
    
}

public abstract class Animal {
    public abstract void faireDuBruit();

    public void dormir() {
        System.out.println("L'animal dors.");
    }

    public static void main(String[] args) {
        Chien chien = new Chien();
        chien.faireDuBruit();
        chien.dormir();

        SPA spa = new SPA();
        
        Chat chat = new Chat();

        spa.addAnimal(chat);
        spa.addAnimal(chien);

        System.out.println(spa.getAnimaux());
    }
}

abstract class AnimalSauvage extends Animal {
    
}

abstract class AnimalDomestique extends Animal {
    
}

class Chien extends AnimalDomestique {

    @Override
    public void faireDuBruit() {
        System.out.println("Le chien aboie.");
    }
    
}


class Chat extends AnimalDomestique {

    @Override
    public void faireDuBruit() {
        System.out.println("Le chat miaule.");
    }

}

class Oiseau extends AnimalSauvage implements Volant {

    @Override
    public void voler() {
        System.out.println("L'oiseau vole de branche en branche.");   
    }

    @Override
    public void faireDuBruit() {
       System.out.println("L'oiseau piaille.");
    }
    
}