public class Start {
    public static void main (String[] arg){
        Lion lion = new Lion("Lion");
        Cow cow = new Cow ("Cow");
        Animal animal = new Animal("Animal");
        lion.animalSound();
        cow.animalSound();
        animal.animalSound();

    }
}
