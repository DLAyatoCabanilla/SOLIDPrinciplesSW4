package SRP;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Nyx", "Ayato");
        PetEat petEat = new PetEat();
        PetSound petSound = new PetSound();


        petEat.eat(cat, "Cat Food");
        petSound.makeSound(cat, "Meow meow");

    }
}
