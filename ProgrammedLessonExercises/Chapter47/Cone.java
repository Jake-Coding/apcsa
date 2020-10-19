import java.util.*;

public class Cone {
    double height;
    double radius;
    public Cone (double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * (radius * this.slantHeight());
    }
    public double volume() {
        return Math.PI * radius * radius * height / 3.0;
    }
    public double slantHeight() {
        return Math.sqrt((radius * radius) + (height * height));
    }
    public double angle() {
        return Math.atan(radius/height);
    }

    public void setHeight(double height) {
        if (height >= 0) this.height = height;
    }

    public void setRadius(double radius) {
        if (radius >= 0) this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
}