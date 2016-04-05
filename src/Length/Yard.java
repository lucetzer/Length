package Length;

public class Yard extends Length {

    int ONE_LENGTH_IN_YARD = 1760;

    public Yard(double distance) {
        super(distance);
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == Length.class)
            return ((Length) o).getDistance() == this.getDistance() / ONE_LENGTH_IN_YARD;
        return super.equals(o);
    }

}

