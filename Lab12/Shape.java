public abstract class Shape {
    private double height;
    private double width;


    public void setvalue(double height, double width){
      this.height = height;
      this.width = width;
   }

   public double getWidth() {
       return width;
   } 

   public double getheight() {
       return height;
   }

   public abstract double getArea();
}

