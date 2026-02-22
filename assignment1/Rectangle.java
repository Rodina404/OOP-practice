public class Rectangle {
    private double length=1.0;
    private double width=1.0;


    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Width: " + width + 
               ", Length: " + length + 
               ", Area: " + getArea() + 
               ", Perimeter: " + getPerimeter();
    }

}
