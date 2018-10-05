package hometask2;

public class Coordinates {
    private double x;
    private double y;

    public Coordinates() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanceTo(double x1, double y1) {
        return Math.sqrt((this.x - x1) * (this.x - x1) +
                         (this.y - y1) * (this.y - y1));
    }

    public static double getDistanceBetween(Coordinates point1, Coordinates point2) {
        return Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) +
                         (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
    }

    private double getInclinationOfLine(double x, double y) { // угол наклона прямой
        if (this.y != y) {
            return (this.x - x) /
                    (this.y - y);
        } else {
            System.out.println("Error in denominator");
            return -1;
        }
    }

    private double getFreeOfLine(double x, double y) { //свободный коэффициент
        return (this.y - getInclinationOfLine(x, y) * this.x);
    }

    public void getEquationOfLine(double x, double y) {
        System.out.println(getInclinationOfLine(x, y) + " * x + " + getFreeOfLine(x, y));
    }

    public Coordinates getMiddle(double x, double y) {
        double mid_x = (this.x + x) / 2;
        double mid_y = (this.y + y) / 2;
        return new Coordinates(mid_x, mid_y);
    }

    private double radiusOfCircle(double x, double y) {
        return getDistanceTo(x, y) / 2;
    }

    private Coordinates centerOfCircle(double x, double y) {
        return getMiddle(x, y);
    }

    public void getCircle(double x, double y, double circleX, double circleY, double radiusX, double radiusY) {
        Coordinates center = this.centerOfCircle(circleX, circleY);
        System.out.print("( x - (" +  center.getX() + "))^2  + "
                                   + "( y - (" + center.getY()
                                   + "))^2 = ");
        System.out.printf("%.2f ^2%n", this.radiusOfCircle(radiusX, radiusY));
    }
}

