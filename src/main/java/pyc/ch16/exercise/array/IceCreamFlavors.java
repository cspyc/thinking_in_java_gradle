package pyc.ch16.exercise.array;

/**
 * @author pi
 */

public enum IceCreamFlavors {

    CHOCOLATE("Chocolate"),
    STRAWBERRY("Strawberry"),
    VANILLA_FUDGE_SWIRL("Vanilla Fudge Swirl"),
    MINT_CHIP("Mint chip"),
    MOCHA_ALMOND_FUDGE("Mocha Almond Fudge"),
    RUM_RAISIN("Rum Raisin"),
    PRALINE_CREAM("Praline Cream"),
    MUD_PIE("Mud Pie");

    public String enumValue;

    private IceCreamFlavors(String enumValue) {
        this.enumValue = enumValue;
    }

    private String getEnumValue(){
        return enumValue;
    }

    @Override
    public String toString() {
        return enumValue;
    }
}
