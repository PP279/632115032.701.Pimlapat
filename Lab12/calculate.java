public class calculate{
    public static void main (String[] args){
        Shape shape;
        Rectangle Rectangle = new Rectangle();
        shape = Rectangle;
        shape.setvalue(10,10);

        System.out.println("Area of Rectangle is " + shape.getArea());

        Triangle Triangle = new Triangle();
        shape = Triangle;
        shape.setvalue(10,10);

        System.out.println("Area of Triangle is " + shape.getArea());

        Circle Circle = new Circle();
        shape = Circle;
        shape.setvalue(10,10);

        System.out.println("Area of Circle is " + shape.getArea());
    }
}