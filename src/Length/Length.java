package Length;

public class Length {

    private float distance;
    private float baseComparator;

    public Length(float distance, float baseComparator) {
        this.distance = distance;
        this.baseComparator = baseComparator;
    }

    public float add(Length other) {
        return this.convertToInch() + other.convertToInch();
    }

    public float convertToInch() {
        return this.distance * this.baseComparator;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        Length length = (Length) other;
        return Float.compare(length.convertToInch(), this.convertToInch()) == 0;
    }
}

//12 inches = 1 Feet
//36 inches = 1 Yard
//63360 inches = 1 mile