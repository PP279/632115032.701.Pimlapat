package Week7;

public class Fish extends PET{
    String size,water,Speed;
    public Fish(String name,int age,String species,String color){
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;}
    public void Swim() {
            int max = 2;
            int min = 1;
            int a = (int)(Math.random()*(max-min+1)+min);
    
            if (a == 1){
                System.out.println(name + " is swim in " + water +" water happily.");
            }
            else {
                System.out.println(name + " is swim in " + water +" water and hide behind the stone.");
            }}
    public void SwimSpeed(){
        int max = 2;
            int min = 1;
            int a = (int)(Math.random()*(max-min+1)+min);
    
            if (a == 1){
                System.out.println(name + " was scared and Swim away with " + Speed + " of his speed");
            }
            else {
                System.out.println(name + "feel enjoy swim with " + Speed + " of his speed");
            }}
    public void IsSwimtotheSea(){
        
        if (water == "Salt" || water == "salt"){
            System.out.println(name + " can swim in the sea. ");
        }
        else {
            System.out.println(name + " can not swim in the sea. ");
        }
    
    }
    public void FishBehavior() {
                System.out.println(" - My Fish -");
                System.out.println(name + " is live in " + water + "water.");
                Swim();
                IsSwimtotheSea();
                SwimSpeed();
        
}
public void Fish() {
}
}
