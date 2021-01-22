import java.util.Scanner;
public class mountainbike {
    double Speed = 10,Brake = 5 ,UP = 5;
    double input,input2,compare = 10; 

    public double getSpeed() {
        return Speed; 
    }

    public double getBrake() {
        return Brake;}


    public double getUP() {
        return UP; }

    double comparemountain () {
        Scanner in = new Scanner(System.in);
        System.out.println("Increase speed press 1   //  Brake press 2  // Stop press 3");
        double input = in.next();
        while (input !=3){
        if (input == 1){
            System.out.println("gear 1 press 1   //  gear 2  press 2  // gear 3 press 3");
            double input2 = in.next();
            if (input2 == 1){
              compare = compare + 1 * UP ; }
            else if (input2 == 2){
                compare = compare + 2 * UP; }
            else {
                compare = compare + 3 *UP;} }
        if (input == 2){
        compare = compare - Brake; }
    }
    if (compare > 99){
        input = 3;
        compare = 99;
    }
    System.out.println("The current speed of a bicycle is " + compare + "km/h");
  return compare;
}
