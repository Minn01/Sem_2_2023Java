/*
Name : Min Thant
ID : 6612012
Section : 544
 */
package classEx6;

import java.util.Random;

public class Dice {
    private int sides;
    private Random random;

    public Dice(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides should be greater than zero");
        }
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }

    public void setSides(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides should be greater than zero");
        }
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }
}
