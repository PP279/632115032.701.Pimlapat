package Week7;

public class MainPet {
    public static void main(String[] args) {
        Dog dog = new Dog("Rainny", 3,"Pooddle", "White");
        dog.size = "Small";dog.hair = "Short";
        dog.thisPet();
        dog.DogBehavior();

        Fish fish = new Fish("Lala", 1 , "Siamese fighting", "Blue");
        fish.size = "Small";fish.water = "Fresh";fish.Speed = "1 km/h";
        fish.thisPet();
        fish.FishBehavior();
    
        Bird bird = new Bird("Polly", 2 , "Parrot", "Green");
        bird.size = "Small";bird.country ="New zealand";
        bird.thisPet();
        bird.BirdBehavior();

    }
}
