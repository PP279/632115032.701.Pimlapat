public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    public String toSting(){
        return "My first name " + firstname + " last name " + lastname;
    }

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static void main(String[] args){
        Student p = new Student("EE","NN");
        System.out.println(p.toString());
    }


}
