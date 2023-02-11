public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    public Rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        this.width = w;
        this.length = l;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width=%.2f and length=%.2f, which is a subclass of %s",
                this.width, this.length,
                super.toString());
    }
}
