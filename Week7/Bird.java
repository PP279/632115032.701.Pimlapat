package Week7;

public class Bird extends PET{
    String size,country;
    public Bird(String name,int age,String species,String color){
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;}
    public void Bird() {
        }  
    public void Country(String country) {
        this.country=country;
    }
    public void Speak(){
        int max = 3;
        int min = 1;
        int a = (int)(Math.random()*(max-min+1)+min);

        if (a == 1){
            System.out.println(name + "say HELLO to you");
        }
        else if (a == 2){
            System.out.println(name + "say THANK YOU to you");
        }
        else {
            System.out.println(name + "say I'M HUNGRY and move around.");
    }}

    public void IscanFly() {
        if (size == "Big" || size == "big"){
            System.out.println(name + " can't fly. is it? ");
        }
        else {
            System.out.println(name + " can fly. let' it try. ");
        }
    }
    public void BirdBehavior() {
        System.out.println(" - My Bird -");
        System.out.println(name + " is come from " + country);
        Speak();
        IscanFly();
        

}
    
}
