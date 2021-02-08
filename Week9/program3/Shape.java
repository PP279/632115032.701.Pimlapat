public class Shape {
    int width,height,length;

    public String toSting(){
        return "This is a shape.";
    }

    public static void main(String[] args){
        Shape A = new Shape(10,5,4);
        System.out.println(A.toString());
    }

}
