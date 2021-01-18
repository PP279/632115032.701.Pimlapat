package Week7;

public class Dog extends PET {
        String size,hair;
        
    public Dog(String name,int age,String species,String color){
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }
    public void run() {
        int max = 3;
        int min = 1;
        int a = (int)(Math.random()*(max-min+1)+min);

        if (a == 1){
            System.out.println("My dog " + name + "is run to the jungle.");
        }
        else if (a == 2){
            System.out.println("My dog " + name + "is try to swim at the pond.");
        }
        else {
            System.out.println("My dog " + name + "is sleep on the mattress.");
    }}
    public void Bark() {
            int max = 2;
            int min = 1;
            int a = (int)(Math.random()*(max-min+1)+min);
    
            if (a == 1){
                System.out.println("Bark ruff-ruff.");
            }
            else {
                System.out.println("Bark bow wow.");
            }

    }
    public void DogBehavior() {
        System.out.println(" - My dog -");
        System.out.println("Name : " + name);
        System.out.println("Species : " + species);
        System.out.println("Age : " + age);
        System.out.println(name + " is " + size + "and have " + hair + "hair.");
        run();
        Bark();

        
    }
	public void Dog() {
	}
}