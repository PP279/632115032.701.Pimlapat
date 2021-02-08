public class Me extends Person {
    String workState;

    public Sheriff(string name,int bornYear,String workState){
        super(name,bornYear);
        this.workState = workState;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a student and live in " + workState + ".");
        }
}
