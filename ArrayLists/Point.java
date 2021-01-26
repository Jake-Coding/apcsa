public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point() {
        this(0,0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getx() {return x;}
    public double gety() {return y;}

    public static Point getMid(Point a, Point b) {
        return new Point(((a.getx() + b.getx())/2), (a.gety() + b.gety())/2);
    }

    public double getToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int compareTo(Point e) {
        return (int) (getToOrigin() - ((Point) e).getToOrigin());

    }
    
}