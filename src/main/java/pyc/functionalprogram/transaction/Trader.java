package pyc.functionalprogram.transaction;

/**
 * @author pi
 * @date 2020/8/11 11:27:24
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String n, String c) {
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader:" +
                this.name + " in " +
                this.city + '\'';
    }
}
