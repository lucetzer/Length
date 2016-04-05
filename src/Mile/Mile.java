package Mile;

public class Mile {

    private int length;

    public Mile(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {

        Mile mile = (Mile) o;
        return length == mile.length;
    }



}
