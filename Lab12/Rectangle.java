import jdk.vm.ci.hotspot.SharedHotSpotSpeculationLog;

public class Rectangle extends Shape {
    public double getArea(){
        return getHeight() * getWidth();
    }
}
