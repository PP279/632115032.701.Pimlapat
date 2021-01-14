package Week6;

public class doctor extends Person {
    int hour;
    public doctor(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void docter(){
        System.out.println(name + "work hour to day is " + hour );
    }
}
