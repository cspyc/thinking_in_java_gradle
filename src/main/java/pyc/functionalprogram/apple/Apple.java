package pyc.functionalprogram.apple;


import pyc.functionalprogram.apple.constants.Constants;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author pi
 */
public class Apple {
    private String color;
    private Double weight;

    public Apple() {
    }

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public Boolean isGreen() {
        return this.color.equals(Constants.GREEN_APPLE_COLOR);
    }

    public Boolean isHeavierThan(Double weight) {
        return this.weight > weight;
    }

    public Boolean identityAppleColor(String color) {
        boolean result = false;
        if (null != color && this.getColor().equals(color)) {
            result = true;
        }
        return result;
    }
    public static String processFile() throws Exception{
        try(BufferedReader bufferedReader =
                new BufferedReader(new FileReader("data.txt"))){
            return bufferedReader.readLine();
        }
    }
}
