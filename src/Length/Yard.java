package Length;

public class Yard extends Length {

    int ONE_LENGTH_IN_YARD = 1760;

    public Yard(int distance) {
        super(distance);
    }

    @Override
    public boolean equals(Object o) {

        if (o.getClass() == Length.class) {
            System.out.println(this.getDistance());

            return ((Length) o).getDistance() == this.getDistance() / ONE_LENGTH_IN_YARD;
        }

        Length  length = (Length) o;
        return this.getDistance() == length.getDistance();
    }

}

