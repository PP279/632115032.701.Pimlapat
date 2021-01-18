package Week7;
//632115032 Pimlapat Pimsarn

public class PET {
    String name,species,color;
    int age;
    public PET(){

    }
    public PET (String name,int age,String species,String color){
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }
    public void thisPet() {
        System.out.println("Name : " + name);
        System.out.println("Species : " + species);
        System.out.println("Age : " + age);
        System.out.println("Color : " + color);
    }
    }

  
