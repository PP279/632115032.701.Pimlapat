package Week6;

public class Writer extends Person {
    int Letters;
    public Writer(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void Writer(){
        System.out.println(name + "is working with " + Letters + " words to day.");
    }
}
