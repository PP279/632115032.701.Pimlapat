public class Circleclass {
    private double radius,d,x,y,r;

    
	public void Circleclass() {
    radius = 1;    
    } 

    public void setRadius (double newRadius) { 
        radius = newRadius;   
      }

    public Circleclass(double newRadius) {
        if (newRadius < 0 ){newRadius = 0;}
        radius = newRadius;   
    }

  
    public double Area() { 
        return radius*radius*Math.PI;   
    }  

    public double Circumference() { 
        double a = 2*radius* Math.PI;
        return a;     
    } 

    public void Origin(double x0, double y0) {
        x = x0; y = y0;
	}

    public void origin() {
        double x1 = 1; double x0 = 0 ; double r1 = 3 ; double r0 = 2; double y0 = 0;double y1 = 2;
        d = Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));

        if (d>r0-r1 && d<r0+r1){
            System.out.println("objects from the test case 1 and test case 2 is intersected");
        }
        else System.out.println("objects from the test case 1 and test case 2 is not intersect");
    }

    public void origin1() {
        double x1 = 3; double x0 = 0 ; double r1 = 1 ; double r0 = 2; double y0 = 0;double y1 = 5;
        d = Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));

        if (d>r0-r1 && d<r0+r1){
            System.out.println("objects from the test case 1 and test case 3 is intersect");
        }
        else System.out.println("objects from the test case 1 and test case 3 is not intersect");

    }
     
}
