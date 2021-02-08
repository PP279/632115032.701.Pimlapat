public class Cube extends Rectangle {
    int length;
    public Rectangle(int width,int height,int length){
        this.length = length;
    }
    public String toSting(){
        return "This is a cube with the side of " + length;
    }
}
