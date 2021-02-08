public class main {
    public static void main(String[] args){
        Person person1;
        person1 = new Person("Mark", 2001);

        person1.introduce();

        person2 = new Sheriff("Mateo",1988,"California");
        person2.introduce();

        person3 = new Ball("Ball",1977,"CMU");
        person3.introduce();

        person4 = new Tu("Tu",1954,"Thailand");
        person4.introduce();

        person5 = new Messi("Messi",1987,"Barcelona");
        person5.introduce();

        person6 = new Me("Pim",2001,"Thailand");
        person6.introduce();

    }
}
