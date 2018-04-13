package homework3;

import java.text.DecimalFormat;

public class Round {

    private double radius;
    private final DecimalFormat df = new DecimalFormat("#.000");

    public Round(double radius) {
        this.radius = radius;
    }

    public String getGirth() {
        return df.format(2.0 * Math.PI * radius);
    }

    public String getArea() {
        return df.format(Math.PI * radius * radius);
    }

}
