package Length;

public class Feet extends Length {

    double ONE_YARD_IN_FEET = 3;

    public Feet(double distance) {
        super(distance);
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == Yard.class)
            return ((Yard) o).getDistance() == this.getDistance() / ONE_YARD_IN_FEET;
        return super.equals(o);
    }

}
