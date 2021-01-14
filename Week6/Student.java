package Week6;

public class Student extends Person {
    int time;
    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void Student(){
        System.out.println(name + "have study today " + time + "hour");
    }
}
