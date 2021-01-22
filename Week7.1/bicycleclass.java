import java.util.Scanner;
public class bicycleclass {
    double Speed = 10,Brake = 5 ,UP = 5;
    double input,compare = Speed; 

    public double getSpeed() {
        return Speed; 
    }

    public double getBrake() {
        return Brake;}


    public double getUP() {
        return UP; }

    double compare () {
        Scanner in = new Scanner(System.in);
        System.out.println("Increase speed press 1   //  Brake press 2  // Stop press 3");
        double input = in.next();
        while (input !=3){
        if (input == 1){
              compare = compare + UP; }
        if (input == 2){
        compare = compare - Brake; }
    }
    if (compare > 99){
        input = 3;
    }
    System.out.println("The current speed of a bicycle is " + compare + "km/h");
  return compare;
}

}
