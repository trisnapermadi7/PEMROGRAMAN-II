package soal1;
public class Rectangle extends Shape{
    private double length, width;
    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l; this.width = w;
    }
    @Override
    public double area() {
        return length*width;
    }
    public String toString(){
        return super.toString() + " (length) " + length + " and (width) " + width;
    }
}
