package Week6;

public class Person {
    //632115032 PImlapat Pimsarn
    String name,gender;
    int age;
    public Person(){

    }
    public Person (String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce(){
        System.out.println("My name is " + name);
        System.out.println("Age  " + age);
        System.out.println("Gender  " + gender);
    }
}
