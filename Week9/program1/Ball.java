public class Ball extends Person{
    String local;

    public Sheriff(string name,int bornYear,String local){
        super(name,bornYear);
        this.local = local;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and teach the students in " + local + ".");
        }
}
