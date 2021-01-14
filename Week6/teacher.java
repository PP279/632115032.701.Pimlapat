package Week6;

public class teacher extends Person{
    int time;
    public teacher(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void teach(){
        System.out.println(name + "is working  " + time + " hours to day.");
    }
}
