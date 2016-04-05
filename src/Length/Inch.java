package Length;

public class Inch extends Length {

    int ONE_FEET_IN_INCHES = 12;


    public Inch(double distance) {
        super(distance);
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == Feet.class)
            return ((Feet) o).getDistance() == this.getDistance() / ONE_FEET_IN_INCHES;
        return super.equals(o);
    }


}
