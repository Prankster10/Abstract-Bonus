package mine.shape_main;
public abstract class Shape {
    private int NumSides;

    public Shape(int NumSides) {
        this.NumSides = NumSides;
    }

    public int getNumSides() {
        return NumSides;
    }

    public void setNumSides(int NumSides) {
        this.NumSides = NumSides;
    }
   public abstract double getArea();
   public abstract double getPerimeter();
}
