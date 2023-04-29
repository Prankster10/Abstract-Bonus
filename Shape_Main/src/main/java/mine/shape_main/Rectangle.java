package mine.shape_main;
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(int NumSides) {
        super(NumSides);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
@Override
public double getArea(){
        return width*length;
}
@Override
        public double getPerimeter(){
            return 2 * (length + width);
        }
    
}
