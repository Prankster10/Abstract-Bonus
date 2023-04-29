package mine.shape_main;
public class Shape_Main {
    public static void main(String[] args) {
    Rectangle r1 = new Rectangle(3);
    r1.setLength(3.5);
    r1.setWidth(4.7);
        System.out.println("The Area of Rectangle is: "+r1.getArea()+"\n The Perimeter of Rectangle is: "+r1.getPerimeter());
    Triangle t1 = new Triangle(1);
    t1.setSide1(4.2);
    t1.setSide2(6.3);
    t1.setSide3(7.4);
        System.out.println("\n The Area of Triangle is: "+t1.getArea()+"\n The Perimeter of Triangle is: "+ t1.getPerimeter());
    }
}
