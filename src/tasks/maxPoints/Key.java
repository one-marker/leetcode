package tasks.maxPoints;

import java.util.Objects;

class Key {
    private double k;
    private int b;
    private int x;


    public Key(double k, int b, int x) {
        this.k = k;
        this.b = b;
        this.x = x;

    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Double.compare(key.k, k) == 0 &&
                b == key.b &&
                x == key.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, b, x);
    }

    @Override
    public String toString() {
        return "Key{" +
                "k=" + k +
                ", b=" + b +
                ", x=" + x +
                '}';
    }
}