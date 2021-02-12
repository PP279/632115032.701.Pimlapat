package Week10;
public class Human {
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        Human human = new Human();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog);

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog);

        dog = new Fish();
        System.out.println("The Third calling hit(Animal)");
        human.hit(dog);
    }
}
