package bai2;

public class Circle implements IShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 2*radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return Math.PI * Math.pow(radius,2);
    }
}
