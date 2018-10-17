package pl.waw.sgh;

public class Rectangle {
    double length;
    double high;

    public Rectangle( double length, double high){
        this.length = length;
        this.high = high;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
