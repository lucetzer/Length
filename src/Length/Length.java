package Length;

public class Length {

    private double distance;

    public Length(int distance) {
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
