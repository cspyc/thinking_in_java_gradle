package pyc.ch16.exercise.array;

/**
 * @author pyc
 */
public class BerylliumSphere {
    private static long counter;

    private  long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BerylliumSphere() {
    }

    public BerylliumSphere(long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Sphere-" + id;
    }
}
