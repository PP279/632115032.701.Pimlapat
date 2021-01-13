public class Circle {
    public static void main(String[] args) {

        System.out.println("Test Case No. 1");
        Circleclass circle1 = new Circleclass(2);
        System.out.println("Origin : (0.0,0.0) ");
        System.out.println("the area of the circle is " + circle1.Area());
        System.out.println("the circumference of the circle  is " + circle1.Circumference());

        System.out.println("------------------------------------------------------------------------");
    
        System.out.println("Test Case No. 2");
        Circleclass circle2 = new Circleclass(3);
        System.out.println("Origin : (1.0,2.0) ");
        System.out.println("the area of the circle is " + circle2.Area());
        System.out.println("the circumference of the circle is " + circle2.Circumference());

        System.out.println("------------------------------------------------------------------------");
    
        System.out.println("Test Case No. 3");
        Circleclass circle3 = new Circleclass(1);
        System.out.println("Origin : (3.0,5.0) ");
        System.out.println("the area of the circle is " + circle3.Area());
        System.out.println("the circumference of the circle is " + circle3.Circumference());

        System.out.println("------------------------------------------------------------------------");
    
        System.out.println("Test Case No. 4");
        Circleclass circle4 = new Circleclass(-1);
        System.out.println("Origin : (-1.0,-10.0) ");
        System.out.println("the area of the circle is " + circle4.Area());
        System.out.println("the circumference of the circle is " + circle4.Circumference());

        circle1.origin();
        circle2.origin1();
    }
}
