package Length;

public class Length {

    private double distance;

    public Length(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {

        Length  length = (Length) o;
        return distance == length.distance;
    }
}
