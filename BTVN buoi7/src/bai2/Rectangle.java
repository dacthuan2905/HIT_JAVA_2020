package bai2;

public class Rectangle implements IShape{
    private double width;
    private double lenght;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    @Override
    public double getArea(){
        return width * lenght;
    }
    @Override
    public double getPerimeter(){
        return (width + lenght ) * 2;

    }
}
