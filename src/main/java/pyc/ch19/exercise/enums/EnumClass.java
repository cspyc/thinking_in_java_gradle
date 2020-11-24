package pyc.ch19.exercise.enums;

/**
 * @author pi
 */
public class EnumClass {
    public Shrubbery getEnumElement(int position) {
        Shrubbery[] shrubberies = Shrubbery.values();
        return shrubberies[position];
    }
}
